package objetosJuego_Normal;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import estaDelJego.EstadoJuego_Normal;
import graficos.Assets;
import logica.Vector2D;
/**
 * Esta clase extentida por ObjetosJuego define los objetos nave
 * @author Rodrigo Pascual Arnaiz
 * @version 21/01/2019
 */
public class Marcianos extends ObjetosJuego{
	private BufferedImage textura2;
	private long tiempo = 1600;
	private long tiempo2 = 0;
	private long ultimoTiempo2 = 0;
	private long tiempo3;
	private long ultimoTiempo3;
	private EstadoJuego_Normal estadoJuego;
	private int vidas2 = 2;
	private int ancho;
	private int puntuacion;
	/**
	 * Constructor que inicializa las variables con los parametros 
	 * @param a de tipo Vector2D
	 * @param b de tipo BufferedImage
	 * @param e de tipo BufferedImage
	 * @param d de tipo EstadoJuego_Dificil
	 * @param columna de tipo int
	 * @param ancho de tipo int
	 */
	public Marcianos(Vector2D a, BufferedImage b, BufferedImage e,EstadoJuego_Normal d,int columna,int ancho) {
		super(a, b);
		textura2 = e;
		estadoJuego = d;
		tiempo2= 0;
		this.ancho = ancho;
		if(ancho==58){
			puntuacion = 10;
		}
		if(ancho==52){
			puntuacion = 20;
		}
		if(ancho==46){
			puntuacion = 40;
		}
	}
	/**
	 * Metodo es heredado de la case <b>ObjetosJuego</b>, se encarga de actualizar el estado de los marcianos, dependiendo de el valor de la variable derecha o izquierda el marciano se mueve
	 * en una direccion o otra 10px cada 2000 milisegundos, ademas si un disparo de clase <b>DisparosNave</b> choca con un marciano el marciano pierde la vida 
	 * 
	 */
	public void update() {
		
		tiempo2 += System.currentTimeMillis()-ultimoTiempo2;
		ultimoTiempo2 = System.currentTimeMillis();
		
		ObjetosJuego w = null;
		for(int i = 0;i <estadoJuego.getObjetosNave().size(); i++){
			if(estadoJuego.getObjetosNave().get(i).getPosicion().getX()>=posicion.getX()&&estadoJuego.getObjetosNave().get(i).getPosicion().getX()<=posicion.getX()+ancho
					&&estadoJuego.getObjetosNave().get(i).getPosicion().getY()<=posicion.getY()&&estadoJuego.getObjetosNave().get(i).getPosicion().getY()>=posicion.getY()-38){
				w = estadoJuego.getObjetosNave().get(i);
				vidas2 --;
			}
			estadoJuego.getObjetosNave().remove(w);
			
		}
		
		if(tiempo2>tiempo){ //2000
			if(derecha){
				posicion.setX(posicion.getX()+10);
			}
			
			if(izquierda){
				posicion.setX(posicion.getX()-10);
			}
			tiempo2= 0;
		}
	}
	/**
	 * Metodo es heredado de la case <b>ObjetosJuego</b>,este metodo se encarga de dibujar los marcinanos en el pantalla, ademas cada 500 milisegundos cambia de imagen de los marcianos
	 * para crear la animacion, ademas si la variable vidas es igual a 0 se ejecuta una animacion de explosion, despues de la animacion de muerte el marciano deja de printearse, 
	 * tambien con un Math.random genero aleatoriamente los diapros de los marcianos usando la clase <b>currentTimeMillis</b>
	 * @param g de tipo Graphics
	 */
	public void draw(Graphics g) {
		tiempo3 += System.currentTimeMillis()-ultimoTiempo3;
		ultimoTiempo3 = System.currentTimeMillis();
		if(vidas2 == 2){
			if(tiempo3<500){
				g.drawImage(textura,(int)posicion.getX(),(int)posicion.getY(),null);
			}
			if(tiempo3>500){
				g.drawImage(textura2,(int)posicion.getX(),(int)posicion.getY(),null);
				
				int numero = (int)(Math.random()*10000)+1;
				if(ancho==46){
					if(10==numero||120==numero||11==numero||121==numero){
						estadoJuego.getObjetosMarcianos().add(new DisparosMarcianos(getCentre(),Assets.disparoMarcianos1, Assets.disparoMarcianos2));
					}
				}
				if(33==numero||100==numero){
					estadoJuego.getObjetosMarcianos().add(new DisparosMarcianos(getCentre(),Assets.disparoMarcianos1, Assets.disparoMarcianos2));
				}
			}
			if(tiempo3>1000){
				tiempo3 = 0;
			}
		}
		if(vidas2==1){
			if(tiempo3>1200){
				tiempo3 = 0;
			}
			if(tiempo3<500){
				g.drawImage(Assets.marciano1muerto1,(int)posicion.getX(),(int)posicion.getY(),null);
			}
			if(tiempo3>500){
				g.drawImage(Assets.marciano1muerto2,(int)posicion.getX(),(int)posicion.getY(),null);
				
			}
			if(tiempo3>1000){
				vidas2 --;
			}
		}
		
	}
	/**
	 * Este metodo retorna la un Vector2D que contiene la posicion de el marcianio 
	 * @return Vector2D
	 */
	public Vector2D getCentre(){
		return new Vector2D(posicion.getX()+52/2,posicion.getY()+30);
	}
	/**
	 * Este metodo nos deja cambiar del booleano de la variable derecha
	 * @param a de tipo boolean
	 */
	public void setDerecha(boolean a){
		derecha = a;
	}
	/**
	 * Este metodo nos deja cambiar del booleano de la variable izquierda
	 * @param a
	 */
	public void setIzquierda(boolean a){
		izquierda = a;
	}
	/**
	 * Este metodo retorna la variable tiempo 
	 * @return long
	 */
	public long getTiempo() {
		return tiempo;
	}
	/**
	 * Este metodo nos deja darle un nuevo valor a la variable tiempo 
	 * @param tiempo de tipo long
	 */
	public void setTiempo(long tiempo) {
		this.tiempo = tiempo;
	}
	/**
	 * Este metodo retorna la variable vidas 
	 * @return int
	 */
	public int getVidas2() {
		return vidas2;
	}
	/**
	 * Este metodo nos deja cambiar el valor de la variable vidas
	 * @param vidas de tipo int 
	 */
	public void setVidas3(int vidas) {
		this.vidas2 = vidas;
	}
	/**
	 * Este metodo retorna la variable tiempo3 
	 * @return long
	 */
	public long getTiempo3() {
		return tiempo3;
	}
	/**
	 * Este metodo nos permite modificar el valor de la variable tiempo3
	 * @param tiempo3
	 */
	public void setTiempo3(long tiempo3) {
		this.tiempo3 = tiempo3;
	}
	/**
	 * Este metodo retorna la variable puntuacion
	 * @return int
	 */
	public int getPuntuacion() {
		return puntuacion;
	}
	/**
	 * Este metodo nos permite modificar la variable puntuacion
	 * @param puntuacion de tipo int
	 */
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	
}
