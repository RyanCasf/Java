package br.com.advanced;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Serializacao {

    public Serializacao() {
        throw new IllegalStateException("Classe utilitária!");
    }

    /*
     * Transformar o objeto num array de bytes
     */
    public static void serializar(Aluno aluno) {
        Path path = Paths.get("teste.ser");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            objectOutputStream.writeObject(aluno);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserializar() {
        Path path = Paths.get("teste.ser");

        try (ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) objectInputStream.readObject();
            System.out.println(aluno);

            Files.delete(path);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}