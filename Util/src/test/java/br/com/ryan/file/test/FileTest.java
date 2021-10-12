package br.com.ryan.file.test;

import java.io.File;

import org.junit.jupiter.api.Test;

import br.com.ryan.file.FileControl;

public class FileTest 
{
	@Test
	public void visualizarDiretorio()
	{
		String diretoria = "C:/Users/ryanc/OneDrive/Documentos";
		
		File file = new FileControl().findFile(diretoria, "adm", "txt");
	}
}