/*
   Faça um algoritmo utilizando comando while
   que mostra uma contagem regressiva na tela,
   iniciando em 10 e terminando em 0. Mostar
   uma mensagem "FIM"! Após a contagem.
      
*/
public class Exercicio03 {

	public static void main(String[] args) {

		int numero = 10;

		while (numero >= 0) {

			System.out.println(numero);
			numero--;

		}
		System.out.println("FIM!");
	}
}
