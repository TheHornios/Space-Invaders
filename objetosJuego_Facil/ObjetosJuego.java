package objetosJuego_Facil;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import logica.Vector2D;
/**
 * Esta clase abstracta define los metodos que deven implemetar todos lod objetos del juego
 * @author Rodrigo Pascual Arnaiz
 * @version 21/01/2019
 */
public abstract class ObjetosJuego {
	protected BufferedImage textura;
	protected Vector2D posicion;
	protected boolean izquierda;
	protected boolean derecha;
	/**
	 * Constructor que inicializa las variables con los parmetros pasados 
	 * @param a de tipo Vector2D
	 * @param b de tipo BufferedImage
	 */
	public ObjetosJuego(Vector2D a,BufferedImage b){
		textura = b;
		posicion = a;
	}
	/**
	 * Este metodo es el que heredaran las demas clases que se extiendan de <b>ObjetosJuego</b>, este metodo se encarga de la actulizacion de los datos 
	 */
	public abstract void update();
	/**
	 * Este metodo sera heredado por las clases que se extiendan de <b>ObjetosJuego</b>, este metodo se encarga del dibujo en la pantalla 
	 * @param g
	 */
	public abstract void draw(Graphics g);
	/**
	 * Este metodo retorna un objeto de <b>Vector2D</b>
	 * @return Vector2D
	 * @see logica.Vector2D
	 */
	public Vector2D getPosicion() {
		return posicion;
	}
	/**
	 * Este metodo se utiliza para asignar un objeto de <b>Vector2D</b>
	 * @param posicion de tipo Vector2D
	 * @see logica.Vector2D
	 */
	public void setPosicion(Vector2D posicion) {
		this.posicion = posicion;
	}
	
}
