package oopII;

import java.util.*;

@SuppressWarnings("unused")
public class Fahrzeug {
	
	private String f_name;
	private int z_gew, km_preis;
	Scanner sc = new Scanner(System.in);
	
	public static void main( String[] args) {
		Fahrzeug fz = new Fahrzeug();
	}
	
	public Fahrzeug() {
		setF_name();
		setZ_gew();
		setKm_preis();
		drucken();
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name() {
		System.out.print("Bitte geben Sie ihr Fahrzeugnamen an: ");
		this.f_name = sc.nextLine();
	}

	public int getZ_gew() {
		return z_gew;
	}

	public void setZ_gew() {
		System.out.print("Bitte geben Sie das zuläassige Gesamtgewicht an: ");
		this.z_gew = sc.nextInt();
	}

	public int getKm_preis() {
		return km_preis;
	}

	public void setKm_preis() {
		System.out.print("Bitte geben Sie ihre gefahrenen Kilometer an: ");
		this.km_preis = sc.nextInt();
	}
	
	public void drucken() {
		System.out.println("Fahrzeugname: " + getF_name());
		System.out.println("Maximales Zuladungsgewicht: : " + getZ_gew() + "Km");
		System.out.println("Kilometerpreis: " + getKm_preis() + "€");
	}
} 
