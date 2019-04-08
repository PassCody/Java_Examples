/* Author and Coder: PassCody*/



package MyFirstApplet_Package;

import java.awt.*;
import java.io.*;
import java.util.*;

import MyFirstProject_Package.MyFirstProject;
import MyFirstApplet_Package.MyFirstApplet;

@SuppressWarnings({ "unused" })
public class Timer {
	/* VARIABLE DECLARATION */
	//DECLEAR SCANNER//
	Scanner sc = new Scanner(System.in);
	int seconds;
	int minutes;
	int hours;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		//CONSTRUCTOR CREATION//
		Timer konst = new Timer();
	}//END OF THE MAIN FUNCTION
	
	public Timer() {
		init();
	}//END OF THE KONSTRUKTOR FUNCTION
	
	public void init(){
		for (int i = 1; i != 0; i++) {
			try {
				for (int timery = 0; timery != 65; timery++) {
					System.out.println("Timer: " + hours + ":" + minutes + ":" + seconds);
					seconds += 1;
					if (seconds == 60) {
						minutes = minutes + 1;
						seconds = 0;
						timery = 0;
						if (minutes == 60) {
							hours = hours + 1;
							minutes = 0;
							seconds = 0;
							timery = 0;
						}
					}
					Thread.sleep(1000);
				}
			}
			catch(InterruptedException e) {
			    Thread.currentThread().interrupt();
			}
		}
	}//END OF THE INIT FUNCTION
}
