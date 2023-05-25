package lacosCondicionado;

import java.util.Scanner;

public class ExerLacoCondicionado1 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		int a, b, c, soma ;
		
		System.out.print("Bem Vinde!");
		
		System.out.println("\nDigite o numero A: ");
		a = ler.nextInt();
		System.out.println("\nDigite o numero B: ");
		b = ler.nextInt();
		System.out.println("\nDigite o numero C: ");
		c = ler.nextInt();
		
		if((a + b) < c) {
			System.out.println("\nA soma de A + B é menor que C.");
		}
		
		if((a + b) > c) {
			System.out.println("A soma de A + B é maior que  C.");
		}
	
		else {
			System.out.println("A soma de A + B é igual a C.");
		}
		
		
		

	}

	
	

}
