package aula6;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class ExercEstruturaDeDadosQueue {

	public static void main(String[] args) {
		// Exercico fila/Queue 1

		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		Integer num, sair = 1; 
		String cliente;
		
		while(sair == 1) {
			
		System.out.println("MENU DIGITE O NUMERO DA OPÇÃO");
		System.out.print("\n1 - ADICIONAR CLIENTE A FILA?");
		System.out.print("\n2 - LISTA TODOS OS CLIENTES");
		System.out.print("\n3 - RETIRAR");
		System.out.print("\n0 - SAIR");
		System.out.print("\nDIGITE SUA OPÇÃO: ");
		num = leia.nextInt();
		

		switch(num) {
		case 1:
			System.out.print("\nDigite o nome do cliente: ");
			cliente = leia.next();
			fila .add(cliente);
			System.out.println("Cliente "+ cliente+ " adicionado a fila\n" );
			break;
			
		case 2:
			if (fila.isEmpty()) {
			System.out.println("\nA fila está vazia");
			}else {
			System.out.println("\nLista de clientes que estão na fila: " + fila );
			
			}
			break;
		case 3:
			if (fila.isEmpty()) {
				System.out.println("\nA fila está vazia");
				}else {
				System.out.println("Cliente " + fila.poll() + " Foi chamado\n");
				}
			break;
		case 0:
			System.out.println("\nOperação Finalizada.");
			sair = 0;
			break;
		}
		}
	}

}
