class Main {
	String[] word = new String[7];
	
	public static void main(String[] args) {
		Main kons = new Main();
	}
	
	public Main() {
		init();
	}
	
	public void init() {
		first_out_put();
		secound_out_put();
		third_out_put();
		fourth_out_put();
		fifth_out_put();
		sixth_out_put();
		seventh_out_put();
		load_more();
	}
	
	public void seventh_out_put() {
		word[6] = "Statement!";
	}
	
	public void fourth_out_put() {
		word[3] = "Semicolon(;)";
	}
	
	public void sixth_out_put() {
		word[5] = "My";
	}
	
	public void first_out_put() {
		spacer();
		sleep();
		word[0] = "You";
	}
	
	public void fifth_out_put() {
		word[4] = "To";
	}
	
	public void third_out_put() {
		word[2] = "My";
	}
	
	public void secound_out_put() {
		word[1] = "Are";
	}

	public void load_more() {
		spacer();
		sleep();
		for (int i = 0; i != 7; i++) {
			System.out.print(word[i] + " ");
			text_sleep();
		}
		System.out.println("");
		System.out.println("♥ I miss you... ♥");
		system_exit();
	}
	
	public void spacer() {
		for (int i = 0; i != 12; i++) {
			System.out.println("\n");
		}
	}
	
	public void text_sleep() {
		try {
			for (int timer = 0; timer != 40; timer++) {
				Thread.sleep(50);
			}
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
	
	public void sleep() {
		try {
			System.out.print("Loading output: ");
			for (int timer = 0; timer != 40; timer++) {
				Thread.sleep(50);
			System.out.print("#");
			}
			System.out.println("");
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
	
	public void system_exit() {
		System.out.println("See you as soon as possible ;)");
		System.out.println("Please write me back when you get time :)");
		System.exit(0);
	}
}
