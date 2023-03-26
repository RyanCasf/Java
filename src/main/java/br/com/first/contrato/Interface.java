package br.com.first.contrato;

public interface Interface {
	
	String SERVER_NAME = "I/O Json";
	
	void salvar(Object object);
	void deletar(long chave);
	
	default boolean isReturn() {
		return false;
	}
}