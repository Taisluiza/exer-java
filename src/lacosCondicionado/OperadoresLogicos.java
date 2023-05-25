package lacosCondicionado;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			int proat;
			int trab;
			
			System.out.println("Digite sua nota de proatividade: ");
			proat = ler.nextInt();
			
			System.out.println("\nDigite sua nota de trabalho em equipe: ");
			trab = ler.nextInt();
			
			System.out.println("\n É preciso ter as duas notas 4. ");
			if (proat == 4 && trab == 4){
				System.out.println("Parabéns!  Duas notas 4!! ");
			}
			  else  {
				System.out.println("Sinto muito, você não possui duas notas 4! ");
				}
			
			
	}

}
