package uebung_I;

import java.util.Scanner;

public class setNumbers {
	
	private double a, b;
	
	public setNumbers() {
		Scanner sc = new Scanner(System.in);
		setA(sc);
		setB(sc);
		getNumbers(sc);
	}
	
	public void getNumbers(Scanner sc) {
		System.out.println("Sie haben die Zahlen " + (getA()) + " und " + (getB()) + " Eingegeben.");
		System.out.println("Alles Erledigt? (J für Ja, N für Nein)");
		char y_n = sc.next().charAt(0);
		if (y_n == 'J' || y_n == 'j') {
			new Menue(sc, getA(), getB());
		}
		else {
			return;
		}
	}

	public double getA() {
		return a;
	}

	public void setA(Scanner sc) {
		System.out.print("Bitte geben Sie eine Zahl ein: ");
		this.a = sc.nextDouble();
	}

	public double getB() {
		return b;
	}

	public void setB(Scanner sc) {
		System.out.print("Bitte geben Sie eine Zahl ein: ");
		this.b = sc.nextDouble();
	}
}
