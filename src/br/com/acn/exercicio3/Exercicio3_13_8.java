package br.com.acn.exercicio3;

public class Exercicio3_13_8 {

	public static void main(String[] args) {
		// Imprima a seguinte tabela, usando for encadeado:
		// 1
		// 2	4
		// 3	6	9
		// 4	8	12	16
		// n	n*2	n*3	...	n*n
		
		int n=4;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i*j + " ");
			}
			System.out.println("");
		}

	}

}
