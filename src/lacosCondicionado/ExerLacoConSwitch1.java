package lacosCondicionado;

import java.util.Scanner;

public class ExerLacoConSwitch1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int codigoProduto;
		float quantidade;
		double precoUnitario;
		
		System.out.print("Bem Vinde! ");
		
		System.out.println("\nDigite o codigo do protuto: ");
		codigoProduto= ler.nextInt();
		System.out.println("Digite a quantidade: ");
		quantidade= ler.nextFloat();
		
		switch (codigoProduto) {
		case 1:
			precoUnitario = quantidade*10;
			System.out.println("\nProduto: Cachorro Quente");
			System.out.printf("\nValor total: %.2f" , precoUnitario);
			break;
			
		case 2:
			precoUnitario = quantidade*15;
			System.out.println("\nProduto: X-Salada");
			System.out.printf("\nValor total: %.2f",precoUnitario);
			break;
		
		case 3:
			precoUnitario = quantidade*18;
			System.out.println("\nProduto: X-Bacon");
			System.out.printf("\nValor total: %.2f",precoUnitario);
			break;
			
		case 4:
			precoUnitario = quantidade*12;
			System.out.println("\nProduto: Bauru");
			System.out.printf("\nValor total: %.2f",precoUnitario);
			break;
			
		case 5:
			precoUnitario = quantidade*8;
			System.out.println("\nProduto: Refrigerante");
			System.out.printf("\nValor total: %.2f",precoUnitario);
			break;
			
		case 6:
			precoUnitario = quantidade*13;
			System.out.println("\nProduto: Suco de Laranja");
			System.out.printf("\nValor total: %.2f",precoUnitario);
			break;
			
		} 

	}

}