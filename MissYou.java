import java.util.*;
import java.io.*;
import java.awt.*;

@SuppressWarnings("unused")
public class YouAreMy {

	public static void main(String[] args) {
		YouAreMy kons = new YouAreMy();
	}
	
	public YouAreMy() {
		init();
	}
	
	public void init() {
		for (int i = 0; i != 12; i++) {
			System.out.println("\n");
		}
		try {
			System.out.print("Loading output: ");
			for (int timer = 0; timer != 40; timer++) {
				Thread.sleep(50);
			System.out.print("#");
			}
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		for (int i = 0; i != 12; i++) {
			System.out.println("\n");
		}
		first_out_put();
		secound_out_put();
		third_out_put();
		fourth_out_put();
		fifth_out_put();
		sixth_out_put();
		seventh_out_put();
		load_more();
	}
	
	public void first_out_put() {
		System.out.println("You");
		try {
			System.out.print("Loading more output: ");
			for (int timer = 0; timer != 40; timer++) {
				Thread.sleep(50);
			System.out.print("#");
			}
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		for (int i = 0; i != 12; i++) {
			System.out.println("\n");
		}
	}
	
	public void secound_out_put() {
		System.out.println("Are");
		try {
			System.out.print("Loading more output: ");
			for (int timer = 0; timer != 40; timer++) {
				Thread.sleep(50);
			System.out.print("#");
			}
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		for (int i = 0; i != 12; i++) {
			System.out.println("\n");
		}
	}
	
	public void third_out_put() {
		System.out.println("My");
		try {
			System.out.print("Loading more output: ");
			for (int timer = 0; timer != 40; timer++) {
				Thread.sleep(50);
			System.out.print("#");
			}
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		for (int i = 0; i != 12; i++) {
			System.out.println("\n");
		}
	}
	
	public void fourth_out_put() {
		System.out.println("semicolon(;)");
		try {
			System.out.print("Loading more output: ");
			for (int timer = 0; timer != 40; timer++) {
				Thread.sleep(50);
			System.out.print("#");
			}
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		for (int i = 0; i != 12; i++) {
			System.out.println("\n");
		}
	}
	
	public void fifth_out_put() {
		System.out.println("To");
		try {
			System.out.print("Loading more output: ");
			for (int timer = 0; timer != 40; timer++) {
				Thread.sleep(50);
			System.out.print("#");
			}
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		for (int i = 0; i != 12; i++) {
			System.out.println("\n");
		}
	}
	
	public void sixth_out_put() {
		System.out.println("My");
		try {
			System.out.print("Loading more output: ");
			for (int timer = 0; timer != 40; timer++) {
				Thread.sleep(50);
			System.out.print("#");
			}
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		for (int i = 0; i != 12; i++) {
			System.out.println("\n");
		}
	}
	
	public void seventh_out_put() {
		System.out.println("Statement!");
		try {
			System.out.print("Loading more output: ");
			for (int timer = 0; timer != 40; timer++) {
				Thread.sleep(50);
			System.out.print("#");
			}
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		for (int i = 0; i != 12; i++) {
			System.out.println("\n");
		}
	}

	public void load_more() {
		System.out.println("Load more?");
		System.out.println("Enter \"Yes\" for Yes.");
		System.out.println("Enter \"anything else\" for No (system ends).");
		Scanner sc = new Scanner(System.in);
		String checker;
		checker = sc.nextLine();
		sc.close();
		if (checker == "1") {
			try {
				System.out.print("Loading output: ");
				for (int timer = 0; timer != 40; timer++) {
					Thread.sleep(50);
				System.out.print("#");
				}
			}
			catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			for (int i = 0; i != 12; i++) {
				System.out.println("\n");
			}
			System.out.println("You are my semicolon(;) to my statement.");
			System.out.println("♥ I miss you... ♥");
			system_exit();
		}
		else {
			try {
				System.out.print("Loading system exit: ");
				for (int timer = 0; timer != 40; timer++) {
					Thread.sleep(50);
				System.out.print("#");
				}
			}
			catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			for (int i = 0; i != 12; i++) {
				System.out.println("\n");
			}
			system_exit();
		}
	}
	
	public void system_exit() {
		System.out.println("See you ;)");
		System.exit(0);
	}
}
