package br.com.first.variavel;

public class TipoPrimitivo {

	private String string;
	private char caracter;

	private byte bits;
	private short shor;
	private int inteiro;
	private long longuer;
	
	private boolean boleano;
	
	private float flutuante;
	private double doubler;
	
	public String getString() {
		return string;
	}
	
	public char getCaracter() {
		return caracter;
	}
	
	public byte getBits() {
		return bits;
	}
	
	public short getShor() {
		return shor;
	}

	public int getInteiro() {
		return inteiro;
	}
	
	public long getLonguer() {
		return longuer;
	}
	
	public boolean isBoleano() {
		return boleano;
	}
	
	public float getFlutuante() {
		return flutuante;
	}
	
	public double getDoubler() {
		return doubler;
	}

	public void setString(String string) {
		this.string = string;
	}

	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}
}