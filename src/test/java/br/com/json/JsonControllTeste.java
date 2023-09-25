package br.com.json;

import static org.junit.jupiter.api.Assertions.*;

import br.com.util.model.Usuario;
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
	void init() {
		controll = new JsonControll();
	}
	
	@Test @DisplayName("Write para usuário nulo.")
	void writeUsuarioNulo() {
		final NullPointerException e = assertThrows(NullPointerException.class, () -> controll.write(null));
		assertEquals(e.getMessage(), "usuario is null");
	}
	
	@Test @DisplayName("Write para usuário novo.")
	void writeUsuarioNovo() {
		String json = controll.write(new Usuario());
		assertEquals("{}", json);
	}
	
	@Test @DisplayName("Write para usuário do CPF.")
	void writeUsuarioCPF() {
		Usuario usuario = new Usuario();
		usuario.setCpf("cpf");
		
		String json = controll.write(usuario);
		assertEquals("{\"cpf\":\"cpf\"}", json);
	}
	
	@Test @DisplayName("Write para usuário de login.")
	void writeUsuarioLogin() {
		Usuario usuario = new Usuario();
		usuario.setLogin("login");
		
		String json = controll.write(usuario);
		assertEquals("{\"login\":\"login\"}", json);
	}
	
	@Test @DisplayName("Write para usuário de senha.")
	void writeUsuarioSenha() {
		Usuario usuario = new Usuario();
		usuario.setSenha("senha");
		
		String json = controll.write(usuario);
		assertEquals("{\"senha\":\"senha\"}", json);
	}
	
	@Test @DisplayName("Write para usuário para todos atributos.")
	void writeUsuario() {
		Usuario usuario = new Usuario();
		usuario.setCpf("cpf");
		usuario.setLogin("login");
		usuario.setSenha("senha");
		
		String json = controll.write(usuario);
		assertEquals("{\"login\":\"login\",\"senha\":\"senha\",\"cpf\":\"cpf\"}", json);
	}
}