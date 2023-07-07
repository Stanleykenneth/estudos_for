import java.util.Scanner;

/*
   07 - Faça um programa que leia 10 inteiros prositivos,
        ignorando não positivos e imprima a sua média.
         
*/
public class Exercicio07 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numeros = 10;
		int contador = 0;
		int somaPositivos = 0;
		
		System.out.println("Digite 10 números inteiros:");
		
		for(int i = 0; i < numeros; i++) {
			int num = ler.nextInt();
			
			if(num > 0) {
				contador++;
				somaPositivos += numeros;
			}
		}
		if(somaPositivos > 0){
			double media = (double) somaPositivos / contador;
			System.out.println("A média dos números é: " + media);
		}
		else {
			System.out.println("Nenhum número positivo foi digitado");
		}
		ler.close();
	}
}
