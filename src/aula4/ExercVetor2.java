package aula4;

import java.util.Scanner;

public class ExercVetor2 {

	public static void main(String[] args) {
		// Exercicio Matriz 3

		int matrizInteiro[][] = {{1,2,3,},{4,5,6},{7,8,9}};
		int somaP = 0 ;

		Scanner leia = new Scanner(System.in);

		System.out.println("Diagonal principal.");
		for (int linha = 0; linha < 3; linha++) {
         System.out.print(matrizInteiro[linha][linha] + " ");
         somaP += matrizInteiro[linha][linha];
			}
		System.out.println("\nSoma dos elementos da diagonal principal: "+ somaP);
		
		somaP = 0;
		System.out.println("Diagonal segundaria.");
		for (int linha = 0; linha < 3; linha++) {
			System.out.print(matrizInteiro[linha][3-1-linha] + " ");
			somaP += matrizInteiro[linha][3-1-linha];
			
		}
		System.out.println("\nSoma dos elementos da diagonal segundaria: "+ somaP);
		
		
		
		
		
		
		
		
		} 
	}