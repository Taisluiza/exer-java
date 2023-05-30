package aula5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExercColletionsList {

	public static void main(String[] args) {
		// Exercico 1 colletions ArrayList

		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		String nome;

		for (int cor = 0; cor < 5; cor++) {
			System.out.println("\nDigite 5 cores: ");
			nome = leia.next();
			cores.add(nome);
		}
			
			System.out.println("\nCores não ordenadas: ");
		for(String cor : cores) {
			System.out.print(cor);
			
		}
		Collections.sort(cores);
		System.out.println("\nLista de cores ordenadas: ");
			for (String cor : cores) {
				System.out.print(cor);
			}
	}

}
