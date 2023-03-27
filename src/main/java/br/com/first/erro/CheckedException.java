package br.com.first.erro;

public class CheckedException extends Exception {
	private static final long serialVersionUID = 6294405771583900077L;
	
	public CheckedException() {
		super("Error");
	}
	
	public CheckedException(String message) {
		super(message);
	}
}