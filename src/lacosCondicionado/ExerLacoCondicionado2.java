package lacosCondicionado;

import java.util.Scanner;

public class ExerLacoCondicionado2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num;
	
		System.out.print("Bem Vinde! ");
		
		System.out.println("\nDigite um numero: ");
		num = ler.nextInt();
		
		
		
		if (num >=0) {
			if(num % 2 == 0) {
			System.out.println("O numero " + num +" é par e positivo!");
		}
			else {
				System.out.println("O numero" + num + " é impar e positivo!");
				
			}
		}
			
		else {
				if(num % 2 == 0) {
					System.out.println("O numero" + num + " é impar e negativo!");
				}
				else {
					System.out.println("O numero " + num + " é impar e negativo!");
					
				}
					
				}
			}
	}


