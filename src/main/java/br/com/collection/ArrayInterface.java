package br.com.collection;

/**
 * 
 * @author ryanc
 */
public interface ArrayInterface {
	/**
	 * Adiciona um novo elemento ao conjunto
	 * 
	 * @param elemento valor para adi??o
	 * @throws Exception limite est?tico de escopo
	 */
	void adicionar(String elemento) throws Exception;

	/**
	 * Subsitui algo no escopo
	 * 
	 * @param index    int para posi??o para altera??o
	 * @param elemento valor que substituir?
	 * @throws Exception erro para exist?ncia do limite do escopo
	 */
	void adicionar(int index, String elemento) throws Exception;

	/**
	 * pega o valor da posi??o
	 * 
	 * @param index int para conjunto
	 * @return String do valor
	 */
	String obter(int index);

	/**
	 * retono o size ocupado no conjutno
	 * 
	 * @return int valor de contagem dos elementos add/alter
	 */
	int tamanho();
}