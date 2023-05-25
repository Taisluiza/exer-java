package lacosCondicionado;

import java.util.Scanner;

public class ExerCondicionado4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String caract1, caract2, caract3, caractFinal;
		System.out.println("Digite as caracteristica do animal (Vertebrado/invertebrado): ");
		caract1 = ler.next();
		System.out.println("Digite as caracteristica  ave/mamifero/inseto/anelídeo: ");
		caract2 = ler.next();
		System.out.println("Digite as caracteristica  carnivoro/onivoro/herbivoro/hematófago: ");
		caract3 = ler.next();

		if (caract1.equalsIgnoreCase("vertebrado")) {
			if (caract2.equalsIgnoreCase("ave")) {
				if (caract3.equalsIgnoreCase("carnivoro")) {
					System.out.println("Águia");

				} else {
					System.out.println("Pombo.");
					
				}
			} else {
				if(caract2.equalsIgnoreCase("onivoro")) {
					System.out.println("Pessoa.");
				}else {
					System.out.println("Vaca");
				}
			}
		}
		
		if(caract2.equalsIgnoreCase("inseto")) {
			if (caract3.equalsIgnoreCase("hematofago")) {
				System.out.println("Pulga");
			}
			else {
				if(caract2.equalsIgnoreCase("inseto")) {
					if(caract3.equalsIgnoreCase("herbivoro")) {
					System.out.println("Largata");
					
				} if(caract2.equalsIgnoreCase("Anelideo")) {
					if(caract3.equalsIgnoreCase("hematofago")) {
						System.out.println("Sanguessuga.");
					}
						else {
							if(caract2.equalsIgnoreCase("Anelideo")) {
							if(caract3.equalsIgnoreCase("onivoro")) {
								System.out.println("Minhoca.");
								
							}
								
							}
						}
					}
					
				}
				}
			}
		}

	}


