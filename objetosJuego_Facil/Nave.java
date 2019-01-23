package objetosJuego_Facil;

import graficos.Assets;
import imput.Teclado;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import ventanas.Ventana;
import estaDelJego.EstadoJuego_Facil;
import logica.Vector2D;
/**
 * Esta clase extentida por ObjetosJuego define los objetos nave
 * @author Rodrigo Pascual Arnaiz
 * @version 21/01/2019
 */
public class Nave extends ObjetosJuego{
	private EstadoJuego_Facil estadoJuego;
	private long tiempo;
	private long ultimoTiempo;
	private int vidas;
	private boolean morir;
	private long tiempo2;
	private long ultimoTiempo2;
	/**
	 * Constructor que inicializa las variables con los parametros 
	 * @param a de tipo Vector2D
	 * @param b de tipo BufferedImage
	 * @param e de tipo EstadoJuego_Dificil
	 */
	public Nave(Vector2D a, BufferedImage b,EstadoJuego_Facil e) {
		super(a, b);
		this.estadoJuego =e;
		tiempo=1000;
		ultimoTiempo = System.currentTimeMillis();

		tiempo2 = 1200;
		ultimoTiempo2= System.currentTimeMillis();
		vidas = 4;
		morir = false;
	}
	/**
	 *Metodo es heredado de la case <b>ObjetosJuego</b>, Este metodo es el que se encrga de actualizar la nave, en este metodo detectamos si estas pulsando la tecla izquierda o derecha
	 *gracias a las variables <b>derecha e izquierda</b> de la calse Teclado, dependiendo de que tecla sea se mueva para un lado o para otro, ademas si pulsamos la tecla espacio, se creara un 
	 *objeto de clase<b> DisparoNave()</b> con la posicion de la nave, tambien si un objeto de estadoJuego toca la nave pierde una vida excepto los objetos de clase Marcianos que te quitan todas de golpe 
	 *@see EstadoJuego_Facil.DisparoNave
	 *@see EstadoJuego_Facil.DisparosMarcianos
	 *@see imput.Teclado#derecha
	 *@see imput.Teclado#izquierda
	 *@see imput.Teclado#disparar
	 */
	public void update() {
		tiempo += System.currentTimeMillis() - ultimoTiempo;
		ultimoTiempo = System.currentTimeMillis();
		if(vidas>0){
			for(Marcianos m:estadoJuego.getMarcianos()){
				if(m.getPosicion().getY()>=650){
					vidas=1;
					morir=true;
					vidas--;
				}
			}
			
			if(Teclado.disparar && tiempo>1500){
				estadoJuego.getObjetosNave().add(new DisparoNave(getCentre(),Assets.disparoNave1,Assets.disparoNave2));
				tiempo = 0;
			}
			
			ObjetosJuego w = null;
			for(int i = 0;i <estadoJuego.getObjetosMarcianos().size(); i++){
				if(estadoJuego.getObjetosMarcianos().get(i).getPosicion().getX()>=posicion.getX()&&estadoJuego.getObjetosMarcianos().get(i).getPosicion().getX()<=posicion.getX()+58
						&&estadoJuego.getObjetosMarcianos().get(i).getPosicion().getY()>=posicion.getY()&&estadoJuego.getObjetosMarcianos().get(i).getPosicion().getY()<=posicion.getY()+36){
					vidas --;
					morir=true;
					w = estadoJuego.getObjetosMarcianos().get(i);
				}
				estadoJuego.getObjetosMarcianos().remove(w);
			}
			if(Teclado.derecha){
				if(posicion.getX()+60<Ventana.ancho-10){
					posicion.setX(posicion.getX()+0.4);
				}
				
			}
			if(Teclado.izquierda){
				if(posicion.getX()>10){
					posicion.setX(posicion.getX()-0.4);
				}
				
			}
		}
	}
	/**
	 * Este metodo es heredado de la case <b>ObjetosJuego</b>, este metodo se encarga de dibujar la nave si mueres llama al metodo <b>animacionMorir()</b>
	 * @param g de tipo Graphics
	 * @see graficos.Assets
	 * @see objetosJuego_Dificil.ObjetosJuego
	 * @see objetosJuego_Dificil.Nave#animacionMorir(Graphics)
	 */
	public void draw(Graphics g) {
		tiempo2 += System.currentTimeMillis() - ultimoTiempo2;
		ultimoTiempo2 = System.currentTimeMillis();
		if(morir==true&&vidas>=0){
			posicion.setX(85);
			animacionMorir(g);
		}else{
			if(vidas>0&&morir==false){
				g.drawImage(textura,(int)posicion.getX(),(int)posicion.getY(),null);
				morir = false;
			}
		}
		
		
		
	}
	/**
	 * Este metodo se encarga de generar la animacion de muerte de las naves, para l animacion de muerte cada 200 milisegundos cambio la imagen de muerte en el aultima imagen de la 
	 * animacion le bajo a la nave una vida, para poner las imagenes en pantalla uso los atributos de la case Assets
	 * @see graficos.Assets
	 * @param g de tipo Graphics
	 */
	public void animacionMorir(Graphics g){
		if(tiempo2>1400){
			tiempo2 = 0;
		}
		if(tiempo2<200&&morir){
			g.drawImage(Assets.nave_morir_1,(int)posicion.getX(),(int)posicion.getY(),null);
		}
		if(tiempo2>200&&tiempo2<400&&morir){
			g.drawImage(Assets.nave_morir_2,(int)posicion.getX(),(int)posicion.getY(),null);
		}
		if(tiempo2>400&&tiempo2<600&&morir){
			g.drawImage(Assets.nave_morir_3,(int)posicion.getX(),(int)posicion.getY(),null);
		}
		if(tiempo2>600&&tiempo2<800&&morir){
			g.drawImage(Assets.nave_morir_1,(int)posicion.getX(),(int)posicion.getY(),null);
		}
		if(tiempo2>800&&morir){
			g.drawImage(Assets.nave_morir_2,(int)posicion.getX(),(int)posicion.getY(),null);
		}
		if(tiempo2>1000&&morir){
			g.drawImage(Assets.nave_morir_3,(int)posicion.getX(),(int)posicion.getY(),null);
			if(vidas==0){
				vidas--;
			}
		}
		if(tiempo2>1200&&morir){
			morir = false;	
		}
	}
	/**
	 * Este metodo retorna la un Vector2D que contiene la posicion de la nave 
	 * @return Vector2D
	 */
	public Vector2D getCentre(){
		return new Vector2D(posicion.getX()+60/2,posicion.getY()-15);
	}
	/**
	 * Este metodo se encarga de retornar las vidas de la nave
	 * @return int
	 */ 
	public int getVidas() {
		return vidas;
	}
	
}
