package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		String nummer = showInputDialog ("Skriv inn heltall: ");
		
		int n = Integer.parseInt(nummer);
		
		System.out.println(n * fakultet(n-1));
		
	} 

public static int fakultet(int n) {
	
	if (n == 1) return n;
	
	return n * fakultet(n-1);
	
}

		
				
}
