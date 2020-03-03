package uebung_I;

public class ResaultSetter {
	
	private double resault = 0;

	public ResaultSetter(double[] myarray, int x) {
		switch (x){
			case 1:
				resault = set_resault_addition(myarray[0], myarray[1]);
			break;
			case 2:
				resault = set_resault_subtraktion(myarray[0], myarray[1]);
			break;
			case 3:
				resault = set_resault_multiplikation(myarray[0], myarray[1]);
			break;
			case 4:
				resault = set_resault_divisdieren(myarray[0], myarray[1]);
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
