package lacosCondicionado;

import java.util.Scanner;

public class ExerLacoCondSwitch2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int codigoCargo;
		float salario;
		double novoSalario;
		
		System.out.print("Bem Vinde!");
		System.out.println("\nDigite seu nome: ");
		nome = ler.next();
		System.out.println("\nDigite o codigo do cargo: ");
		codigoCargo = ler.nextInt();
		System.out.println("\nDigite o seu salario: ");
		salario = ler.nextFloat();
		
		switch (codigoCargo) {
		case 1:
			novoSalario = salario + (0.10f* salario);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.print("\nCargo: Gerente ");
			System.out.printf("\nSalario: %.2f", novoSalario);
			break;
			
		case 2:
			novoSalario = salario + (0.07f* salario);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.print("\nCargo: Vendendor ");
			System.out.printf("\nSalario: %.2f", novoSalario);
			break;
		case 3:
			novoSalario = salario + (0.09f* salario);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.print("\nCargo: Supervisor ");
			System.out.printf("\nSalario: %.2f", novoSalario);
			break;
		case 4:
			novoSalario = salario + (0.06f* salario);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.print("\nCargo: Motorista ");
			System.out.printf("\nSalario: %.2f", novoSalario);
			break;
		case 5:
			novoSalario = salario + (0.05f* salario);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.print("\nCargo: Estoquista ");
			System.out.printf("\nSalario: %.2f", novoSalario);
			break;
		case 6:
			novoSalario = salario + (0.08f* salario);
			System.out.println("\nNome do Técnico de TI: " + nome);
			System.out.print("\nCargo: Gerente ");
			System.out.printf("\nSalario: %.2f", novoSalario);
			break;
			
			
		}
		
		
		
			
		} 

	}


