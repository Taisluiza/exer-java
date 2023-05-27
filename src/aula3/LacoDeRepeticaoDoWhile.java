package aula3;

import java.util.Scanner;

public class LacoDeRepeticaoDoWhile {

	public static void main(String[] args) {
		// Do While/Faca equanto
		
		int numero, resultado, contador = 3;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("\nDigite um numero inteiro: ");
			numero = leia.nextInt();
			resultado = numero * 5;
		System.out.println("\nO resultado da multiplicação é: " + resultado );
		} while(contador <= 2);
		

	}

}
