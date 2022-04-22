package br.com.functional;

public class Consumo {
	public static void main(String[] args) {
		Cliente cliente = new Cliente(1l, "Ryan");
		Consumidor.msgValido.accept(cliente);
	}
	
	static class Cliente {
		private Long chave;
		private String nome;

		Cliente(Long chave, String nome) {
			setChave(chave);
			setNome(nome);
		}

		public void setChave(Long chave) throws IllegalArgumentException {
			if (chave == null || chave <= 0) {
				throw new IllegalArgumentException("O atributo \"Chave\" é inválido!");
			}

			this.chave = chave;
		}

		public void setNome(String nome) throws IllegalArgumentException {
			if (nome == null || nome.trim().equals("")) {
				throw new IllegalArgumentException("O atributo \"Nome\" é inválido!");
			}

			this.nome = nome;
		}

		public Long getChave() {
			return this.chave;
		}

		public String getNome() {
			return this.nome;
		}
	}
}