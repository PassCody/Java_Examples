package uebung_I;

import java.util.Scanner;

public class Menue {
	
	public Menue(Scanner sc, double a, double b) {
		System.out.println("Was möchten Sie mit den Zahlen machen?");
		System.out.println("1. Addition");
		System.out.println("2. Subtraktion");
		System.out.println("3. Multiplikation");
		System.out.println("4. Divisdieren");
		SetResault sr;
		double resault;
		double[] myarray = new double[2];
		myarray[0] = a;
		myarray[1] = b;
		switch (sc.nextInt()){
			case 1:
				sr = new SetResault(a, b, 1);
				resault = sr.get_resault_addition();
				System.out.println("Das Ergebniss lautet: " + resault);
				new Menue(sc, myarray);
			break;
			case 2:
				sr = new SetResault(a, b, 2);
				resault = sr.get_resault_subtraktion();
				System.out.println("Das Ergebniss lautet: " + resault);
				new Menue(sc, myarray);
			break;
			case 3:
				sr = new SetResault(a, b, 3);
				resault = sr.get_resault_multiplikation();
				System.out.println("Das Ergebniss lautet: " + resault);
				new Menue(sc, myarray);
			break;
			case 4:
				sr = new SetResault(a, b, 4);
				resault = sr.get_resault_divisdieren();
				System.out.println("Das Ergebniss lautet: " + resault);
				new Menue(sc, myarray);
			break;
			default :
				new Menue(sc, a, b);
		}
	}

	public Menue(Scanner sc, double[] myarray) {
		System.out.println("Was möchten Sie nun machen?");
		System.out.println("1. Andere Rechnart");
		System.out.println("2. Neue Zahlen");
		System.out.println("99. Programm Beenden");
		double a = myarray[0];
		double b = myarray[1];
		switch (sc.nextInt()){
		case 1:
			new Menue(sc, a, b);
		break;
		case 2:
			uebungs_Main.main(null);
		break;
		case 99:
			new ProgrammEnd();
		break;
		default :
			new Menue(sc, myarray);
		}
	}
	
}
