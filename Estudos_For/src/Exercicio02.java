/*
  EScreva um programa que escreva na tela, de 1  até 100, de 1 em 1, 3 vezes.
  A primeira vez deve usar a estrurtura de repetição for, a segunda while,
  e a terceira do while.
 */
public class Exercicio02 {

	public static void main(String[] args) {

		System.out.println("Condição for:");
		int num = 1;
		for (num = 1; num <= 10; num++) {
			System.out.println(num);
		}
		System.out.println(" ");
		System.out.println("Condição while:");

		int j = 1;
		while (j <= 10) {
			j++;
			System.out.println(j);
			System.out.println("Condição Do While:");
			
		
	    int k = 1;
	    do {
	    	System.out.println(k);
	    	k++;
	    } while (k <= 10);
		}
	}
}
