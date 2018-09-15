package questao8;

import java.util.Scanner;

public class numberMake {
	private static Scanner scanner;

	public static void main(String[] args) {
		Integer a, b, c, i = 0;
		String aAux, bAux, cAux = "";
		boolean menorA = true, menorB = true;
		scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();

		aAux = a.toString();
		bAux = b.toString();

		while (menorA || menorB) {
			if (i < aAux.length()) {
				cAux = cAux + aAux.substring(i, i + 1);
			} else {
				menorA = false;
			}

			if (i < bAux.length()) {
				cAux = cAux + bAux.substring(i, i + 1);
			} else {
				menorB = false;
			}
			i++;
		}
		if (cAux.length() > 7) {
			c = -1;
		} else {
			c = new Integer(cAux);
		}
		System.out.println(c);
	}

}
