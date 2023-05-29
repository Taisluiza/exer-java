package aula4;

import java.util.Arrays;
import java.util.Scanner;

public class ExercVetor {

	public static void main(String[] args) {
		// Exercicio 1 vetor

		int vetorInteiro[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 }, num;
		boolean num2 = false;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o numero que você deseja encontrar: ");
		num = leia.nextInt();

		for (int indice = 0; indice < vetorInteiro.length; indice++) {

			// int posicao = Arrays.binarySearch(vetorInteiro, 10);

			if (num == vetorInteiro[indice]) {
				System.out.println("O número " + (num) + " está localizado na posição: " + indice);
				num2 = true;
			}
			}
			if (num2 == false) {

				System.out.println("O número " + (num) + " não foi encontrado");
			}
		
	}
}
