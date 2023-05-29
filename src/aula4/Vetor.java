package aula4;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// Criando vetor sem dado com FOR
		int vetorInteiro[] = new int[5];
		Scanner leia = new Scanner(System.in);
		
		for (int indice = 0; indice <5; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º numero: ");
			vetorInteiro[indice] = leia.nextInt();
		}
		System.out.println("\nOs numeros digitados foram: \n");
		
		for (int indice = 0; indice < 5; indice++) {
			System.out.println((indice + 1)+ "º numero: " + vetorInteiro[indice]);
		
		}
		

	}

}
