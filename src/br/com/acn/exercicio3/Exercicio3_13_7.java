package br.com.acn.exercicio3;

public class Exercicio3_13_7 {
	public static void main(String[] args) {

		// Se X eh par, x=x/2, senao x=3*x+1
		int x =13;
		while (x != 1) {
			if (x % 2 == 0) {
				x = x / 2;
				;
			} else {
				x = x * 3 + 1;
			}
			System.out.print(x);
			if (x != 1)
				System.out.print("->");
		}
	}
}
