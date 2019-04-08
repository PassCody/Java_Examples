package MyFirstProject_Package;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import MyFirstApplet_Package.MyFirstApplet.*;
import MyFirstProject_Package.MyFirstProject.*;

@SuppressWarnings("unused")
public class System_Check {
	
	public static void main(String[] args) {
		System_Check konst = new System_Check();
	}//END OF THE MAIN FUNCTION
		
	public System_Check() {
		init();
	}//END OF THE KONSTRUKTOR FUNCTION
	
	public void init() {
		systemcheck();
	}
	
	public int timer() {
		try {
			System.out.print("Loading compatibility check: ");
			for (int timer = 0; timer != 40; timer++) {
				Thread.sleep(150);
			System.out.print("#");
			}
			for (int timer = 0; timer != 1; timer++) {
				Thread.sleep(150);
				System.out.println(" 100%");
				Thread.sleep(780);
			}
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		return (0);
	}
	
	public void systemcheck() {
		timer();
		try {
			Thread.sleep(1250);
			System.out.println("\n\nCompatibility loading completed!");
			Thread.sleep(1250);
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		Runtime rt = Runtime.getRuntime();
		int ram = (int) ((rt.maxMemory()*4)/1000000000+1);
		int cpu = Runtime.getRuntime().availableProcessors();
		String osName = System.getProperty("os.name");
		String osNameMatch = osName.toLowerCase();
		if (osNameMatch.contains("linux") && ram >= 4 && cpu >= 4) {
			System.out.println("\n\nLinux? You have style my friend!");
			System.out.println("\nCompatibility check is done.");
			System.out.println("\nYou are welcome to use every tool on your OS.");
		}
		else {
			if (osNameMatch.contains("windows") && ram >= 4 && cpu >= 4) {
				System.out.println("\n\nWindows? Thats classic my dude.");
				System.out.println("\nCompatibility check is done.");
				System.out.println("\nYou are welcome to use every tool on your OS.");
			}
			else {
				if (osNameMatch.contains("solaris") || osNameMatch.contains("sunos") && ram >= 4 && cpu >= 4) {
					System.out.println("\n\nSolaris or Sunos? It's ok.");
					System.out.println("\nCompatibility check is done.");
					System.out.println("\nYou are welcome to use every tool on your OS.");
				}
				else {
					System.out.println("\n\nWTF?Shame on you. Please get a new computer.");
					System.out.println("\nCompatibility check is done.");
					System.out.println("\nYou are not welcome to use every tool on your OS.");
				}
			}
		}
		System.out.println("You have: \"" + ram + "\" GB possible RAM.");
		System.out.println("You have: \"" + cpu + "\" CPU possible cores.");
		System.out.println("You are using: \"" + System.getProperty("os.name")+ "\" as OS.");
	}
}
