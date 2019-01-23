package graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
/**
 * Esta clase define como se van a cargar las imagenes en el buffer de datos  
 * @author Rodrigo Pascual Arnaiz
 * @version 21/01/2019
 */
public class CargaImagenes {
	/**
	 * El metodo se encarga de cargar la imagenes pasadas por parametro en un <b>BufferedImage</b> y luego retornarlo
	 * @throws IOException
	 * @return BufferedImage que es el buffer en el que se encuentra la imagen cargada 
	 * @param url es de tipo String, el cual se usa para ruta de el archivo 
	 */
	public BufferedImage cargaImagenesEnBuffer(String url){
		BufferedImage eso = null;
		try {
			//eso = ImageIO.read(CargaImagenes.class.getResource(url));
			eso = ImageIO.read(getClass().getResource(url));
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		return eso;
	}
}
