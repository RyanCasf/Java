package br.com.ryan.tipo.primitivo;

public class Inicial 
{
	private String string;
	private char caracter; // \000
	
	private byte bits;
	private short shor;
	private int inteiro;
	private long longuer;
	
	private boolean boleano;
	
	private float flutuante;
	private double doubler;
	
	public static void main(String[] args) 
	{
		Inicial inicial = new Inicial();
		System.out.println(inicial.toString());
	}
	
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public char getCaracter() {
		return caracter;
	}
	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}
	public byte getBits() {
		return bits;
	}
	public void setBits(byte bits) {
		this.bits = bits;
	}
	public short getShor() {
		return shor;
	}
	public void setShor(short shor) {
		this.shor = shor;
	}
	public int getInteiro() {
		return inteiro;
	}
	public void setInteiro(int inteiro) {
		this.inteiro = inteiro;
	}
	public long getLonguer() {
		return longuer;
	}
	public void setLonguer(long longuer) {
		this.longuer = longuer;
	}
	public boolean isBoleano() {
		return boleano;
	}
	public void setBoleano(boolean boleano) {
		this.boleano = boleano;
	}
	public float getFlutuante() {
		return flutuante;
	}
	public void setFlutuante(float flutuante) {
		this.flutuante = flutuante;
	}
	public double getDoubler() {
		return doubler;
	}
	public void setDoubler(double doubler) {
		this.doubler = doubler;
	}
	
	@Override
	public String toString() 
	{
		return "INICIAL\n"
			+ "String : " + string + "\nChar : " + caracter + "\nByte : " + bits + "\nShor : " + shor
			+ "\nInt : " + inteiro + "\nLong : " + longuer + "\nBooleano : " + boleano + "\nFloat : " + flutuante
			+ "\nDouble : " + doubler;
	}
}