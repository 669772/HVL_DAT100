package oppgaver;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class O2 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			String poeng_sum = showInputDialog("Gi din poeng sum: ");
			int poeng = parseInt(poeng_sum);

			if (poeng < 0 || poeng > 100) {
				showMessageDialog(null, "Ugyldig poeng sum prøv på nytt.");
				i--;
			} else {

				if (poeng >= 0 && poeng <= 39) {
					showMessageDialog(null, "Karakter: F");
				} else if (poeng >= 40 && poeng <= 49) {
					showMessageDialog(null, "Karakter: E");
				} else if (poeng >= 50 && poeng <= 59) {
					showMessageDialog(null, "Karakter: D");
				} else if (poeng >= 60 && poeng <= 79) {
					showMessageDialog(null, "Karakter: C");
				} else if (poeng >= 80 && poeng <= 89) {
					showMessageDialog(null, "Karakter: B");
				} else if (poeng >= 90 && poeng <= 100) {
					showMessageDialog(null, "Karakter: A");
				}
			}
		}
	}
}