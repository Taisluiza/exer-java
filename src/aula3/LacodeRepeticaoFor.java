package aula3;

import java.util.Scanner;

public class LacodeRepeticaoFor {

	public static void main(String[] args) {
		// estrutura for/para
		
		String nome1, nome2, nome3, nome;
		Scanner leia = new Scanner(System.in);
		int contador;
		
		
		System.out.println("Digite o 1º nome: ");
		nome1 = leia.next();
		System.out.println("\nDigite o 2º nome: ");
		nome2 = leia.next();
		System.out.println("\nDigite o 3º nome: ");
		nome3 =leia.next();
		
		// contador 
		
		for (contador = 0; contador < 4; contador++) {
		System.out.println("\nDigite o " + contador + "  o nome: ");	
		nome = leia.next();
		System.out.println("O" + contador + " º nome é: " + nome);
		}
		
	}

}
