package br.com.first.heranca;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
		protected String nome;
		private String cpf;
		private List<Endereco> enderecos = new ArrayList<Endereco>();
		
		public Pessoa(final String nome) {
			this.nome = nome; 
		}
		
		public boolean isSome() {
			return false;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public List<Endereco> getEnderecos() {
			return enderecos;
		}

		public void setEnderecos(List<Endereco> enderecos) {
			this.enderecos = enderecos;
		}
}