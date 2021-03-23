package Chiffre;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Chiffre {
	
	char[] input;
	char[] key;
	char[] encoded;
	char[] decoded;
	Scanner scII;
	
	public Chiffre(String string, Charset utf8) {
		init(string);
		menue();
	}
	
	private void menue() {
		scII = new Scanner(System.in);
		System.out.println("Möchten sie das ganze wieder Entschlüsseln? (J/N)");
		String checker;
		checker = scII.next();
		char convertedChecker = checker.charAt(0);
		if (convertedChecker == 'J' || convertedChecker == 'j') {
			scII.close();
			startDecode(key, encoded);
		}
		else {
			if (convertedChecker == 'N' || convertedChecker == 'n') {
				scII.close();
				System.exit(0);
			}
			else {
				menue();
			}
		}
	}
	
	public void init(String string) {
		input = new char[string.length()];
		key = new char[string.length()];
		encoded = new char[string.length()];
		setInput(string, input);
		setKey(string, key);
		setEncoded(string, encoded, input, key);
		getInput(input);
		getKey(key);
		getEncoded(encoded);
	}
	
	private void startDecode(char[] key, char[] encoded) {
		System.out.print("\n");
		decoded = new char[key.length];
		for (int i = 0; i < key.length; i++) {
			int x = ((int) encoded[i]);
			int x2 = ((int) key[i]);
			char ende = ((char)((x-x2)%256));
			decoded[i] = ende;
		}
		System.out.println("Entschlüsselte Nachricht: ");
		getDecoded(decoded);
	}
	
	private void getDecoded(char[] decoded) {
		for (int i = 0; i < decoded.length; i++) {
			if (((int)decoded[i]) == 65452 || ((int)decoded[i]) == 172) {
				System.out.print("€");
			}
			else {
				System.out.print(decoded[i]);
			}
		}
	}

	private void getEncoded(char[] encoded) {
		System.out.println("Encoded: ");
		System.out.println(encoded);
		System.out.println();
	}

	private void getKey(char[] key) {
		System.out.println("Key: ");
		System.out.println(key);
		System.out.println();
	}

	private void getInput(char[] input) {
		System.out.println("Input: ");
		System.out.println(input);
		System.out.println();
	}

	private void setEncoded(String string, char[] encoded, char[] input, char[] key) {
		for (int i = 0; i < string.length(); i++) {
			encoded[i] = encode(input[i], key[i]);
		}
	}

	private void setKey(String string, char[] key) {
		for (int i = 0; i < string.length(); i++) {
			key[i] = (char) ((int)(Math.random() * 93) + 33);
		}
	}

	private void setInput(String string, char[] input) {
		for (int i = 0; i < string.length(); i++) {
			input[i] = (char) string.charAt(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie das Gehalt an:");
		float gehalt = (float) sc.nextInt();
		Chiffre ce = new Chiffre("Sie haben ein Gehalt von "+gehalt+"€, erhalten." ,StandardCharsets.UTF_8);
	}

	public char encode(char input, char key) {
		int x = ((int) input);
		int x2 = ((int) key);
		char ende = ((char)((x2+x)%256));
		return ende;
	}
	
}
