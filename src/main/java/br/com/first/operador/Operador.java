package br.com.first.operador;

public class Operador implements OperadorInterface {

	@Override
    public double somar(double... numeros) throws NullPointerException {
        if (numeros == null || numeros.length <= 0) {
        	throw new NullPointerException();
        }

        double total = 0.0d;
        for (double n : numeros) {
            total += n;
        }

        return total;
    }

	@Override
	public double subtrair(double numero1, double numero2) {
		return numero1 - numero2;
	}

	@Override
	public double multiplicar(double... numeros) throws NullPointerException {
		if (numeros == null || numeros.length <= 0) {
			throw new NullPointerException();
		}
		
		double total = 1.0d;
		for (double n : numeros) {
			total *= n;
		}
		
		return total;
	}
}