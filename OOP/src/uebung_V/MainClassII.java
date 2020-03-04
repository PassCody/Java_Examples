package uebung_V;

import java.util.Scanner;

public class MainClassII extends MainClass {
	
	public MainClassII(Scanner sc) {
		System.out.print("Geben Sie etwas ein: ");
		MainInterface.sc.next();
		System.out.println("Object: " + ObjectCreateor() + " has been created.");
	}
	
	public Object ObjectCreateor() {
		NumbersSetter ns = new NumbersSetter(getA(), getB());
		return ns;
	}

	public double getA() {
		return 0;
	}

	public double getB() {
		return 0;
	}
	
}