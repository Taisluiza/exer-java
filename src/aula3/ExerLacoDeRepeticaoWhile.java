package aula3;

import java.util.Scanner;

public class ExerLacoDeRepeticaoWhile {

	public static void main(String[] args) {
		//Exercicio laco de repeticao while
		
		int idade,cMenor21 = 0 , cMaior50 = 0, contador;
		String continua="-1";
		
        Scanner leia = new Scanner(System.in);
        
        
       
    	   System.out.println("Digite uma idade: ");
       idade = leia.nextInt();
    	   
    	   
       while(continua.equals("-1")) {
       
    	   if(idade < 21 && idade >=0) {
    		   cMenor21++;}
    	   if (idade>50) {
    		   cMaior50++;}
    	   
    	   if (idade <=0) {
       
       
       System.out.println("Total de pessoas com idade menor que 21 anos: " + cMenor21);
       System.out.println("Total de pessoas com idade maior que 50 anos: " + cMaior50);
       }
       
       }
       }
	}
}
