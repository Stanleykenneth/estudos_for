import java.util.Scanner;

/*
   06 - Faça um programa que leia 10 números inteiro  e imprima sua média. 
*/
public class Exercicio06 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int media = 0;
		
		for(int i = 1; i <= 10; i++ ) {
			System.out.println("Digite um número: ");
			i = ler.nextInt();
			media += i;			
		}
		System.out.println("A média da soma é:" + media /10 + ".");
		ler.close();
	}
}
