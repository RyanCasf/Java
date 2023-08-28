package br.com.json;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Notation: Json")
class JsonControllTeste {
	
	private JsonControll controll;
	
	@BeforeEach
	void novoTeste() {
		controll = new JsonControll();
	}
	
	@Test @DisplayName("Write para usu�rio nulo.")
	void writeUsuarioNulo() {
		Assertions.assertThrows(NullPointerException.class, () -> controll.write(null));
	}
	
	@Test @DisplayName("Write para usu�rio novo.")
	void writeUsuarioNovo() {
		String json = controll.write(new Usuario());
		Assertions.assertEquals("{}", json);
	}
	
	@Test @DisplayName("Write para usu�rio do CPF.")
	void writeUsuarioCPF() {
		Usuario usuario = new Usuario();
		usuario.setCpf("cpf");
		
		String json = controll.write(usuario);
		Assertions.assertEquals("{\"cpf\":\"cpf\"}", json);
	}
	
	@Test @DisplayName("Write para usu�rio de login.")
	void writeUsuarioLogin() {
		Usuario usuario = new Usuario();
		usuario.setLogin("login");
		
		String json = controll.write(usuario);
		Assertions.assertEquals("{\"login\":\"login\"}", json);
	}
	
	@Test @DisplayName("Write para usu�rio de senha.")
	void writeUsuarioSenha() {
		Usuario usuario = new Usuario();
		usuario.setSenha("senha");
		
		String json = controll.write(usuario);
		Assertions.assertEquals("{\"senha\":\"senha\"}", json);
	}
	
	@Test @DisplayName("Write para usu�rio para todos atributos.")
	void writeUsuario() {
		Usuario usuario = new Usuario();
		usuario.setCpf("cpf");
		usuario.setLogin("login");
		usuario.setSenha("senha");
		
		String json = controll.write(usuario);
		Assertions.assertEquals("{\"login\":\"login\",\"senha\":\"senha\",\"cpf\":\"cpf\"}", json);
	}
}