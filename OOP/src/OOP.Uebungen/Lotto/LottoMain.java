package OOP.Lotto;

import java.util.*;

public class LottoMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		System.out.print("Wie viele Felder möchten Sie ausgeben? ");
		count = sc.nextInt();
		for (int i = 0; i != count; i++) {
			new Print(i+1);
			Numbers[] numbers = new Numbers[count];
			numbers[i] = new Numbers();
		}
		sc.close();
		System.out.println("\n\nProgram Ending");
		System.exit(0);
	}
}