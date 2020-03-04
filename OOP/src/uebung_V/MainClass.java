package uebung_V;

import java.util.Scanner;

interface NumbersGetters {
	public double getA();
	public double getB();
	Scanner sc = new Scanner(System.in);
}

interface MainInterface extends NumbersGetters {
	public Object ObjectCreateor();
}

public abstract class MainClass implements MainInterface {
	
	public static void main(String[] args) {
		new MainClassII(MainInterface.sc);
	}
	
}