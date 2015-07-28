package br.com.acn.exercicio3;

public class Exercicio3_13_6 {

	// Imprima os numeros da serie de Fibonacci
	public static void main(String[] args) {
		// System.out.println(fibonacci(6));

		for (int i = 0; i < 30; i++) {
			System.out.println("(" + i + "): " + fibonacci(i));
		}

	}

	public static double fibonacci(double x) {
		if (x > 2) {
			return fibonacci(x - 1) + fibonacci(x - 2);
		} else {
			return x;
		}
	}

}
