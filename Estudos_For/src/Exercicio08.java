import java.util.Scanner;

/*
   08 - Escreva um programa que leia 10 números e escreva o menor valor lido
        e o maior valor lido.
*/
public class Exercicio08 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int quantidadeNumeros = 10;
		int menorValor = Integer.MAX_VALUE;
		int maiorValor = Integer.MIN_VALUE;

		System.out.println("Digite 10 números:");

		for (int i = 0; i < quantidadeNumeros; i++) {
			int numero = ler.nextInt();

			if (numero < menorValor) {
				menorValor = numero;
			}

			if (numero > maiorValor) {
				maiorValor = numero;
			}
		}

		System.out.println("O menor valor é: " + menorValor);
		System.out.println("O maior valor é: " + maiorValor);
	}

}
