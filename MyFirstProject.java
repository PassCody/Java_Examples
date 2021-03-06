/* Author and Coder: PassCody*/



package MyFirstProject_Package;

import java.awt.*;
import java.io.*;
import java.util.*;
import MyFirstApplet_Package.MyFirstApplet.*;


@SuppressWarnings({ "unused" })
public class MyFirstProject extends Thread{
	/* VARIABLE DECLARATION */
	//DECLEAR SCANNER//
	Scanner sc = new Scanner(System.in);
	//DECLEAR STRINGS//
	String firstname, lastname;
	//DECLEAR INTEGER//
	int menue, awnserI, userage, awnserII, awnserIII, awnserVI;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		//CONSTRUCTOR CREATION//
		MyFirstProject konst = new MyFirstProject();
	}//END OF THE MAIN FUNCTION
	
	public MyFirstProject() {
		init();
	}//END OF THE KONSTRUKTOR FUNCTION
	
	public void init() {
		System.out.println("Hello User. What's your name?");
		namecheckloopI:
		for (int i = 1; i != 0; i++) {
			System.out.print("Please tell me your firstname: ");
			firstname = sc.next();
			System.out.print("Please tell me your lastname: ");
			lastname = sc.next();
			int checkI, checkII;
			try {
				if ((checkI = Integer.parseInt(firstname)) < 2147483647) {
					System.out.println("Numbers aren't allowed for names.");
					System.out.println("Please try again but this time correctly.");
					init();
				}
				else {
					if ((checkI = Integer.parseInt(firstname)) == 2147483647) {
						System.out.println("Numbers aren't allowed for names.");
						System.out.println("Please try again but this time correctly.");
						init();
					}
				}
			}
			catch(NumberFormatException ex){
				try {
					if ((checkII = Integer.parseInt(lastname)) < 2147483647) {
						System.out.println("Numbers aren't allowed for names.");
						System.out.println("Please try again but this time correctly.");
						init();
					}
					else {
						if ((checkII = Integer.parseInt(lastname)) == 2147483647) {
							System.out.println("Numbers aren't allowed for names.");
							System.out.println("Please try again but this time correctly.");
							init();
						}
					}
				}
				catch(NumberFormatException exI){
					System.out.println("All right. Your name is: " + firstname + " " + lastname);
					System.out.println("Is this right? Please type 1 for \"Yes\" or 2 for \"No\"");
					for (int k = 1; k != 0; k ++) {
						awnserI = sc.nextInt();
						if (awnserI == 1) {
							awnserI = 0;
							break namecheckloopI;
						}
						else {
							if (awnserI == 2) {
								awnserI = 0;
								break;
							}
							else {
								System.out.println("The Number \"" + awnserI + "\" isn't available.");
								System.out.println("Please try again but this time correctly.");
							}
						}
					}
				}
			}
		}
		System.out.println("In which year are you born?");
		Calendar cal = new GregorianCalendar();
		int year = cal.get(Calendar.YEAR);
		userage = year - sc.nextInt();
		if (userage < 18) {
			System.out.println("Ooooh... you are "+ userage +"? I think that's a bit too young but let us keep going.");
		}
		else {
			if (userage == 18) {
				System.out.println("Sweet 18!");
			}
			else {
				if (userage > 75) {
						System.out.println("Are you sure about your age of " + userage + "?");
					}
				
				else {
					if (userage > 18) {
					System.out.println("Ooooh... you are "+ userage +"? You getting old my friend ;).");
					}
				}
			}
		}
		try {
			System.out.print("Loading Main Menue: ");
			for (int timer = 0; timer != 40; timer++) {
				Thread.sleep(50);
			System.out.print("#");
			}
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		menue();
	}//END OF THE INIT FUNCTION
	
	public void menue() {
		for (int i = 0; i != 12; i++) {
			System.out.println("\n");
		}
		System.out.println("Welcome " + firstname + " " + lastname + ".");
		System.out.println("What would you like to do now?");
		System.out.println("1. Calculator");
		System.out.println("2. Lottery Number Generator");
		System.out.println("99. Exit the Programm");
		awnserI = 0;
		for (int i = 1; i != 0; i++) {
			awnserI = sc.nextInt();
			if (awnserI == 1) {
				awnserI = 0;
				calculator();
			}
			else {
				if (awnserI == 2) {
					awnserI = 0;
					lotterynumbgen();
				}
				else {
					if (awnserI == 99) {
						system_exit();
					}
					else {
						System.out.println("The Number '" + awnserI + "' isn't available.");
						System.out.println("Please try again but this time correctly.");
					}
				}
			}
		}
	}//END OF THE MENUE FUNCTION
	
	public void calculator() {
		try {
			System.out.print("Loading Calculator: ");
			for (int timer = 0; timer != 40; timer++) {
				Thread.sleep(10);
			System.out.print("#");
			}
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		for (int i = 0; i != 12; i++) {
			System.out.println("\n");
		}
		
		try {
			Runtime.getRuntime().exec("C:\\Windows\\System32\\calc.exe");
		    try {
		    	System.out.println("Just gave me a secound");
			    Thread.sleep(1550);
			    menue();
			}
			catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			    menue();
			}
		    
		}
		catch (IOException e) {
		    e.printStackTrace();
		}
	}//END OF THE CALCULATOR FUNCTION
	
	public void lotterynumbgen() {
		try {
			System.out.print("Loading Lottery Number Generator: ");
			for (int timer = 0; timer != 40; timer++) {
				Thread.sleep(10);
			System.out.print("#");
			}
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		menue = 0;
		for (int i = 0; i != 12; i++) {
			System.out.println("\n");
		};
		System.out.println("Welcome " + firstname + " " + lastname + " to the PassLotteryNumberGenerator.");
		System.out.println("What kind of lottery would you like to have completed?");
		System.out.println("1. Normal Lottery");
		System.out.println("2. Euro Jackpot");
		System.out.println("99. Exit the Programm");
		for (int i = 1; i != 0; i++) {
			menue = sc.nextInt();
			if (menue == 1) {
				System.out.println("How many Fields do you want to fill out?");
				awnserIII = sc.nextInt();
				menue = 0;
				normal_lottery();
			}
			else {
				if (menue == 2) {
					System.out.println("How many Fields do you want to fill out?");
					awnserIII = sc.nextInt();
					menue = 0;
					euro_jackpot();
				}
				else {
					if (menue == 99) {
						system_exit();
					}
					else {
						System.out.println("The Number '" + awnserI + "' isn't available.");
						System.out.println("Please try again but this time correctly.");
					}
				}
			}
		}
	}//END OF THE LOTTRTYNUMBGEN FUNCTION
	
	public void normal_lottery() {
		try {
			System.out.print("Loading Normal Lottery Number Generator: ");
			for (int timer = 0; timer != 40; timer++) {
				Thread.sleep(10);
			System.out.print("#");
			}
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		for (int i = 0; i != 12; i++) {
			System.out.println("\n");
		};
		int fieldcont;
		
		for (int lottery = 0; lottery != awnserIII; lottery++) {
			fieldcont = lottery + 1;
			int helper, specialnumber, jumper;
			int[] lotterynumber = new int[6];
			for (int lotteryI = 0; lotteryI != 6; lotteryI++) {
				lotterynumber[lotteryI] = (int)((Math.random() * 49) + 1);
			}
			
			specialnumber = (int)((Math.random() * 9) + 1);
			for (int i = 0; i != 6; i++) {
				for (int lotteryII = 0; lotteryII != 5; lotteryII++) {
					helper = lotteryII + 1;
					if (lotterynumber[lotteryII] == lotterynumber[helper]) {
							lotterynumber[lotteryII] = (int)((Math.random() * 49) + 1);
						}
					else {
						if (lotterynumber[lotteryII] > lotterynumber[helper]) {
							jumper = lotterynumber[helper];
							lotterynumber[helper] = lotterynumber[lotteryII];
							lotterynumber[lotteryII] = jumper;
						}
					}
				}
			}
			System.out.println("Lottery field Number: " + fieldcont);
			System.out.print("Your lottery numbers are: ");
			for (int lotteryIII = 0; lotteryIII != 6; lotteryIII++) {
				System.out.print("" + lotterynumber[lotteryIII] + " ");
			}
			System.out.println("");
			System.out.print("Your lottery special number is: ");
			System.out.print("" + specialnumber + "");
			System.out.println("");
			System.out.println("");
			}
			System.out.println("Type 1 to select another menu item.");
			System.out.println("Type 99 to close the program.");
			for (int xyz = 1; xyz != 0; xyz ++) {
				awnserVI = sc.nextInt();
				if (awnserVI == 1) {
					try {
						System.out.print("Loading Main Menue: ");
						for (int timer = 0; timer != 40; timer++) {
							Thread.sleep(10);
						System.out.print("#");
						}
						menue();
					}
					catch(InterruptedException ex) {
					    Thread.currentThread().interrupt();
					}
				}
				else {
					if (awnserVI == 99) {
						system_exit();	
					}
					else {
					System.out.println("The Number '" + awnserI + "' isn't available.");
					System.out.println("Please try again but this time correctly.");
					}
				}
			}
	}//END OF THE NORMAL LOTTERY FUNCTION
	
	public void euro_jackpot() {
		try {
			System.out.print("Loading Euro Jackpot Number Generator: ");
			for (int timer = 0; timer != 40; timer++) {
				Thread.sleep(10);
			System.out.print("#");
			}
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		for (int i = 0; i != 12; i++) {
			System.out.println("\n");
		}
		int fieldcont;
		for (int lottery = 0; lottery != awnserIII; lottery++) {
			fieldcont = lottery + 1;
			int helper, helperII, jumper, jumperII;
			int[] lotterynumber = new int[5];
			int[] specialnumbers = new int[2];
			
			for (int lotteryI = 0; lotteryI != 5; lotteryI++) {
				lotterynumber[lotteryI] = (int)((Math.random() * 50) + 1);
			}
			
			for (int k = 0; k != 2; k++) {
			specialnumbers[k] = (int)((Math.random() * 10) + 1);
			}
			
			
			for (int i = 0; i != 5; i++) {
				for (int lotteryII = 0; lotteryII != 4; lotteryII++) {
					helper = lotteryII + 1;
					if (lotterynumber[lotteryII] == lotterynumber[helper]) {
							lotterynumber[helper] = (int)((Math.random() * 50) + 1);
						}
					else {
						if (lotterynumber[lotteryII] > lotterynumber[helper]) {
							jumper = lotterynumber[helper];
							lotterynumber[helper] = lotterynumber[lotteryII];
							lotterynumber[lotteryII] = jumper;
						}
					}
				}
			}
			for (int i = 1; i != 0; i++) {
		        for (int specialnumbersII = 0; specialnumbersII != 1; specialnumbersII++) {
		          if (specialnumbers[0] == specialnumbers[1]) {
		            specialnumbers[1] = (int)((Math.random() * 10) + 1);
		            if (specialnumbers[0] > specialnumbers[1]) {
			          jumperII = specialnumbers[1];
			          specialnumbers[1] = specialnumbers[0];
			          specialnumbers[0] = jumperII;
			        }
		          }
		          else {
		            if (specialnumbers[0] > specialnumbers[1]) {
		              jumperII = specialnumbers[1];
		              specialnumbers[1] = specialnumbers[0];
		              specialnumbers[0] = jumperII;
		            }
		            else {
		            	break;
		            }
		          }
		        }
		        if (specialnumbers[0] != specialnumbers[1]) {
		        	break;
		        }
		      }
			System.out.println("Lottery field Number: " + fieldcont);
			System.out.print("Your lottery numbers are: ");
			for (int lotteryIII = 0; lotteryIII != 5; lotteryIII++) {
				System.out.print("" + lotterynumber[lotteryIII] + " ");
			}
			System.out.println("");
			System.out.print("Your lottery special number is: ");
			for (int specialnumbersIII = 0; specialnumbersIII != 2; specialnumbersIII++) {
				System.out.print("" + specialnumbers[specialnumbersIII] + " ");
			}
			System.out.println("");
			System.out.println("");
		}
		System.out.println("Type 1 to select another menu item.");
		System.out.println("Type 99 to close the program.");
		for (int xyz = 1; xyz != 0; xyz ++) {
			awnserVI = sc.nextInt();
			if (awnserVI == 1) {
				try {
					System.out.print("Loading Main Menue: ");
					for (int timer = 0; timer != 40; timer++) {
						Thread.sleep(10);
					System.out.print("#");
					}
					menue();
				}
				catch(InterruptedException ex) {
				    Thread.currentThread().interrupt();
				}
			}
			else {
				if (awnserVI == 99) {
					system_exit();	
				}
				else {
				System.out.println("The Number '" + awnserI + "' isn't available.");
				System.out.println("Please try again but this time correctly.");
				}
			}
		}
	}//END OF THE EURO JACKPOT FUNCTION
	
	public void system_exit()  {
		try {
			System.out.print("Loading Closing: ");
			for (int timer = 0; timer != 40; timer++) {
				Thread.sleep(10);
			System.out.print("#");
			}
			for (int i = 0; i != 12; i++) {
				System.out.println("\n");
			}
			System.out.println("Thanks for using PassCalculator and PassLotteryNumberGenerator.");
			System.out.println("The Programm is now closed.");
			try {
				String process = "win32calc.exe";
				Runtime.getRuntime().exec("taskkill /F /IM " + process);
				Runtime.getRuntime().exec("taskkill /F /IM MyFirstApplet.java");
			}
			catch (IOException e) {
			    e.printStackTrace();
			    System.out.println("ERROR: " + e.toString());
			}
			sc.close();
			System.exit(0);
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}//END OF THE SYSTEM EXIT FUNCTION
}//END OF THE PROGRAM
