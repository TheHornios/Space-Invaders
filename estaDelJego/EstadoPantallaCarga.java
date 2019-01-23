package estaDelJego;

import graficos.Assets;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.IOException;
import java.io.InputStream;

import ventanas.Ventana;
/**
 * Esta clase extiende de Estado y define la pantalla de carga y como se cargan los datos en memoria Ram 
 * @author Rodrigo Pascual Arnaiz
 * @version 21/01/2019
 */
public class EstadoPantallaCarga extends Estado{
	private Thread hiloCarga;
	private Font font;
	/**
	 * Constructor que inicializa la variable <b>hiloCarga</b> con t y le manda iniciar el hilo 
	 * @param t de tipo Thread
	 */
	public EstadoPantallaCarga(Thread t){
		hiloCarga = t;
		hiloCarga.start();
	}
	/**
	 * Metodo heredado de Estado, este metodo si la variable <b>cargado de la clase Assets</b> es true el metodo cambia de estado utilizando el metodo
	 * <b>setEstado() de la clase Estado</b>, el nuevo estado cargado sera <b>EstadoMenu()</b>, variable cargado de la clase Assets sera true cuando todos los 
	 * Assets serean cargados en memoria 
	 * @see estaDelJego.Estado
	 * @see estaDelJego.EstadoMenu
	 * @see estaDelJego.Estado#setEstado(Estado)
	 * @see graficos.Assets#cargado
	 */
	@Override
	public void update() {
		if(Assets.cargado){
			Estado.setEstado(new EstadoMenu()); //menu
			try {
				hiloCarga.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * Metodo heredado de Estado, que crea una pantalla con una barra que difumina de blanco a verde segun el numero de Assets cargados 
	 * esto lo podemos saber con la variable cantidadCargado de la clase Assets, ademas he añadido una font para escribir en la pantalla 
	 * la palabra 'Cargando...'
	 * @param g de tipo Graphics
	 * @see graficos.Assets#cantidadCargado
	 */
	@Override
	public void draw(Graphics g) {
		GradientPaint gp = new GradientPaint(Ventana.ancho/2-100,Ventana.alto/2-20,Color.WHITE,Ventana.ancho/2+100,Ventana.alto/2+20,Color.green);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setPaint(gp);
		float porcentaje = (Assets.cantidadCargado/Assets.maximaCantidadReculsos);
		
		g2d.fillRect(Ventana.ancho/2-100,Ventana.alto/2-20,(int)(200*porcentaje), 40);
		
		g2d.drawRect(Ventana.ancho/2-100,Ventana.alto/2-20,200, 40);
		
		
		InputStream FontToRara = this.getClass().getResourceAsStream("/fonts/kenvector_future.ttf");
		try {
			font = Font.createFont(Font.TRUETYPE_FONT,FontToRara ).deriveFont(34f);;
			
		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		g2d.setFont(font);
		g2d.setRenderingHint( RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB );
		g2d.setColor(Color.GREEN);
		g2d.drawString("Cargando...",Ventana.ancho/2-100,Ventana.alto/2-50);
	}

}
