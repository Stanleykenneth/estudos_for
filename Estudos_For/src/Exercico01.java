/*
  Faça um programa que determine e mostre os cincos primeiros multiplos de 3, 
  considerando números maiores que zero.
 */
public class Exercico01 {

	public static void main(String[] args) {

		int[] multiplos = new int[5];
		int contador = 0;
		int numero = 1;

		while (contador < 5) {
			if (numero % 3 == 0) {
				multiplos[contador] = numero;
				contador++;
			}
			numero++;
		}
		System.out.println("Os cincos primeiros multiplos de 3 são:");
		for (int multiplo : multiplos) {
			System.out.println(multiplo);
		}
	}

}
