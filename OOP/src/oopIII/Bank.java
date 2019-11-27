package oopIII;

public class Bank {
	String name;
	int bankleitzahl;
	GiroKonto[] giroKonto;
	
	
	public Bank(String name, int bankleitzahl) {
		giroKonto = new GiroKonto[10];
	}
	
	public Bank (int GiroKonten, String name, int Bankleitzhal) {
		giroKonto = new GiroKonto[GiroKonten];
	}
	
	/* GETER PART */
	public String getName() {
		return name;
	}
	public int getBankleitzahl() {
		return bankleitzahl;
	}
	public GiroKonto[] getGiroKonto() {
		return giroKonto;
	}
	
	/* SETER PART */
	public void setName(String name) {
		this.name = name;
	}
	public void setBankleitzahl(int bankleitzahl) {
		this.bankleitzahl = bankleitzahl;
	}
	public void setGiroKonto(GiroKonto[] giroKonto) {
		this.giroKonto = giroKonto;
	}

	public String neuesKonto(double startGuthaben, String besitzer) {
		return besitzer;
	}

	public void print() {
		
	}

	public char[] isValid(String iban) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean loescheKonto(String kontoNr) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean ueberweise(String kontoNr, double betrag) {
		// TODO Auto-generated method stub
		return false;
	}
}