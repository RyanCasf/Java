package br.com.collection.lista;

public class Manga implements Comparable<Manga> {
	
	private Long chave;
	private String titulo;
	
	public Manga(Long chave, String titulo) {
		this.chave = chave;
		this.titulo = titulo;
	}
	
	public Long getChave() {
		return chave;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	@Override
	public String toString() {
		return "Manga [chave=" + chave + ", titulo=" + titulo + "]";
	}

	@Override
	public int compareTo(Manga o) {
		/*
			return chave.compareTo(o.getChave());
			return Long.compare(chave, o.getChave());
		*/
		
		if (chave.longValue() > o.getChave())
			return 100;
		else if (chave.longValue() < o.getChave())
			return -100;
		else 
			return 0;
	}
}