package logica;

/**
 * Esta clase define un vector que contene el eje Y e X
 * @author Rodrigo Pascual Arnaiz
 * @version 21/01/2019
 */
public class Vector2D {
	private double x;
	private double y;
	/**
	 * Constructor con dos parametros que el primero es el eje X y el segundo es el eje Y
	 * @param x de tipo double
	 * @param y de tipo double
	 */
	public Vector2D(double x,double y){
		this.x = x;
		this.y = y;
	}
	/**
	 * Constructor sin parametros que inicializa a 0 el eje X e Y 
	 */
	public Vector2D(){
		x = 0;
		y = 0;
	}
	/**
	 * Este metodo retorna la variable del eje X
	 * @return double
	 */
	public double getX() {
		return x;
	}
	/**
	 * Es el metodo set del eje X
	 * @param x de tipo double
	 */
	public void setX(double x) {
		this.x = x;
	}
	/**
	 * Este metodo retorna la variable del eje Y
	 * @return double
	 */
	public double getY() {
		return y;
	}
	/**
	 * Es el metodo set del eje Y
	 * @param y de tipo double
	 */
	public void setY(double y) {
		this.y = y;
	}
	
}
