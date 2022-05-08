package br.com.collection;

/**
 * 
 * @author ryanc
 */
public interface ArrayInterface {
	/**
	 * Adiciona um novo elemento ao conjunto
	 * 
	 * @param elemento valor para adição
	 * @throws Exception limite estático de escopo
	 */
	public void adicionar(String elemento) throws Exception;

	/**
	 * Subsitui algo no escopo
	 * 
	 * @param index    int para posição para alteração
	 * @param elemento valor que substituirá
	 * @throws Exception erro para existência do limite do escopo
	 */
	public void adicionar(int index, String elemento) throws Exception;

	/**
	 * pega o valor da posição
	 * 
	 * @param index int para conjunto
	 * @return String do valor
	 */
	public String obter(int index);

	/**
	 * retono o size ocupado no conjutno
	 * 
	 * @return int valor de contagem dos elementos add/alter
	 */
	public int tamanho();
}