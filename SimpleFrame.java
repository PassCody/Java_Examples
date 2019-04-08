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
	JButton b1 = new JButton("Button");
	
	/* Field Deklaration */
	JTextField tf1 = new JTextField();
	public static void main(String args[]) {
		SimpleFrame konst = new SimpleFrame();
	}
	
	public SimpleFrame() {
		f1.setTitle("Ich bin ein Frame");
		f1.setSize(500,800);
		f1.setLocation(50,50);
		f1.setVisible(true);
		b1.setLocation(150,250);
		f1.add(new JLabel("Beispiel Button: "));
		f1.add(b1);
		b1.setSize(120,25);
	}
}
