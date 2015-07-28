package br.com.acn.exercicio3;

public class Exercicio3_13_3 {
	public static void main(String[] args) {

		// 3 - Imprima todos os multiplos de 3, entre 1 e 100
		for (int i = 3; i < 100; i += 3)
			System.out.println(i);

		// 3 - Alternativa
		for (int i = 1; i < 100; i++)
			if (i % 3 == 0)
				System.out.println(i);
		// --

	}
}
