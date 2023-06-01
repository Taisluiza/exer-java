package aula6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class ExercEstruturaDeDadosStack {

	public static void main(String[] args) {
		// Exercico estrutura de dados Stack

		Scanner leia = new Scanner(System.in);
		Queue<String> pilha = new LinkedList<String>();
		Integer num, sair = 1;
		String livro;

		do {

			System.out.print("MENU DIGITE O NUMERO DA OPÇÃO");
			System.out.print("\n1 - ADICIONAR UM LIVRO?");
			System.out.print("\n2 - LISTA TODOS OS LIVROS DA PILHA");
			System.out.print("\n3 - RETIRAR UM LIVRO DA PILHA");
			System.out.print("\n0 - SAIR");
			System.out.println("\nDIGITE SUA OPÇÃO: ");
			num = leia.nextInt();

			switch (num) {
			case 1:
				System.out.print("\nDigite o nome do livro: ");
				leia.skip("\\R?");
				livro = leia.nextLine();
				pilha.add(livro);
				System.out.println("O " + livro + " adicionado a pilha\n");
				break;

			case 2:
				if (pilha.isEmpty()) {
					System.out.println("\nA pilha está vazia");
				} else {
					System.out.println("\nLista de livro que estão na pilha: " + pilha);

				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("\nA pilha está vazia");
				} else {
					System.out.println("O " + pilha.poll() + " Foi retirado da philha\n");
				}
				break;
			case 0:
				System.out.println("\nOperação Finalizada.");
				sair = 0;
				break;
			}
		} while (sair == 1);
	}
}
