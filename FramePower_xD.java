package de.passcody.github;

	/* Exercises_VI PROGRAM */

import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

@SuppressWarnings({ "unused", "serial" })
public class FramePower_xD extends JFrame implements ActionListener{
	
	JFrame meinJFrame = new JFrame();
	
	JDialog meinJDialog = new JDialog();
	
	JPanel panel = new JPanel();
	
	JLabel label = new JLabel();
	
    Border bo = new LineBorder(Color.red);
    
    JMenuBar bar = new JMenuBar();
	
    JMenu menuI = new JMenu("File");
    JMenu menuII = new JMenu("Edit");
    JMenu menuIII = new JMenu("Help");
    
    JMenuItem menuIV = new JMenuItem("About");
    
    JMenuItem menuI_itemI = new JMenuItem("New");
    JMenuItem menuI_itemII = new JMenuItem("Open");
    JMenuItem menuI_itemIII = new JMenuItem("Save");
    JMenuItem menuI_itemIV = new JMenuItem("Close");
    
    JMenuItem menuII_itemI = new JMenuItem("Un Do");
    JMenuItem menuII_itemII = new JMenuItem("Re Do");
    JMenuItem menuII_itemIII = new JMenuItem("Copy");
    JMenuItem menuII_itemIV = new JMenuItem("Paste");
    
    JMenuItem menuIII_itemI = new JMenuItem("Content");
    JMenuItem menuIII_itemII = new JMenuItem("Search");

	public static void main(String[] args){
		FramePower_xD e1 = new FramePower_xD();
	}
	
	public FramePower_xD() {
		setFrame();
	}
	
	public void setFrame() {
		
		/* Erzeugung eines neuen Dialoges */
        meinJFrame.setTitle("My First Working JFrame");
        
        /* Erzeugung eines neuen Panels */
        
        // Wir setzen die Breite auf 1050 und die Höhe 800 Pixel
        meinJFrame.setSize(1050, 800);
        
        // Wir setzen unsere Umrandung für unsere JMenuBar
        bar.setBorder(bo);
        
        // Wir fügen das JMenuItem unserem JMenu hinzu
        menuI.add(menuI_itemI);
        menuI.add(menuI_itemII);
        menuI.add(menuI_itemIII);
        menuI.add(menuI_itemIV);
        
        menuII.add(menuII_itemI);
        menuII.add(menuII_itemII);
        menuII.add(menuII_itemIII);
        menuII.add(menuII_itemIV);
        
        menuIII.add(menuIII_itemI);
        menuIII.add(menuIII_itemII);
        
        // Menü wird der Menüleiste hinzugefügt
        bar.add(menuI);
        bar.add(menuII);
        bar.add(menuIII);
        bar.add(menuIV);
        
        // Menüleiste wird für den Dialog gesetzt
        meinJFrame.setJMenuBar(bar);
        
        // Wir lassen unseren Dialog anzeigen
        meinJFrame.setVisible(true);
        
        // Wir fügen einen Action Listenor den Menü Punkten hinzu.
        menuI_itemI.addActionListener(this);
        menuI_itemII.addActionListener(this);
        menuI_itemIII.addActionListener(this);
        menuI_itemIV.addActionListener(this);
        
        menuII_itemI.addActionListener(this);
        menuII_itemII.addActionListener(this);
        menuII_itemIII.addActionListener(this);
        menuII_itemIV.addActionListener(this);
        
        menuIII_itemI.addActionListener(this);
        menuIII_itemII.addActionListener(this);
        
        menuIV.addActionListener(this);
	}
	
	public void actionPerformed (ActionEvent e){
		if(e.getSource() == this.menuI_itemI){
			meinJFrame.getContentPane().removeAll();
			label = new JLabel("Create New File");
			meinJFrame.add(label);
			meinJFrame.setVisible(true);
			return;
		}
		if(e.getSource() == this.menuI_itemII){
			meinJFrame.getContentPane().removeAll();
			label = new JLabel("Open File");
			meinJFrame.add(label);
			meinJFrame.setVisible(true);
			return;
		}
		if(e.getSource() == this.menuI_itemIII){
			meinJFrame.getContentPane().removeAll();
			label = new JLabel("Save File");
			meinJFrame.add(label);
			meinJFrame.setVisible(true);
			return;
		}
		if(e.getSource() == this.menuI_itemIV){
			meinJFrame.getContentPane().removeAll();
			System.out.println("Programm Ends!");
			System.exit(0);
		}
		
		if(e.getSource() == this.menuII_itemI){
			meinJFrame.getContentPane().removeAll();
			label = new JLabel("Un Do");
			meinJFrame.add(label);
			meinJFrame.setVisible(true);
			return;
		}
		if(e.getSource() == this.menuII_itemII){
			meinJFrame.getContentPane().removeAll();
			label = new JLabel("Re Do");
			meinJFrame.add(label);
			meinJFrame.setVisible(true);
			return;
		}
		if(e.getSource() == this.menuII_itemIII){
			meinJFrame.getContentPane().removeAll();
			label = new JLabel("Copy");
			meinJFrame.add(label);
			meinJFrame.setVisible(true);
			return;
		}
		if(e.getSource() == this.menuII_itemIV){
			meinJFrame.getContentPane().removeAll();
			label = new JLabel("Paste");
			meinJFrame.add(label);
			meinJFrame.setVisible(true);
			return;
		}
		
		if(e.getSource() == this.menuIII_itemI){
			meinJFrame.getContentPane().removeAll();
			label = new JLabel("Content");
			meinJFrame.add(label);
			meinJFrame.setVisible(true);
			return;
		}
		if(e.getSource() == this.menuIII_itemII){
			meinJFrame.getContentPane().removeAll();
			label = new JLabel("Search");
			meinJFrame.add(label);
			meinJFrame.setVisible(true);
			return;
		}
		
		if(e.getSource() == this.menuIV){
			meinJFrame.getContentPane().removeAll();
			label = new JLabel("About Us");
			meinJFrame.add(label);
			meinJFrame.setVisible(true);
			return;
		}
	}
}
