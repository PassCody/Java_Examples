package uebung_I;

import java.util.Scanner;

public class Menue {
	
	public Menue(Scanner sc, double a, double b) {
		System.out.println("Was möchten Sie mit den Zahlen machen? \n1. Addition \n2. Subtraktion \n3. Multiplikation \n4. Divisdieren");
		ResaultSetter sr;
		double resault;
		double[] myarray = {a, b};
		switch (sc.nextInt()){
			case 1:
				sr = new ResaultSetter(myarray, 1);
				resault = sr.get_resault_addition();
				System.out.println("Das Ergebniss lautet: " + resault);
				new Menue(sc, myarray);
			break;
			case 2:
				sr = new ResaultSetter(myarray, 2);
				resault = sr.get_resault_subtraktion();
				System.out.println("Das Ergebniss lautet: " + resault);
				new Menue(sc, myarray);
			break;
			case 3:
				sr = new ResaultSetter(myarray, 3);
				resault = sr.get_resault_multiplikation();
				System.out.println("Das Ergebniss lautet: " + resault);
				new Menue(sc, myarray);
			break;
			case 4:
				sr = new ResaultSetter(myarray, 4);
				resault = sr.get_resault_divisdieren();
				System.out.println("Das Ergebniss lautet: " + resault);
				new Menue(sc, myarray);
			break;
			default :
				new Menue(sc, a, b);
		}
	}

	public Menue(Scanner sc, double[] myarray) {
		System.out.println("Was möchten Sie nun machen? \n1. Andere Rechnart \n2. Neue Zahlen \n99. Programm Beenden");
		switch (sc.nextInt()){
		case 1:
			new Menue(sc, myarray[0], myarray[1]);
		break;
		case 2:
			UebungsMain.main(null);
		break;
		case 99:
			new ProgrammEnd();
		break;
		default :
			new Menue(sc, myarray);
		}
	}
	
}
