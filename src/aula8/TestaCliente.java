package aula8;

import aula8.Cliente;


public class TestaCliente {

	public static void main(String[] args) {
		
	Cliente c1 = new Cliente("Tais" , 18, "Brasil" , "São Paulo", "Diadema");
	c1.visualizar();
	System.out.println();
	
	Cliente c2 = new Cliente("Magnolia", 20 , "Argentina", "Provincia Rio Negro", "Bariloche");
	c2.visualizar();
	System.out.println();
	
	
		
	}
}
