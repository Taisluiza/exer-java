package aula6;
import java.util.Iterator;
import java.util.Stack;

public class AulaEstruturaDeDadosStack {

	public static void main(String[] args) {
		// Aula Estrutura de dados Pilha

		Stack<String> pilha =new Stack<String>();
		pilha.push("Prato Verde");
		pilha.push("Prato Azul");
		pilha.push("Prato Branco");
		pilha.push("Prato Amarelo");
		pilha.push("Prato Vermelho");
		System.out.println("\nElementos da Pilha: " + pilha);
		System.out.println("\nRetirar o elemento: " + pilha.pop());
		System.out.println("\nElementos da Pilha: " + pilha);
		System.out.println("\nRetira o elemento: " + pilha.pop());
		System.out.println("\nElementos da Pilha: " + pilha);
		System.out.println("\nElementos no topo da Pilha: " + pilha.peek());
		System.out.println("\nAdicionar Elemento Prato Roxo: " + pilha.push("Prato Roxo"));
		System.out.println("\nExibir a Pilha atualizada: " + pilha);
		System.out.println("\nTamanho da Pilha: " + pilha.size());
		System.out.println("\nElemento Prato verde existe? " + pilha.contains("Prato Verde"));
		System.out.println("\nExibir todos os Elementos por Iteração");
		Iterator<String> iterator = pilha.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		pilha.clear();
		System.out.println("\nA pilha esta vazia");
		
		
	}

}
