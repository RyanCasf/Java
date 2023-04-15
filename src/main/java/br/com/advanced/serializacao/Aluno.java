package br.com.advanced.serializacao;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

public class Aluno implements Serializable {
	
	@Serial
	private static final long serialVersionUID = -1068393758078377835L;
	
	private Long id;
    private String nome;
    private transient String senha;
    private transient Turma turma;
    
    public Aluno(Long id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }
    
    @Serial
    private void writeObject(ObjectOutputStream objectOutputStream) {
    	try {
    		objectOutputStream.defaultWriteObject();
    		objectOutputStream.writeUTF(turma.getNome());
    	}
    	catch (IOException e) {
    		e.printStackTrace();
		}
    }
    
    @Serial
    private void readObject(ObjectInputStream objectInputStream) {
    	try {
    		objectInputStream.defaultReadObject();
    		String nomeTurma = objectInputStream.readUTF();
    		
    		turma = new Turma();
    		turma.setNome(nomeTurma);
    	}
    	catch (IOException | ClassNotFoundException e) {
    		e.printStackTrace();
		}
    }

    @Override
    public String toString() {
        return "Aluno: ID=" + id + ", Nome=" + nome + ", Senha=" + senha + ", Turma=" + (turma != null ? turma.getNome() : "null");
    }
    
    public void setTurma(Turma turma) {
		this.turma = turma;
	}
}