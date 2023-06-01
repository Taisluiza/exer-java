package aula6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class AulaEstruturaDeDadosQueue {
	public class Fila {

		public static void main(String[] args) {
			// Class Fila
			Queue<Integer> fila = new LinkedList<Integer>();

			for (int i = 0; i <= 10; i++)
				fila.add(i);
			System.out.println("\nElementos na fila: " + fila);
			System.out.println("\nRemova Elemento: " + fila.remove());
			System.out.println("\nfila Atualizada: " + fila);
			System.out.println("\nAdiciona Elemento 11: " + fila.add(11));
			System.out.println("\nExibir fila Atualizada: " + fila);
			System.out.println("\nExibir o primeiro da fila: " + fila.peek());
			System.out.println("\nExibir o tamanho da fila: " + fila.size());
			System.out.println("\nChecar se o Elemento 4 exixte na fila: " + fila.contains(4));
			System.out.println("\nExibir e Retirar da fila o 1º Elementos (HEAD): " + fila.poll());
			System.out.println("\nExibir todos elementos por Iteração");
			Iterator<Integer> iterator = fila.iterator();
			while (iterator.hasNext()) {
				System.out.print(iterator.next());
			}
			System.out.println("\nLimpar a fila");
			fila.clear();
			System.out.println("\nA fila está vazia? " + fila.isEmpty());

		}

	}
}