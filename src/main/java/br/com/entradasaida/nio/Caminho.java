package br.com.entradasaida.nio;

import util.conf.Configuracao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Caminho {

    public static void criar(final String CAMINHO) throws IOException {
        if (CAMINHO == null) {
            throw new IllegalArgumentException("caminho is null");
        }

        if (CAMINHO.trim().isEmpty()) {
            throw new IllegalArgumentException("caminho is empty");
        }

        Path path = Paths.get(CAMINHO);
        Files.createFile(path);
        Configuracao.imprimir("Path de entrada e saída criado: " + CAMINHO);

        Files.delete(path);
        Configuracao.imprimir("Path de entrada e saída excluído: " + CAMINHO);
    }

    public static void resolve() {
        Path absoluto = Paths.get("C:\\Users\\ryanc");
        Path relative = Paths.get("dev");
        Path file = Paths.get("texto.txt");

        Configuracao.imprimir("1. Absoluto + Relativo: " + absoluto.resolve(relative));
        Configuracao.imprimir("2. Absoluto + File: " + absoluto.resolve(file));
        Configuracao.imprimir("3. Relativo + Absoluto: " + relative.resolve(absoluto));
        Configuracao.imprimir("4. Relativo + File: " + relative.resolve(file));
    }

    public static void relatizeCasoProble() {
        Path start = Paths.get("C:\\Users\\ryanc");
        Path end = Paths.get("dev2");
        Path pathToEnd = start.relativize(end);

        Configuracao.imprimir(pathToEnd.toString());
    }
}