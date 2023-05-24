package aula1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// 
		float salarioBruto, adicionalNoturno, horaExtra, desconto, soma, multiplicacao = 5,subtracao, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Bem Vinde!");
		
		System.out.println("\nDigite o seu salario: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("\nDigite o seu Adcional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("\nDigite sua Hora Extra: ");
		horaExtra = leia.nextFloat();
		
		System.out.println("\nDigite os descontos: ");
		desconto = leia.nextFloat();
		
		System.out.println("\nSalario Liquido: " +(salarioBruto + adicionalNoturno + (horaExtra * multiplicacao ) - desconto ));
		
		

	}

}
