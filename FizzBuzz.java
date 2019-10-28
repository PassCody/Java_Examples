package I.lernen.Java.Nachhilfe;

/* Importieren von Bibliotheken */
import java.io.*;
import java.awt.*;
import java.util.*;


@SuppressWarnings("unused")
public class FizzBuzz {

	
	public static void main(String[] args) {
		FizzBuzz kons = new FizzBuzz();
	}
	
	public FizzBuzz() {
		for (int i = 0; i != 50; i++) {
			System.out.println(FizzBuzz((int)(Math.random() * 100) + 1));
		}
	}
	
	public String FizzBuzz(int number) {
		int numbers = number;
		if (number % 3 != 0 && number % 5 != 0) {
			return Integer.toString(numbers);
		}
		if (number % 3 == 0 && number % 5 == 0) {
			return "fizzbuzz";
		}
		if (number % 5 == 0) {
			return "buzz";
		}
		if (number % 3 == 0) {
			return "fizz";
		}
		return null;
	}
}
