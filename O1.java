package oppgaver;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class O1 {
	static public void main(String[] args) {
		
		String inntekt = showInputDialog ("Bruttointekt: ");
		
		int lonn = parseInt(inntekt);
		
		double[] sats = {0.0, 0.093, 0.241, 1.152, 1.452};
		
		if (lonn < 164100) {
			showMessageDialog(null, sats[0] * lonn + " i trinnskatt");
		} 
		else if (lonn > 164100 && lonn <= 230950) {
			showMessageDialog(null, sats[1] * lonn + " i trinnskatt");
		}
		else if (lonn > 230950 && lonn <= 580650) {
			showMessageDialog(null, sats[2] * lonn + " i trinnskatt");
		}
		else if (lonn > 580650 && lonn <= 934050) {
			showMessageDialog(null, sats[3] * lonn + " i trinnskatt");
		}
		else if (lonn > 934050) {
			showMessageDialog(null, sats[4] * lonn + " i trinnskatt");
		}		
		
	}	
}
	