package estaDelJego;

import java.awt.Graphics;
/**
 * Esta clase <b>abstacta</b> define los metodos update y draw que tiene que tener las clases que extiendan de ella y ademas tiene dos metodos que sirven para saber el estado actual
 * y cambar de estado 
 * @author Rodrigo Pascual Arnaiz
 * @version 21/01/2019
 */
public abstract class Estado {
	private static Estado estadoactual = null;
	
	/**
	 * Este metodo reorna el estado actual 
	 * @return Estado
	 */
	public static Estado getEstado(){
		return estadoactual;
	}
	/**
	 * Este metodo nos deja cambiar el estado actual del programa usando el estado pasado por paramtro 
	 * @param e de tipo Estado
	 * @see estaDelJego.Estado
	 */
	public static void setEstado(Estado e){
		estadoactual = e;
	}
	/**
	 * Esta clase define que una clase que extienda de Estado debe tener este metodo 
	 */
	public abstract void update();
	/**
	 * Esta clase define que una clase que extienda de Estado debe tener este metodo 
	 * @param g de tipo Graphics
	 */
	public abstract void draw(Graphics g);
}
