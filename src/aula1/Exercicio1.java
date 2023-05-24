package aula1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// 
		float salario; 
		float novoSalario; 
		float abono; 
		float soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Bem Vinde!");
		
		System.out.println("\nDigite seu salario: ");
		salario = leia.nextFloat();
		
		 System.out.println("\nDigite o seu abono: ");
		 abono = leia.nextFloat();
		  
		 System.out.println("Novo Salario: " + (salario + abono) );
		

	}

}
