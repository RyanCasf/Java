package util.log;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

class LogController  {
	private static final String[] DIRS = {null, "C:\\Users\\ryanc\\OneDrive\\�rea de Trabalho\\LOG"};
	private static PrintWriter printWriter;
	private static FileReader fileReader;
	
	public static void main(String[] args) {
		try 
		{
			for (String caminhoDiretorio : DIRS) {
				if (caminhoDiretorio != null) {
					fileReader = null;
					printWriter = null;
					
					obterUniaoDiretorio(caminhoDiretorio);
				}
			}
			
			fileReader.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			printWriter.close();
		}
	}

	private static void obterUniaoDiretorio(String caminhoDiretorio) throws IOException 
	{
		File diretorio = new File(caminhoDiretorio);
		if (!diretorio.exists()) {
			return;
		}
		
		String[] nomeTodosArquivos = diretorio.list();
		if (nomeTodosArquivos == null || nomeTodosArquivos.length <= 0) {
			return;
		}
		
		String nomeArquivoUnificado = caminhoDiretorio+File.separator+"LOG.txt";
		printWriter = new PrintWriter(nomeArquivoUnificado);
		
		for (String nomeArquivo : nomeTodosArquivos)
			escreverLog(caminhoDiretorio, nomeArquivo);
	}

	private static void escreverLog(String diretorio, String nomeArquivo) throws IOException
	{
		if (!nomeArquivo.contains(".txt") && !nomeArquivo.contains(".log")
				|| nomeArquivo.equals("LOG.txt"))
			return;
		
		fileReader = new FileReader(diretorio+File.separator+nomeArquivo);

		int i;
		while ((i = fileReader.read()) != -1)
		    printWriter.print((char) i);
		
		printWriter.flush();
	}
}