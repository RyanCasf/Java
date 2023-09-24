package br.com.entradasaida.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Caminho {
	
	private Caminho() {
		throw new IllegalStateException("Utility class");
	}

    public static void criar(final String CAMINHO) throws IOException {
        if (CAMINHO == null) {
            throw new IllegalArgumentException("caminho is null");
        }

        if (CAMINHO.trim().isEmpty()) {
            throw new IllegalArgumentException("caminho is empty");
        }

        Path path = Paths.get(CAMINHO);
        Files.createFile(path);

        Files.delete(path);
    }

    public static void resolve() {
        Path absoluto = Paths.get("C:\\Users\\ryanc");
        Path relative = Paths.get("dev");
        Path file = Paths.get("texto.txt");
    }
}