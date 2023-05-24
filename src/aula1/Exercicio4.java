package aula1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// 
		float n1, n2, n3, n4, subtracao, multiplicacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Bem Vinde! ");
		
		System.out.println("\nDigite numero 1: ");
		n1 = leia.nextFloat();
		
		System.out.println("\nDigite numero 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("\nDigite numero 3: ");
		n3 = leia.nextFloat();
		
		System.out.println("\nDigite numero 4: ");
		n4 = leia.nextFloat();
		
		System.out.println("Calculo: " + ((n1 * n2) - (n3 * n4) ));
		 
		
		
		
		

	}

}
