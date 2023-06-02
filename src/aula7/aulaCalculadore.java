package aula7;
import java.util.Scanner;

public class aulaCalculadore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		float numero1 = 0, numero2 = 0;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 =leia.nextFloat();
		
		System.out.println("Digite o segundo numero: ");
		numero2 =leia.nextFloat();
		
		//exibir o resultao de cada operação
		
		System.out.println("Soma  = " + soma(numero1, numero2));
		System.out.println("Subtração  = " + subtracao(numero1, numero2));
		System.out.println("Multiplicação  = " + multiplicacao(numero1, numero2));
		System.out.println("Divisão = " + divisao(numero1, numero2));
		
		//Executa o Método void turmo ()
		
		turma();
		
		//Executar o metodo float somo() com valores inseridos de forma direta
		
		System.out.println("\nSoma de alores inseridos de forma direta = " + soma(10.0f, 5.0f));
		
		//finaliza o objeto leia
		leia.close();
	}
	
		//metodo soma com 2 parametro float
		
		public static float soma(float numero1, float numero2) {
			return numero1 + numero2;
		}
		
		//metodo subtração com 2 parametro float
		
		public static float subtracao(float numero1, float numero2) {
			return numero1 - numero2;}
			
			//metodo multilicação com 2 parametro float
			
			public static float multiplicacao(float numero1, float numero2) {
				return numero1 * numero2;}
				
				//metodo divisao com 2 paramentro float
				
				public static float divisao(float numero1, float numero2) {
					return numero1 / numero2;}
					
					//metodo turma() do tipo void
					public static void turma() {
						System.out.println("\nCalculadora da Turma!!!");}
						
					
				
			
		
		
		
		
		
	

}
