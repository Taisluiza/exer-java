package aula5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class ExercColletionsListSet {

	public static void main(String[] args) {
		// Exercicio Colletions Iterator 1
      
		ArrayList <Integer> numero = new ArrayList<>();
		Scanner leia = new Scanner(System.in);
		int num = -1  , posicao;
	
		
		numero.add(2);
		numero.add(5);
		numero.add(1);
		numero.add(3);
		numero.add(4);
		numero.add(9);
		numero.add(7);
		numero.add(8);
		numero.add(10);
		numero.add(6);
		
		
		System.out.println("Digite um numero: ");
		num = leia.nextInt();
		
		
		posicao = numero.indexOf(num);
		if(num== 0) {
			System.out.println("Numero " + num + " esta na posição: " + posicao);
			
		}else {
			System.out.print("Numero " + num + " não foi encontrado");
		
		}
		
		}
	}


