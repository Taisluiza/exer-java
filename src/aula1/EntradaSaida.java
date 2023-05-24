package aula1;

import java.util.Scanner;

public class EntradaSaida {
	public static void main(String[] args) {
		
		String nome;
		float distancia;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite a distância: ");
		distancia = leia.nextFloat();
		
		System.out.println("\nPARABÉNS " + nome + "," + " a distância percorrida foi de " + distancia );
		
		
	}

}
