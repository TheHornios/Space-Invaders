package objetosJuego_Normal;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import estaDelJego.EstadoJuego_Normal;
import logica.Vector2D;
/**
 * Esta clase define como se crean, funcionan y dibujan los parapetos que extiende de ObjetosJuego
 * @author Rodrigo Pascual Arnaiz
 * @version 21/01/2019
 */
public class Parapeto extends ObjetosJuego{
	private int vidas;
	private EstadoJuego_Normal estadoJuego;
	private BufferedImage textura1;
	private BufferedImage textura2;
	private BufferedImage textura3;
	/**
	 * Constructor que inicializa todas la variables de la clase 
	 * @param a de tipo Vector2D
	 * @param b de tipo BufferedImage
	 * @param d de tipo EstadoJuego_Dificil
	 * @param z de tipo BufferedImage
	 * @param w de tipo BufferedImage
	 * @param y de tipo BufferedImage
	 */
	public Parapeto(Vector2D a, BufferedImage b,EstadoJuego_Normal d,BufferedImage z,BufferedImage w,BufferedImage y) {
		super(a, b);
		vidas =4;
		estadoJuego = d;
		textura1 = z;
		textura2 = w;
		textura3 =y;
	}
	/**
	 *  Este metodo actualiza el estado de los parapetos, calcula si algun objeto de <b>DisparoMarcianos y de DisparoNave</b> se choca con el parapeto, si se choca la vida de este parapeto
	 *  disminuye en uno, ademas si un objeto <b> Marcianos</b> se choca conta algun parapeto los parapetos pasan a tener vidas 0
	 *  @see EstadoJuego_Normal.DisparoNave
	 *  @see EstadoJuego_Normal.DisparosMarcianos
	 *  @see EstadoJuego_Normal.Marcianos
	 */
	public void update() {
		if(vidas>0){
			ObjetosJuego w = null;
			for(int i = 0;i <estadoJuego.getObjetosMarcianos().size(); i++){
				if(estadoJuego.getObjetosMarcianos().get(i).getPosicion().getX()>=posicion.getX()&&estadoJuego.getObjetosMarcianos().get(i).getPosicion().getX()<=posicion.getX()+17
						&&estadoJuego.getObjetosMarcianos().get(i).getPosicion().getY()>=posicion.getY()){
					w = estadoJuego.getObjetosMarcianos().get(i);
					vidas --;
				}
				estadoJuego.getObjetosMarcianos().remove(w);
			}
			for(int i = 0;i <estadoJuego.getObjetosNave().size(); i++){
				if(estadoJuego.getObjetosNave().get(i).getPosicion().getX()>=posicion.getX()&&estadoJuego.getObjetosNave().get(i).getPosicion().getX()<=posicion.getX()+17
						&&estadoJuego.getObjetosNave().get(i).getPosicion().getY()<=posicion.getY()){
					w = estadoJuego.getObjetosNave().get(i);
					vidas --;
				}
				estadoJuego.getObjetosNave().remove(w);
			}
			for(Marcianos m:estadoJuego.getMarcianos()){
				if(m.getPosicion().getY()+36>=getPosicion().getY()){
					vidas = 0;
				}
			}
		}
		
	}
	/**
	 * Este metodo dibuja el parapeto dependiendo del cantidad de vidas, dependiendo de la canatidad de vidas
	 * se printea una imagen o otra
	 * @param g de tipo Graphics
	 */
	public void draw(Graphics g) {
		if(vidas == 4){
			g.drawImage(textura,(int)posicion.getX(),(int)posicion.getY(),null);
		}
		if(vidas == 3){
			g.drawImage(textura1,(int)posicion.getX(),(int)posicion.getY(),null);
		}
		if(vidas == 2){
			g.drawImage(textura2,(int)posicion.getX(),(int)posicion.getY(),null);
		}
		if(vidas == 1){
			g.drawImage(textura3,(int)posicion.getX(),(int)posicion.getY(),null);
		}
	}
	/**
	 * Este metodo retorna las vidas de los parapetos 
	 * @return vidas
	 */
	public int getVidas() {
		return vidas;
	}

}
