package aula3;

import java.util.Scanner;

public class ExercLacoDeRepeticaoWhile2 {

	public static void main(String[] args) {
		// Exercicio De Laço de Repetição WHILE 2

		int idade, sexo , categoria , contador;
		String continua ="n";
		
		Scanner leia = new Scanner(System.in);
		
		while(continua.equals("n")) {
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
			System.out.println("Digite o sexo: " + "(\n1 - Masculino.\n2 - Feminino. \n3 - Outros.)");
			sexo = leia.nextInt();
			
			System.out.println("Digite o cargo: " + "(\n1 -Backend. \n2 - Frontend. \n3 - Mobile. \n4 -FullStack.)");
			categoria = leia.nextInt();
		
		
			System.out.println("Dseja continual(S/N): ");
			continua = leia.next();
			System.out.println("Operação Finalizada!!");
		}
	}
}		
	
	
		
		
