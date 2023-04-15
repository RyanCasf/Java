package br.com.advanced.serializacao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Advanced: Aluno")
class AlunoTeste {
	
	@Test @DisplayName("toString para nova instância.")
	void toStringNovaInstancia() {
		Aluno aluno = new Aluno(null, null, null);
		final String ESPERADO = "Aluno: ID=null, Nome=null, Senha=null, Turma=null";
		
		assertEquals(ESPERADO, aluno.toString());
	}
	
	@Test @DisplayName("toString.")
	void alunoToString() {
		Aluno aluno = new Aluno(1l, "Nome", "Senha");
		final String ESPERADO = "Aluno: ID=1, Nome=Nome, Senha=Senha, Turma=null";
		
		assertEquals(ESPERADO, aluno.toString());
	}
	
	@Test @DisplayName("toString com turma.")
	void toStringComTurma() {
		Aluno aluno = new Aluno(1l, "Nome", "Senha");
		Turma turma = new Turma();
		turma.setNome("Turma Nome");
		aluno.setTurma(turma);
		
		final String ESPERADO = "Aluno: ID=1, Nome=Nome, Senha=Senha, Turma=Turma Nome";
		
		assertEquals(ESPERADO, aluno.toString());
	}
}