package juego;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Background {

	

	
	public static Image cargarImagen (String imagePath) {
		
		Image im = null;
		try {
			im = ImageIO.read(new File(imagePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return im;
		
	}
	
}
