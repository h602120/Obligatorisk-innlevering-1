package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lag.Double.*;

public class OppgaveO1 {

	public static void main(String[] args) {
		String bruttoInntekt = showInputDialog("Din bruttoinntekt:");
		int nettoInntekt = Integer.parseInt(bruttoInntekt);
		
		double skatteTrinn0 = 0;
		double skatteTrinn1 = 0.017;
		double skatteTrinn2 = 0.04;
		double skatteTrinn3 = 0.132;
		double skatteTrinn4 = 0.162;
		
		if (nettoInntekt >= 0 && nettoInntekt <= 184800) {
			showMessageDialog(null, "Skattetrinnet du har er: " + nettoInntekt * skatteTrinn0);
		}
		else if (nettoInntekt >= 184801 && nettoInntekt <= 260100) {
			showMessageDialog(null, "Skatten du har er: " + nettoInntekt * skatteTrinn1);
		}
		else if (nettoInntekt >= 260101 && nettoInntekt <= 651250) {
			showMessageDialog(null, "Skatten du har er: " + nettoInntekt * skatteTrinn2);
		}
		else if (nettoInntekt >= 651251 && nettoInntekt <= 1021550) {
			showMessageDialog(null, "Skatten du har er: " + nettoInntekt * skatteTrinn3);
		}
		else if (nettoInntekt >= 1021551) {
			showMessageDialog(null, "Skatten du har er: " + nettoInntekt * skatteTrinn4);
		}
		
		
		

	}

}
