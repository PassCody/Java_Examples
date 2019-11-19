package oop;

public class RechteckMain {

	String r1 = null;

	public static void main(String[] args) {
		Rechteck r1 = new Rechteck();
		r1.hoehe = 5;
		r1.breite = 3;
		
		Rechteck r2 = new Rechteck();
		r2.hoehe = 2;
		r2.breite = 7;
		

		print(r1.hoehe, r1.breite);
		System.out.println(r1.hoehe + " | " + r1.breite);
		System.out.println("Fläche: " + getFlaeche(r1.hoehe, r1.breite));
		System.out.println("Neue Fläche: " + anpassenGroesse(r1.hoehe, r1.breite));

		print(r2.hoehe, r2.breite);
		System.out.println(r2.hoehe + " | " + r2.breite);
		System.out.println("Fläche: " + getFlaeche(r2.hoehe, r2.breite));
		System.out.println("Neue Fläche: " + anpassenGroesse(r1.hoehe, r1.breite));
	}
	
	static void print(int x1, int x2) {
		System.out.println("Höhe" + x1);
		System.out.println("Breite" + x2);
	}
	
	static int getFlaeche(int x1, int x2) {
		int flaeche = x1 * x2;
		return flaeche;
	}
	
	static int anpassenGroesse(int x1, int x2) {
		x1 = 
		int flaeche = x1 * x2;
		return flaeche;
	}

}
