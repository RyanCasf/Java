package Loiane.enumeradores;

public enum Enum 
{
	MASCULINO('M'), FEMININO('F);
	
	private char sexo;
	
	Enum(char sexo)
	{
		this.sexo = sexo;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}