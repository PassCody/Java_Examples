/* Author and Coder: PassCody*/



package de.frame.cli.MyFrame;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

@SuppressWarnings({ "unused", "serial" })
public class SimpleFrame extends Frame{
	/* Frame Deklaration */
	JFrame f1 = new JFrame();
	
	/* Button Deklaration */
	JButton b1 = new JButton();
	
	/* Field Deklaration */
	JTextField tf1 = new JTextField();
	
	public static void main(String args[]) {
		SimpleFrame konst = new SimpleFrame();
	}
	
	public SimpleFrame() {
		f1.setTitle("Ich bin ein Frame");
		f1.setSize(250,400);
		f1.setLocation(50,50);
		f1.setVisible(true);
		f1.add(tf1);
		f1.add(b1);
		
		tf1.setLocation(150,150);
		tf1.setText("I'm a Text Field.");
		
		b1.setLocation(150,250);
		b1.setText("I'm a Button");
	}
}
