package br.com.first;

public class Operador {

    public double somar(double... numeros) {
        if (numeros == null || numeros.length <= 0) {
            return 0.0d;
        }

        double total = 0.0d;
        for (double n : numeros) {
            total += n;
        }

        return total;
    }

	public double subtrair(double numero1, double numero2) {
		return numero1 - numero2;
	}
}