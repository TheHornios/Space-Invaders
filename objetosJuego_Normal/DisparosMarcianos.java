package objetosJuego_Normal;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import logica.Vector2D;
/**
 * Esta clase extentida por ObjetosJuego define como tienen que ser los disparos de los marcianos 
 * @author Rodrigo Pascual Arnaiz
 * @version 21/01/2019
 */
public class DisparosMarcianos extends ObjetosJuego{
	private BufferedImage textura2;
	private long tiempo;
	private long tiempoUltimo;
	/**
	 * Constructor que inicializa las variabes con 3 parametros 
	 * @param a de tipo Vector2D
	 * @param b de tipo BufferedImage
	 * @param c de tipo BufferedImage
	 */
	public DisparosMarcianos(Vector2D a, BufferedImage b,BufferedImage c ) {
		super(a, b);
		textura2 = c;
		tiempo = 0;
		tiempoUltimo = System.currentTimeMillis();
	}
	/**
	 * Metodo es heredado de la case <b>ObjetosJuego</b>, este metodo se actualiza la posicion de el disparo que aumenta el eje Y en 0,4 pixeles 
	 */
	@Override
	public void update() {
		posicion.setY(posicion.getY()+0.4);
	}
	/**
	 * Metodo es heredado de la case <b>ObjetosJuego</b>, este metodo cambia la imagen del disparo cada 300 milisegundos para dar la sensacion de animacion 
	 * @param g de tipo Graphics
	 */
	@Override
	public void draw(Graphics g) {
		tiempo += System.currentTimeMillis()-tiempoUltimo;
		tiempoUltimo = System.currentTimeMillis();
		if(tiempo<300){
			g.drawImage(textura,(int)posicion.getX(),(int)posicion.getY(),null);
		}
		if(tiempo>300){
			g.drawImage(textura2,(int)posicion.getX(),(int)posicion.getY(),null);
		}
		if(tiempo>600){
			tiempo = 0;
		}
	}

}
