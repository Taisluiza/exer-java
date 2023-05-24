package aula1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// 
		float nota1, nota2, nota3, nota4, mediaFinal,soma, divisao = 4;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Bem Vinde!");
		
		System.out.println("\nDigite nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("\nDigite nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("\nDigite nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.println("\nDigite nota 4: ");
		nota4 =  leia.nextFloat();
		
		System.out.println("Media Final: " +(nota1 + nota2 + nota3 + nota4) /divisao);
		

	}

}
