package br.com.advanced;

import java.io.Serializable;

public class Aluno implements Serializable {

    private Long id;
    private String nome;
    private String senha;

    /*
     * Serializar não trabalha com os construtores
     */
    public Aluno(Long id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Aluno: ID=" + id + ", Nome=" + nome + ", Senha=" + senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}