package uebung_II;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("resource")
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader( new FileReader("src/uebung_I/UebungsMain.java"));
		String line;
		while ((line = reader.readLine()) != null) {
	        System.out.println(line);
	    }
		reader = new BufferedReader( new FileReader("src/uebung_I/NumbersSetter.java"));
		while ((line = reader.readLine()) != null) {
			if (!line.equals("package uebung_I;") && !line.equals("import java.util.Scanner;")) {
				System.out.println(line);
			}
	    }
		reader = new BufferedReader( new FileReader("src/uebung_I/Menue.java"));
		while ((line = reader.readLine()) != null) {
			if (!line.equals("package uebung_I;") && !line.equals("import java.util.Scanner;")) {
				System.out.println(line);
			}
	    }
		reader = new BufferedReader( new FileReader("src/uebung_I/ResaultSetter.java"));
		while ((line = reader.readLine()) != null) {
			if (!line.equals("package uebung_I;") && !line.equals("import java.util.Scanner;")) {
				System.out.println(line);
			}
	    }
		reader = new BufferedReader( new FileReader("src/uebung_I/ProgrammEnd.java"));
		while ((line = reader.readLine()) != null) {
			if (!line.equals("package uebung_I;") && !line.equals("import java.util.Scanner;")) {
				System.out.println(line);
			}
	    }
	}

}
