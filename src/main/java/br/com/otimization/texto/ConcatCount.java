package br.com.otimization.texto;

public class ConcatCount {
	
	public void make() {
		ConcatCount count = new ConcatCount();
		final int QUANTIDADE = 100;
		
		double inicio = System.nanoTime();
		count.countString(QUANTIDADE);
		count.exibirQuantidade(QUANTIDADE, inicio, "String");
		
		inicio = System.nanoTime();
		count.countBuffer(QUANTIDADE);
		count.exibirQuantidade(QUANTIDADE, inicio, "Buffer");
		
		inicio = System.nanoTime();
		count.countBuilder(QUANTIDADE);
		count.exibirQuantidade(QUANTIDADE, inicio, "Builder");
	}
	
	public void countString(int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			String a = "A";
		}
	}
	
	public void countBuffer(int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			StringBuffer stringBuffer = new StringBuffer("A");
		}
	}
	
	public void countBuilder(int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			StringBuilder stringBuilder = new StringBuilder("A");
		}
	}
	
	private void exibirQuantidade(double quantidade, double inicio, String nome) {
		System.out.println(
				"Criar " + quantidade + " " + nome + " levou " + (System.nanoTime() - inicio) + " nano segundos.");
	}
}