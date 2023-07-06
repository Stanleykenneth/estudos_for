import java.util.Scanner;

/*
   05 - Faça um programa que peça para o usuário digitar 10 valores e some-os.* 
 */
public class Exercicio05 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int soma = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite um valor:");
			i = ler.nextInt();
			soma += i;
		}
		System.out.println("A soma dos valores  é " + soma + ".");
		ler.close();
	}
}
