package br.com.first.enumeration;

public enum Enumeration {
	
	DESIGN("Design") {
		@Override
		public String imprimir() {
			return "Em processo de design...";
		}
	},
	DESENVOLVIMENTO("Desenvolvimento") {
		@Override
		public String imprimir() {
			return "Em processo de desenvolvimento...";
		}
	},
	TESTE("Teste") {
		@Override
		public String imprimir() {
			return "Em processo de teste...";
		}
	};
	
	Enumeration(final String descricao) {
		this.descricao = descricao;
	}
	
	public final String descricao;
	
	public abstract String imprimir();
	
	@Override
	public String toString() {
		return descricao;
	}
}