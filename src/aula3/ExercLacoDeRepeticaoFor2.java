package aula3;

import java.util.Scanner;

public class ExercLacoDeRepeticaoFor2 {

	public static void main(String[] args) {
		// Exercicio Laço de Repetição FOR  2 
		 
		int numero, nPar = 0, nImpar=0, contador;
		Scanner leia = new Scanner(System.in);
		
		for(contador = 1 ; contador <= 10; contador++) {
		
			System.out.println("Digite o " + contador +" º"+ " numero: ");
			numero = leia.nextInt();
		
		if(numero % 2 ==0) { 
			nPar++;
		}
		 if (numero % 3 == 0) {
			 nImpar++;
			 
		System.out.println("Total de numeros pares são: " + nPar);
        System.out.println("Total de numeros impares são: " + nImpar);
}
}		
}	
}		
