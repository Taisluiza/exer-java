package aula3;

import java.util.Scanner;

public class LacoDeRepeticaoWhile {

	public static void main(String[] args) {
		// exemplo para o While
		
		String continua ="s";
		int numero1, numero2, resultado;
		Scanner leia = new Scanner(System.in);
		
		while (!continua.equals("n")) {
			System.out.println("Digite primeiro valor: ");
			numero1 = leia.nextInt();
			
			System.out.println("Digite o segundo valor: ");
			numero2 = leia.nextInt();
			
			resultado = numero1 + numero2;
			
			System.out.println("O resultado da soma é: " + resultado);
			
			System.out.println("\n+++++++++++++MENU++++++++++");
			System.out.println("\nDeseja somar dois valores?" );
			System.out.println("\nDigite s para sim OU n para não: ");
			continua = leia.next();
			System.out.println("Operação finalizada!!");
			
		}
			
			
		}

	}


