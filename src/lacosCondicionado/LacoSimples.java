package lacosCondicionado;

import java.util.Scanner;

public class LacoSimples {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		int num;
	
	System.out.println("Digite um numero: ");
	num = ler.nextInt();
	
	if( num == 1) {
		System.out.println("\nConta paga no debito!");
	} 
	else if(num == 2 ) {
	
		System.out.println("Conta paga no credito!");
	
	}
	else {
		System.out.println("\nNumero invalido!");
	}
	
	}

}