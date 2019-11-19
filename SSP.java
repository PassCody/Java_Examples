package Schere_Stein_Papier;

import java.util.*;
import java.io.*;
import java.awt.*;

@SuppressWarnings("unused")
public class SSP {
	
	String spieler_Hand;
	String pC_Hand;
	int spieler_Punkte;
	int pC_Punkte;
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		SSP kons1 = new SSP();
	}
	
	public SSP() {
		init();
	}
	
	public void init() {
		System.out.println("Gespielt wird bis zu 3 Punkten.");
		for (int i = 0; spieler_Punkte != 3 && pC_Punkte != 3; i++) {
			spieler_Hand = spieler_eingabe(spieler_Hand);
			pC_Hand = erzeugePSX(pC_Hand);
			punktauswertung(spieler_Hand, pC_Hand);
		}
	}
	
	public String spieler_eingabe(String x)  {
		x = sc.next();
		return x;
	}
	
	public String erzeugePSX(String y) {
		int z;
		z = (int) Math.random() * 3 + 1;
		if (z == 1) {
			y = "P";
		}
		else {
			if (z == 2) {
				y = "S";
			}
			else {
				y = "X";
			}
		}
		return y;
	}
	
	public void punktauswertung(String x, String y) {
		//Spieler = x
		// Computer = y
		if (x == y) {
			System.out.println("Zwei Idioten ein gedanken.")
		}
		else {
			
		}
		return ;
	}
}
