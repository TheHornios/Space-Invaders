package ventanas;

import estaDelJego.Estado;
import estaDelJego.EstadoPantallaCarga;
import graficos.Assets;
import imput.Raton;
import imput.Teclado;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
/**
 * Esta clase define la <b>creacion de la ventana en JFrame</b> a la que le es añadida canvas ademas esta clase se encarga de generar <b>los hilos</b> necesarios para funcionar,
 * ademas es la clase en la que se encuentra el <b>main</b>. Tambien la clase se encarga de generar un  <b>limitador de FPS</b> 
 * @author Rodrigo Pascual Arnaiz
 * @version 21/01/2019
 */
public class Ventana extends JFrame implements Runnable{
	/*Atributos
	 * */
	private static final long serialVersionUID = 5140474918757666171L;
	private Canvas canvas;
	private Thread thread;
	public static final int ancho = 700;
	public static final int alto = 800;
	private boolean si;
	private BufferStrategy bs;
	private Graphics g;
	
	private final int FPS=60;
	private double objetivoFPS = 100000000/FPS;
	private double delta = 0;
	private int promedioFps = FPS;
	
	private Teclado teclado;
	private Raton raton;
	/**
	 * Constructor sin parametros que se encarga de inicializar todas las variables con sus datos necesarios para el funcionamiento del juego 
	 */
	//@param
	// @return
	public Ventana(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Marcianitos");
		setSize(ancho,alto);
		setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		teclado = new Teclado();
		raton = new Raton();
		
		canvas= new Canvas();									//Libreria para jeugos 
		canvas.setPreferredSize(new Dimension(ancho,alto));		//Dimensiones de la ventana
		canvas.setMaximumSize(new Dimension(ancho,alto));		
		canvas.setMinimumSize(new Dimension(ancho,alto));
		canvas.setFocusable(true);								//Entradas teclado 
		add(canvas);
		canvas.addKeyListener(teclado);
		canvas.addMouseListener(raton);
		canvas.addMouseMotionListener(raton);
		si=false;
		
	}
	/**
	 * Metodo <b>main</b> se encarga de ejecutar el metodo startIlo()
	 * @see ventanas.Ventana#startIlo()
	 * @param String[]
	 */
	public static void main(String[] args) {
		new Ventana().startIlo();
	}
	/**
	 * Este metodo se encarga de crear un hilo de procesos, ese hilo va a ejecutar el metoto <b>init() de la clase Assets</b> despues ejecuta 
	 * el metodo <b>setEstado() de la clase Estado</b> pasandole por parametro el EstadoPantallaCarga()
	 * @see graficos.Assets#init()
	 * @see estaDelJego.Estado#setEstado(Estado)
	 * @see estaDelJego.EstadoPantallaCarga#EstadoPantallaCarga(Thread)
	 */
	public void init(){
		Thread hiloDeCarga = new Thread(new Runnable() {
			@Override
			public void run() {
				Assets.init();
			}
		});
			
		Estado.setEstado(new EstadoPantallaCarga(hiloDeCarga));
		
	}
	/**
	 * El metodo update es el metodo que se va a encargar de actualizar los datos cada FPS este metodo actualiza el metodo <b>update() de la case Teclado</b>
	 * y el metodo <b>getEstado().update() de la case Estado</b>
	 * @see estaDelJego.Estado#update()
	 * @see imput.Teclado#update()
	 */
	public void update(){
		teclado.update();
		Estado.getEstado().update();
	}
	/**
	 * El metodo draw se encarga de dibujar en pantalla cada FPS los datos, para dibujar utiliza <b>Canvas y Graphics</b>, este metodo primero dibuja en pantalla y luego 
	 * borra todo el contenido asi se consigue el efecto de que las imagenes se pueden mover en la pantalla 
	 * @see estaDelJego.Estado#draw(Graphics)
	 */
	public void draw(){
		bs=canvas.getBufferStrategy();
		if(bs==null){
			canvas.createBufferStrategy(3);
			draw();
		}
		g =  bs.getDrawGraphics();
		//------------------------------------
		
		//g.clearRect(0, 0, ancho, alto);
		g.setColor(Color.black);
		g.fillRect(0,0, ancho, alto);
		
		
		Estado.getEstado().draw(g);
		g.setColor(Color.white);
		g.drawString("FPS: "+promedioFps,0, 20);
		
		
		//------------------------------------
		g.dispose();
		bs.show();
	}
	/**
	 * Este metodo se encarga de generar un bucle infinito este metodo es ejecutado por <b>startIlo()</b> este metodo es un bucle infinito que se ejecuta hasta que el 
	 * programa se le manda finalizar el hilo <b>stopIlo()</b>, ademas este metodo se encarga de limitar el numero de calculos de la CPU a 60 FPS y ejecuta el metodo<b> init()</b>.
	 * Tambien este metodo ejecuta <b>update(), draw()</b> cada FPS generado
	 * @see ventanas.Ventana#startIlo()
	 * @see ventanas.Ventana#stopIlo()
	 * @see ventanas.Ventana#init()
	 * @see ventanas.Ventana#update()
	 * @see ventanas.Ventana#draw()
	 */
	public void run() {
		
		long ahora=0;
		long ultimaHora = System.nanoTime();
		int frame = 0;
		long time = 0;
		init();
		
		while(si) {
			ahora = System.nanoTime();
			delta += (ahora-ultimaHora)/objetivoFPS;
			time += (ahora-ultimaHora);
			ultimaHora = ahora;
			if(delta>=1){
				update();
				draw();
				delta--;
				frame++;
			}
			if(time >=100000000){
				promedioFps = frame;
				frame = 0;
				time = 0;
			}
		}
		stopIlo();
	}
	/**
	 * El metodo draw startIlo se encarga de crear y ejecutar el hilo principal del programa, ademas hace que el bucle principal del programa se ejecute indefinidamente
	 * <b>run()</b>
	 * @see ventanas.Ventana#run()
	 */
	public void startIlo(){
		thread = new Thread(this);
		thread.start();
		si=true;
	}
	/**
	 * El metodo stopIlo este metodo se encarga de finalizar el hilo principal creado por <b>startIlo</b>, ademas finaliza el bucle principal del programa  
	 * @see ventanas.Ventana#startIlo()
	 * @throws InterruptedException puede thowear
	 */
	public void stopIlo(){
		try {
			thread.join();
			si=false;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
