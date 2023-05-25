package lacosCondicionado;

import java.util.Scanner;

public class ExerLacoCondicionado3 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		 String nome;
		 int idade;
		 boolean primeira = true ;
		 
		 System.out.print("Bem Vinde! ");
		 
		 System.out.println("Digite o seu nome: ");
		 nome = ler.next();
		 
		 System.out.println("\nDigite a sua idade: ");
		 idade = ler.nextInt();
		 
		System.out.println("\nSe for sua primeira doação digite -true- caso nao for digite -false-.");
	    primeira = ler.nextBoolean();

		 
		 if (idade >= 18 && idade <=69) {
			 System.out.println("Você "+ nome + " está apto a doar.");
		 } else if(idade <= 18 && idade >= 69) {
			 System.out.println("Você " + nome + " não está apto a doar.");
			 primeira=true;
			 
			 
		 } else if (idade >= 60 && idade <= 69) {
			 System.out.println("Você " + nome + " está apto a doar. ");
			 primeira=true;}
			 else {
				 System.out.println("Você " + nome + " não está apto a doar.");
			 }
			
			 
		 }
		  
		 

	}


