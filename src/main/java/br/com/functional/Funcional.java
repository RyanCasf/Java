package br.com.functional;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Funcional {
    public static void main(String[] args) {
        List<Aluno> alunos = fetchAlunos();

        List<Aluno> aprovados = alunos.stream()
                .filter(aluno -> aluno.getPontos() >= 6)
                .collect(Collectors.toList());

        aprovados.forEach(System.out::println);
    }

    public static List<Aluno> fetchAlunos() {
        return List.of(
                new Aluno("Ryan", "Catro", 6),
                new Aluno("Felipe", "Catro", 10),
                new Aluno("Rildo", "Ferreira", 8),
                new Aluno("João", "Silva", 4)
        );
    }

    static class Pessoa {
        private String nome;
        private String sobrenome;

        public void setNome(String nome) {
            this.nome = (nome != null ? nome : "");
        }

        public void setSobrenome(String sobrenome) {
            this.sobrenome = (sobrenome != null ? sobrenome : "");
        }

        public String getSobrenome() {
            return sobrenome;
        }

        public String getNome() {
            return nome;
        }
    }

    static class Aluno extends Pessoa {
        private int pontos;

        Aluno(String nome, String sobrenome, int pontos) {
            this.setNome(nome);
            this.setSobrenome(sobrenome);
            this.setPontos(pontos);
        }

        public int getPontos() {
            return pontos;
        }

        public void setPontos(int pontos) {
            while (pontos < 0 || pontos > 10) {
                pontos = Integer.parseInt(JOptionPane.showInputDialog("Dígite o nome do Aluno: "));
            }

            this.pontos = pontos;
        }

        @Override
        public String toString() {
            return this.getNome().concat(" ").concat(this.getSobrenome())
                    .concat(", pontos.: ")+this.getPontos();
        }
    }
}