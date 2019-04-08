/* Author and Coder: PassCody*/



package de.passcody.github;

/* IMPORT JAVA PACKAGES */

import java.util.*;
import java.io.*;
import java.awt.*;

/* IGNORING UNUSED PACKAGES */
@SuppressWarnings("unused")

/* BEGIN OF THE PROGRAM */
public class Param {
	
	/* DEKLARATION SCANNER */
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Exercises_I e1 = new Exercises_I();
	}
	
	public Param() {
		double a_side = 0, b_side = 0, h_side = 0;
		
		/* USER INPUTS */
		
		System.out.print("What size does the Side A have? ");
		a_side = sc.nextDouble();
		System.out.print("What size does the Side B have? ");
		b_side = sc.nextDouble();
		System.out.print("What size does the Side H have? ");
		h_side = sc.nextDouble();
		
		/* SUBROUTINE CALLS */
		
		System.out.println("The area has a size of: " + init_I(a_side, b_side) + " cm²");
		System.out.println("The hypotenuse has a size of: " + init_II(a_side, b_side) + " cm");
		System.out.println("The hypotenuse has a size of: " + init_III(a_side, b_side) + " Zoll");
		System.out.println("The volume has a size of: " + init_IV(a_side, b_side, h_side) + " cm³");
	}

	public double init_I(double a_side, double b_side) {
		double summe;
		return summe = a_side * b_side;
	}
	
	public double init_II(double a_side, double b_side) {
		double summe;
		return summe = ((a_side * a_side) + (b_side * b_side));
	}
	
	public double init_III(double a_side, double b_side) {
		double summe;
		return summe = ((a_side * a_side) + (b_side * b_side) / 2.55);
	}
	
	private double init_IV(double a_side, double b_side, double h_side) {
		double summe;
		return summe = ((a_side * b_side) * h_side);
	}
}
