package de.passcody.github;

import java.util.*;
import java.io.*;
import java.awt.*;

@SuppressWarnings("unused")
public class Love {
	
	Scanner sc = new Scanner(System.in);
	String personA = "Tamara", personB = "Christian";
	int inlove[] = new int[2];
	
	public static void main(String[] args) {
		Love kons1 = new Love();
	}
	
	public Love() {
		init();
	}
	
	public void init() {
		System.out.println("#HIND: 1 for yes, 2 for no ");
		for (int i = 0; i != 2; i++) {
			love_check(i);
		}
		if (inlove[0] == inlove[1]) {
			love_kiss();
			love_cuddling();
			love_love();
		}
		else {
			System.exit(1);
		}
	}
	
	public void love_check(int i2) {
		if (i2 == 0) {
			System.out.print("Liebt " + personA + " " + personB + "?");
			inlove[i2] = sc.nextInt();
		}
		if (i2 == 1) {
			System.out.print("Liebt " + personB + " " + personA + "?");
			inlove[i2] = sc.nextInt();
		}
	}
	
	public void love_kiss() {
		System.out.println(personA + " is kissing " + personB);
	}
	
	public void love_cuddling() {
		System.out.println(personB + " is cuddling " + personA);
	}
	
	public void love_love() {
		System.out.println(personB + " and " + personA + " having sex.");
	}
}
