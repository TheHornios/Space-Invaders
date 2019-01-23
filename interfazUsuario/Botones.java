package interfazUsuario;

import imput.Raton;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import logica.Vector2D;

import com.sun.javafx.geom.Rectangle;

import estaDelJego.Estado;
import estaDelJego.EstadoJuego_Dificil;
import estaDelJego.EstadoJuego_EsterEgg;
import estaDelJego.EstadoJuego_Facil;
import estaDelJego.EstadoJuego_Normal;
import estaDelJego.EstadoMenu;
/**
 * Esta clase define la creacion de botones con las imagenes que nosotros queramos
 * @author Rodrigo Pascual Arnaiz
 * @version 21/01/2019
 */
public class Botones {
	private BufferedImage clik1;
	private BufferedImage clik2;
	private boolean mouseDentro;
	private Rectangle colisiones;
	private int aciontBoton;
	private boolean borrarPts;
	private boolean ponerPts;
	/**
	 * Constructor de la clase con parametros
	 * @param clik1 de tipo BufferedImage, es la primera imagen del boton
	 * @param clik2 de tipo BufferedImage, es la segunda imagen del boton
	 * @param x de tipo int, es la posicion de x del boton
	 * @param y de tipo int, es la posicion de y del boton
	 * @param i de tipo int, sirve para indicarle que accion queremos que haga 
	 */
	public Botones(BufferedImage clik1,BufferedImage clik2,int x,int y,int i){
		this.clik1 = clik1;
		this.clik2 = clik2;
		colisiones= new Rectangle(x,y,clik2.getWidth(),clik2.getHeight());
		aciontBoton = i;
		borrarPts =false;
		ponerPts = false;
	}
	/**
	 * El metodo se encarga de actualizar los botones, primero detecta si el raton esta dentro del boton o esta fuera, dependiendo de esto <b>pondra</b> a mouseDentro true o  false
	 * para saber si el raton esta fuera utiliza las variables <b>X e Y</b> de la clase Raton, despues de esto su pulsamos el clik izquierdo hace una accion o otra, para sabes 
	 * si hacemos clik se usa la variable <b>BotonPresionadoIz</b> de la clase Raton y para saber la accion que realiza el boton utilizamos la variable <b>i</b> que hemos pasado por parametro 
	 * @see interfazUsuario.Botones#Botones(BufferedImage, BufferedImage, int, int, int)
	 * @see interfazUsuario.Botones#mouseDentro
	 * @see imput.Raton#X 
	 * @see imput.Raton#Y 
	 * @see imput.Raton#BotonPresionadoIz
	 */
	public void update(){
		if(colisiones.contains(Raton.X,Raton.Y)){
			mouseDentro = true;
		}else{
			mouseDentro = false;
		}
		if(mouseDentro&&Raton.BotonPresionadoIz && aciontBoton==0){
			System.exit(1);
		}
		if(mouseDentro&&Raton.BotonPresionadoIz && aciontBoton==1){
			Estado.setEstado(new EstadoJuego_Normal());
		}
		if(mouseDentro&&Raton.BotonPresionadoIz && aciontBoton==2){
			Estado.setEstado(new EstadoJuego_Facil());
		}
		if(mouseDentro&&Raton.BotonPresionadoIz && aciontBoton==3){
			Estado.setEstado(new EstadoJuego_Dificil());
		}
		if(mouseDentro&&Raton.BotonPresionadoIz && aciontBoton==4){
			Estado.setEstado(new EstadoJuego_EsterEgg());
		}
		if(mouseDentro&&Raton.BotonPresionadoIz && aciontBoton==5){
			borrarPts = true;
		}
		if(mouseDentro&&Raton.BotonPresionadoIz && aciontBoton==6){
			ponerPts = true;
		}
		if(mouseDentro&&Raton.BotonPresionadoIz && aciontBoton==7){
			Estado.setEstado(new EstadoMenu());
		}
	}
	/**
	 * Este metodo dibuja el boton en la pantalla, con las variables <b>clik2,clik1</b> hacemos que si el raton esta dentro del boton se vea una imagen y si esta
	 * fuera vemos la otra imagen, do de sabes si esta dentro o fuera lo hacemos con la <b>variable mouseDentro</b>
	 * @see interfazUsuario.Botones#clik1
	 * @see interfazUsuario.Botones#clik2
	 * @see interfazUsuario.Botones#mouseDentro
	 * @param g de tipo Graphics
	 */
	public void draw(Graphics g){
		if(mouseDentro){
			g.drawImage(clik2,colisiones.x,colisiones.y,null);
		}else{
			g.drawImage(clik1,colisiones.x,colisiones.y,null);
		}
	}
	/**
	 * El metodo retorna el eje X de el boton 
	 * @return int
	 */
	public int getX(){
		return colisiones.x;
	}
	/**
	 * Este metodo le añade el eje X e Y de un boton 
	 * @param x de tipo int 
	 * @param y de tipo int 
	 */
	public void setEjeXeY(int x,int y){
		colisiones.setBounds(x, y, clik2.getWidth(), clik2.getHeight());
	}
	/**
	 * El metodo retorna la variable <b>borrarPts</b>
	 * @return boolean
	 */
	public boolean isBorrarPts(){
		return borrarPts;
	}
	/**
	 * El metodo retorna la variable <b>ponerPts</b>
	 * @return boolean
	 */
	public boolean isPonerPts(){
		return ponerPts;
	}
	/**
	 * Metrodo que retorna la el centro de X y de Y de un boton 
	 * @return Vector2D 
	 * @see logica.Vector2D
	 */
	public Vector2D getCentre(){
		return new Vector2D((colisiones.x+30),(colisiones.y+10));
	}
}
