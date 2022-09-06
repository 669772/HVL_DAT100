package oppgaver;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class O3 {
	public static void main(String[] args) {

		String in_tall = showInputDialog("Gi ett tall:");
		long tall = parseInt(in_tall);
		if (tall <= 0) {
			showMessageDialog(null, "Prøv et større tall.");
		} else {
			showMessageDialog(null, tall + " fakultet er: " + factorial(tall));
		}
	}

	public static long factorial(long n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
