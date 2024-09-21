package While;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

	public static void main(String[] args) {

		double mesada = 50.00;

		while (mesada >= 0) {
			Double valorDoce = valorAleatorio();
			// if (valorDoce > mesada)
			// valorDoce = mesada;

			System.out.printf("Doce no valor: %.2f ", valorDoce);
			System.out.println("Adicionada no carrinho");
			mesada = mesada - valorDoce;

		}

		System.out.printf("Mesada = R$ %.2f ", mesada);
		System.out.println("Joâozinho gastou toda sua mesada em doces");
	}

	private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2, 8);
	}

}
