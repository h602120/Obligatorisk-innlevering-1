package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO2 {

	public static void main(String[] args) {
		
		
		
		for (int i=1; i<=10; i++) {
			
			String poengSum = showInputDialog("karakter: ");
			int poeng = Integer.parseInt(poengSum);
			
			
			if (poeng >= 0 && poeng <= 39) {
				showMessageDialog(null, "F");
			}
			else if (poeng >= 40 && poeng <= 49) {
				showMessageDialog(null, "E");
			}
			else if (poeng >= 50 && poeng <=59) {
				showMessageDialog(null, "D");
			}
			else if (poeng >= 60 && poeng <= 79) {
				showMessageDialog(null, "C");
			}
			else if (poeng >= 80 && poeng <= 89) {
				showMessageDialog(null, "B");
			}
			else if (poeng >= 90 && poeng <= 100) {
				showMessageDialog(null, "A");
			}
			else {
				showMessageDialog(null, "ugyldig!");
				i--;
			}	
		}
	}
}
