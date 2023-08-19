package br.com.image;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ReducaoImagem {
	
	public static void redimensionarImagem(String caminhoImagemOriginal, String caminhoImagemNova, final int WIDTH_ALVO, final int HEIGHT_ALVO) throws IOException {
		File fileImagemOriginal = new File(caminhoImagemOriginal);
		BufferedImage bufferedImageOriginal = ImageIO.read(fileImagemOriginal);
		
		String[] path = caminhoImagemOriginal.split("[.]");
		String extensaoImagemOriginal = path[path.length - 1];
		
		int width = bufferedImageOriginal.getWidth();
		int height = bufferedImageOriginal.getHeight();
		
		while (width >= WIDTH_ALVO && height >= HEIGHT_ALVO) {
			height *= 0.99;
			width *= 0.99;
		}
		
		BufferedImage bufferedImageNova = ajustarImagem(bufferedImageOriginal, width, height);
		ImageIO.write(bufferedImageNova, extensaoImagemOriginal, new File(caminhoImagemNova));
	}
	
	private static BufferedImage ajustarImagem(BufferedImage bufferedImageOriginal, final int WIDTH, final int HEIGHT) {
	    BufferedImage imagemAjustada = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	    
	    Graphics2D graphics2D = imagemAjustada.createGraphics();
	    graphics2D.drawImage(bufferedImageOriginal, 0, 0, WIDTH, HEIGHT, null);
	    graphics2D.dispose();
	    
	    return imagemAjustada;
	}
}