package aula3;

import java.util.Scanner;

public class ExerLacoDeRepeticaoDoWhile {

	public static void main(String[] args) {
		//Exercicio laço de repetição DO WHILE
		
		int numero, soma=0;
		Scanner leia = new Scanner(System.in);
		do {
			System.out.println("Digite um numero enteiro  \n(Para finalizar digite o 0): ");
			numero = leia.nextInt();
			
			if (numero>0) {
				soma = soma + numero;
			}
		}while (numero!= 0);
		 System.out.println("\nA somo dos numeros positivos é de : " + soma);
	}




}