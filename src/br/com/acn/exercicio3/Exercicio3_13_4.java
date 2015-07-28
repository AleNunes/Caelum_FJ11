package br.com.acn.exercicio3;

public class Exercicio3_13_4 {
	public static void main(String[] args) {

		// 4 e 5 - Imprima os fatoriais de 1 a 10
		System.out.println(fatorial(4));

	}

	// Funcao fatorial recursiva
	public static double fatorial(double x) {
		if (x != 1) {
			return x * fatorial(x - 1);
		} else {
			return 1;
		}
	}

}
