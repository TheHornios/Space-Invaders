package graficos;

import java.awt.image.BufferedImage;
/**
 * Esta clase define la carga de todos los <b>Assets (imagnes, fonts, txt, ...)</b> que se encuentran en disco a memoria ram, ademas esta clase tiene metodos para saber la cantidad de Assets cargados 
 * @author Rodrigo Pascual Arnaiz
 * @version 21/01/2019
 */
public class Assets {
	public static boolean cargado = false;
	public static float cantidadCargado = 0;
	public static float maximaCantidadReculsos = 79;
	
	public static BufferedImage vidas;
	public static BufferedImage score;
	
	public static BufferedImage nave;
	public static BufferedImage nave_morir_1;
	public static BufferedImage nave_morir_2;
	public static BufferedImage nave_morir_3;
	
	public static BufferedImage disparoNave1;
	public static BufferedImage disparoNave2;
	
	public static BufferedImage parapeto1;
	public static BufferedImage parapeto1_2;
	public static BufferedImage parapeto1_3;
	public static BufferedImage parapeto1_4;
	
	public static BufferedImage parapeto5;
	public static BufferedImage parapeto5_2;
	public static BufferedImage parapeto5_3;
	public static BufferedImage parapeto5_4;
	
	public static BufferedImage parapeto6;
	public static BufferedImage parapeto6_2;
	public static BufferedImage parapeto6_3;
	public static BufferedImage parapeto6_4;
	
	public static BufferedImage parapeto7;
	public static BufferedImage parapeto7_2;
	public static BufferedImage parapeto7_3;
	public static BufferedImage parapeto7_4;
	
	public static BufferedImage parapeto9;
	public static BufferedImage parapeto9_2;
	public static BufferedImage parapeto9_3;
	public static BufferedImage parapeto9_4;
	
	public static BufferedImage marciano1;
	public static BufferedImage marciano1_2;
	public static BufferedImage marciano2;
	public static BufferedImage marciano2_2;
	public static BufferedImage marciano3;
	public static BufferedImage marciano3_3;
	
	public static BufferedImage marciano1muerto1;
	public static BufferedImage marciano1muerto2;
	
	public static BufferedImage disparoMarcianos1;
	public static BufferedImage disparoMarcianos2;
	
	public static BufferedImage numero1;
	public static BufferedImage numero2;
	public static BufferedImage numero3;
	public static BufferedImage numero4;
	public static BufferedImage numero5;
	public static BufferedImage numero6;
	public static BufferedImage numero7;
	public static BufferedImage numero8;
	public static BufferedImage numero9;
	public static BufferedImage numero0;
	
	public static BufferedImage botonFacil1;
	public static BufferedImage botonFacil1_1;
	
	public static BufferedImage botonNormal1;
	public static BufferedImage botonNormal1_1;
	
	public static BufferedImage botonDificil1;
	public static BufferedImage botonDificil1_1;
	
	public static BufferedImage botonSalir1;
	public static BufferedImage botonSalir1_1;
	
	public static BufferedImage botonModos1;
	public static BufferedImage botonModos1_1;
	
	public static BufferedImage botonEsterEgg;
	public static BufferedImage botonEsterEgg2;
	public static BufferedImage sterEggExplosion;
	public static BufferedImage sterEgg2Explosion;
	public static BufferedImage sterEggMacrinaVolt;
	public static BufferedImage sterEggMuerte;
	public static BufferedImage sterEggMuerte1;
	public static BufferedImage sterEggMuerte2;
	
	public static BufferedImage botonBack1;
	public static BufferedImage botonBack_1;
	
	public static BufferedImage spaceInvaders;
	public static BufferedImage pts10;
	public static BufferedImage pts20;
	public static BufferedImage pts40;
	public static BufferedImage ronri;
	
	public static BufferedImage peder;
	public static BufferedImage ganar;
	public static BufferedImage goBack;
	public static BufferedImage goBack1;
	public static BufferedImage your1;
	public static BufferedImage your2;
	public static BufferedImage score2;
	
	public static CargaImagenes imagens= new CargaImagenes();;
	/**
	 * Este metodo es el que se encarga de crear los objetos <b>BufferedImage</b> que son necesarios para cargar en Ram las imagenes, para crear los objetos usamos el metodo <b>cargaImagnes(String)</b>, 
	 * pasando por parametro la ruta en un String 
	 * @see graficos.Assets#cargaImagnes(String)
	 * 
	 */
	public static void init(){
			ganar= cargaImagnes("/img/menu/win.png");
			score2= cargaImagnes("/img/score1.png");
			peder= cargaImagnes("/img/menu/lost.png");
			goBack= cargaImagnes("/img/menu/goBack1.png");
			goBack1= cargaImagnes("/img/menu/goBack.png");
			your1= cargaImagnes("/img/menu/your.png");
			your2= cargaImagnes("/img/menu/your1.png");
			
			sterEggMuerte= cargaImagnes("/img/EsterEgg/nave_1.png");
			sterEggMuerte1= cargaImagnes("/img/EsterEgg/nave_2.png");
			sterEggMuerte2= cargaImagnes("/img/EsterEgg/nave_3.png");
			sterEggMacrinaVolt= cargaImagnes("/img/EsterEgg/maciano1_2.png");
			sterEggExplosion= cargaImagnes("/img/EsterEgg/maciano1muerte_1.png");
			sterEgg2Explosion= cargaImagnes("/img/EsterEgg/maciano1muerte_2.png");
			
			botonBack1 = cargaImagnes("/img/menu/back.png");
			botonBack_1 = cargaImagnes("/img/menu/back1.png");
		
			botonModos1 = cargaImagnes("/img/menu/modos.png");
			botonModos1_1 = cargaImagnes("/img/menu/modos1.png");
			
			botonEsterEgg = cargaImagnes("/img/menu/maciano1.png");
			botonEsterEgg2 = cargaImagnes("/img/menu/nave.png");
			
			spaceInvaders = cargaImagnes("/img/menu/SpaceInvaders.png");
			pts10 = cargaImagnes("/img/menu/10pts.png");
			pts20 = cargaImagnes("/img/menu/20pts.png");
			pts40 = cargaImagnes("/img/menu/40pts.png");
			ronri = cargaImagnes("/img/menu/ronri.png");
			
			botonSalir1_1= cargaImagnes("/img/menu/sali1.png");
			botonSalir1 = cargaImagnes("/img/menu/sali.png");
			
			botonDificil1_1= cargaImagnes("/img/menu/dificil1.png");
			botonDificil1 = cargaImagnes("/img/menu/dificil.png");
			
			botonNormal1_1= cargaImagnes("/img/menu/nomal1.png");
			botonNormal1 = cargaImagnes("/img/menu/nomal.png");
			
			botonFacil1 = cargaImagnes("/img/menu/facil.png");
			botonFacil1_1 = cargaImagnes("/img/menu/facil1.png");
			
			vidas = cargaImagnes("/img/vidas.png");
			score = cargaImagnes("/img/score.png");
			
			nave = cargaImagnes("/img/nave.png");
			nave_morir_1 = cargaImagnes("/img/nave_1.png");
			nave_morir_2 = cargaImagnes("/img/nave_2.png");
			nave_morir_3 = cargaImagnes("/img/nave_3.png");
			
			disparoNave1 = cargaImagnes("/img/disparo1.png");
			disparoNave2 = cargaImagnes("/img/disparo2.png");
			
			parapeto1 = cargaImagnes("/img/1/parapeto1_2_3_4_8.png");
			parapeto1_2 = cargaImagnes("/img/1/parapeto1_2.png");
			parapeto1_3 = cargaImagnes("/img/1/parapeto1_3.png");
			parapeto1_4 = cargaImagnes("/img/1/parapeto1_4.png");
			
			parapeto5 = cargaImagnes("/img/5/parapeto5.png");
			parapeto5_2 = cargaImagnes("/img/5/parapeto5_2.png");
			parapeto5_3 = cargaImagnes("/img/5/parapeto5_3.png");
			parapeto5_4 = cargaImagnes("/img/5/parapeto5_4.png");
			
			parapeto6 = cargaImagnes("/img/6/parapeto6.png");
			parapeto6_2 = cargaImagnes("/img/6/parapeto6_2.png");
			parapeto6_3 = cargaImagnes("/img/6/parapeto6_3.png");
			parapeto6_4 = cargaImagnes("/img/6/parapeto6_4.png");
			
			parapeto7 = cargaImagnes("/img/7/parapeto7.png");
			parapeto7_2 = cargaImagnes("/img/7/parapeto7_2.png");
			parapeto7_3 = cargaImagnes("/img/7/parapeto7_3.png");
			parapeto7_4 = cargaImagnes("/img/7/parapeto7_4.png");
			
			parapeto9 = cargaImagnes("/img/9/parapet9.png");
			parapeto9_2 = cargaImagnes("/img/9/parapet9_2.png");
			parapeto9_3 = cargaImagnes("/img/9/parapet9_3.png");
			parapeto9_4 = cargaImagnes("/img/9/parapet9_4.png");
			
			marciano1 = cargaImagnes("/img/maciano1.png");
			marciano1_2 = cargaImagnes("/img/maciano1_2.png");
			marciano2 = cargaImagnes("/img/maciano2.png");
			marciano2_2 = cargaImagnes("/img/maciano2_2.png");
			marciano3 = cargaImagnes("/img/marciano3.png");
			marciano3_3 = cargaImagnes("/img/marciano3_3.png");
			
			marciano1muerto1 = cargaImagnes("/img/maciano1muerte_1.png");
			marciano1muerto2 = cargaImagnes("/img/maciano1muerte_2.png");
			
			disparoMarcianos1 = cargaImagnes("/img/disparo1mar.png");
			disparoMarcianos2 = cargaImagnes("/img/disparo2mar.png");
			
			numero1 = cargaImagnes("/img/numeros/1.png");
			numero2 = cargaImagnes("/img/numeros/2.png");
			numero3 = cargaImagnes("/img/numeros/3.png");
			numero4 = cargaImagnes("/img/numeros/4.png");
			numero5 = cargaImagnes("/img/numeros/5.png");
			numero6 = cargaImagnes("/img/numeros/6.png");
			numero7 = cargaImagnes("/img/numeros/7.png");
			numero8 = cargaImagnes("/img/numeros/8.png");
			numero9 = cargaImagnes("/img/numeros/9.png");
			
			numero0 = cargaImagnes("/img/numeros/0.png");
			cargado = true;
	}
	/**
	 * Este metodo se encarga de calcula la cantidad de imagenes que le pasamos por parametro y ademas ejecuta el metodo <b>cargaImagenesEnBuffer(String)</b>, el parametro sera el valor path
	 * @see graficos.CargaImagenes#cargaImagenesEnBuffer(String)
	 * @param path El parametro path define la ruta en la que se encuentra la imagen
	 */
	public static BufferedImage cargaImagnes(String path){
		cantidadCargado++;
		return imagens.cargaImagenesEnBuffer(path);
	}
	
}
