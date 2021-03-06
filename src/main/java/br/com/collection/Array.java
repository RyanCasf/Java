package br.com.collection;

/**
 * interface para methods
 * 
 * @author Ryan Castro Ferreira
 */
public class Array implements ArrayInterface {
	private String[] array;
	private int posicao;

	/**
	 * Cria??o do escopo incial do array
	 * 
	 * @author Ryan Castro Ferreira
	 * @param capacidade int para dar tamanho ao escopo
	 */
	public Array(int capacidade) {
		capacidade = estoutoMemoriaCapacidade(capacidade);
		array = new String[capacidade];
		posicao = 0;
	}

	/**
	 * Adi??o de novo valor
	 * 
	 * @exception Exception erro de limite de capacidade
	 * @author Ryan Castro Ferreira
	 */
	public void adicionar(String elemento) throws Exception {
		if (!existe(posicao + 1)) {
			throw new Exception("Limite da lista, incapaz de adicionar!");
		}

		for (int i = posicao; i < tamanho(); i++) {
			if (array[i] == null) {
				posicao = i + 1;
				array[i] = elemento;
				break;
			}
		}
	}

	/**
	 * Substitui??o de valors por seu posi??o
	 * 
	 * @exception Exception para posi??o inv?lida
	 * @param index    int de posi??o
	 * @param elemento String de valor de substitui??o
	 */
	public void adicionar(int index, String elemento) throws Exception {
		if (existe(index)) {
			array[index] = elemento;
		} else {
			throw new Exception("Index desconhecido!");
		}
	}

	/**
	 * rr a posi??o ou null para inexit?ncia
	 * 
	 * @author ryanc
	 */
	public String obter(int index) {
		return existe(index) ? array[index] : null;
	}

	/**
	 * Retorno para o tamanho ocupado
	 * @author Ryan Castro Ferreira
	 */
	public int tamanho() {
		return array.length;
	}

	/**
	 * Retorno para se for vazio
	 * @param index posi??o para exist?ncia em escopo
	 * @return boolean to is
	 */
	public boolean existe(int index) {
		return (index >= 0 && index <= tamanho());
	}

	private int estoutoMemoriaCapacidade(int capacidade) {
		try {
			if (capacidade <= 0) {
				capacidade = capacidade * -1;
			}
		} catch (OutOfMemoryError e) {
			System.out.println(Integer.MAX_VALUE);
			capacidade = Integer.MAX_VALUE;
		}
		return capacidade;
	}
}