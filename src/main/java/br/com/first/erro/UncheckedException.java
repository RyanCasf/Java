package br.com.first.erro;

public class UncheckedException extends RuntimeException {
	private static final long serialVersionUID = 4851237732791954250L;
	
	public UncheckedException() {
		super("Error");
	}
	
	public UncheckedException(String message) {
		super(message);
	}
}