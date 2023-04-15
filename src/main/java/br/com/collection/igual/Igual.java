package br.com.collection.igual;

public class Igual {
	
	private Long chave;
	
	public Long getChave() {
		return chave;
	}
	
	public void setChave(Long chave) {
		this.chave = chave;
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
		final int RESULT = 1;
		final int HASH_CODE_CHAVE = (chave != null ? chave.hashCode() : 0);
		
		return PRIME * RESULT + HASH_CODE_CHAVE;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (this == obj) return true;
		if (getClass() != obj.getClass()) return false;
		
		Igual other = (Igual) obj;
		return chave != null && chave.equals(other.chave);
	}
	
	@Override
	public String toString() {
		return "Chave=" + chave;
	}
}