package I.lernen.Java.Nachhilfe;

/* Importieren von Bibliotheken */

public class FizzBuzz {

	
	public static void main(String[] args) {
		FizzBuzz kons = new FizzBuzz();
	}
	
	public FizzBuzz() {
		for (int i = 1; i != 51; i++) {
			System.out.println(FizzBuzz(i));
		}
	}
	
	public String FizzBuzz(int number) {
		try {
			Thread.sleep(1000);
			// FizzBuzz check
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
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		    return null;
		}
		return null;
	}
}
