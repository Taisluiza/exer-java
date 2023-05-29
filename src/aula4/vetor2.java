package aula4;

import java.util.Scanner;

public class vetor2 {

	public static void main(String[] args) {
		// Matriz com FOR
		
		int matrizInteiro[][]= new int[3][3];
		Scanner leia = new Scanner(System.in);
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0;coluna  < 3; coluna++) {
				System.out.println("Digite um valor para a posição [" + linha + "] [" + coluna +"]: ");
				matrizInteiro[linha][coluna] = leia.nextInt();
			}
		}
		for(int linha = 0 ; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.println("O valor armazenado na posiçãp [" + linha +"] [" + coluna +"] é: " + matrizInteiro[linha][coluna]);
			}
		}

	}

}
