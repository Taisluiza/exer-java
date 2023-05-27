package aula3;

import java.util.Scanner;

public class ExercLacoRepeticaoFor {

	public static void main(String[] args) {
		// Exercicio 1 Laço de Repetição FOR
		
		int num1,num2, contador, resultado;
		
		
		Scanner leia = new Scanner(System.in);
		
			System.out.println("\nDigite o primeiro número do intervalo: ");
			num1 = leia.nextInt();
			
			System.out.println("\nDigite o segundo número do intervalo: ");
			num2 = leia.nextInt();
			
			if (num1 >= num2) {
				System.out.println("Opcao invalida!");
			
			}
			System.out.println("Numeros multiplos de 3 e 5 no intervalo de " + num1 + " e "+ num2 +" :");
			
				
			for (contador = num1; contador < num2; contador++) {
			if (contador % 3 == 0 && contador % 5 == 0) {
				System.out.println(contador + " é multiplo de 3 e 5.");
				
			}
			}
			
			{
		}
		
	}
	}


