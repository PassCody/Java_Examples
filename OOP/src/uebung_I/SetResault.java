package uebung_I;

public class SetResault {
	
	private double resault = 0;

	public SetResault(double a, double b, int x) {
		switch (x){
			case 1:
				resault = set_resault_addition(a, b);
			break;
			case 2:
				resault = set_resault_subtraktion(a, b);
			break;
			case 3:
				resault = set_resault_multiplikation(a, b);
			break;
			case 4:
				resault = set_resault_divisdieren(a, b);
			break;
		}
		
	}
	
	public double get_resault_divisdieren() {
		return this.resault;
	}

	public double get_resault_multiplikation() {
		return this.resault;
	}

	public double get_resault_subtraktion() {
		return this.resault;
	}

	public double get_resault_addition() {
		return this.resault;
	}
	
	private double set_resault_divisdieren(double a, double b) {
		return (a / b);
	}

	private double set_resault_multiplikation(double a, double b) {
		return (a * b);
	}

	private double set_resault_subtraktion(double a, double b) {
		return (a - b);
	}

	private double set_resault_addition(double a, double b) {
		return (a + b);
	}

}
