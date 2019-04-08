/* Author and Coder: PassCody*/



package de.passcody.github;

/* IMPORT JAVA PACKAGES */

import java.util.*;
import java.io.*;
import java.awt.*;

/* IGNORING UNUSED PACKAGES */
@SuppressWarnings("unused")

/* BEGIN OF THE PROGRAM */
public class Constructor {
	
	public static void main(String[] args) {

		int[] Array = new int[2];

		int param1 = 5;

		String param2 = "Test";

		Constructor e1 = new Constructor();

		Constructor e2 = new Constructor(param1, param2);

		Array[0] = param1;

		Array[1] = param1 + param1;

		Constructor e3 = new Constructor(Array[0], Array[1]);
	}
	
	public Exercises_II() {
		System.out.println("Not overloaded");
		System.out.println("");
	}
	
	public Exercises_II(int param1, String param2) {
		System.out.println("Overloaded 1");
		System.out.println("Params: " + param1 + " " + param2);
		System.out.println("");
	}

	public Exercises_II(int i, int j) {
		System.out.println("Overloaded 2");
		System.out.println("Params: " + i + " " + j);
	}
}
