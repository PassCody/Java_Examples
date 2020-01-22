package OOP.Lotto;

public class Print {
	
	public Print(int i) {
		System.out.println("Field Number: "+i);
	}
	
	public Print(int[] is, int[] js) {
		System.out.print("Lottery Nubers: ");
		for (int i = 0; i != 5; i++) {
			System.out.print(is[i]+" ");
		}
		System.out.println("");
		System.out.print("Special Nubers: ");
		for (int i = 0; i != 2; i++) {
			System.out.print(js[i]+" ");
		}
		System.out.println("\n");
	}
}