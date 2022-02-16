package sorting;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.*;
import BreezySwing.*;

public class Grades extends GBDialog {

	
	JButton hAmmt = addButton("0 HW", 1,1,1,1);
	JButton qAmmt = addButton("0 Quizzes", 2,1,1,1);
	JButton tAmmt = addButton("0 Tests", 3,1,1,1);
	
	JButton fAmmt = addButton("0 - Final", 5,1,1,1);
	
	IntegerField num = addIntegerField (0, 1,5,1,1);
	
	JButton addH = addButton("Add HW", 2,4,1,1);
	JButton addQ = addButton("Add Quiz", 2,5,1,1);
	JButton addT = addButton("Add Test", 2,6,1,1);
	
	JButton done = addButton("DONE", 5,5,1,1);
	
	private Student stu[] = new Student[15];
	
	private ArrayList<Integer> tests = new ArrayList<Integer>(); // max 5
	private ArrayList<Integer> quizzes = new ArrayList<Integer>(); // max 8
	private ArrayList<Integer> hw = new ArrayList<Integer>(); // no max
	
	
	
	public Grades(JFrame parent, Student arr[]){
		
		// The next few lines are part of every dialog
        super (parent);                                 // ** REQUIRED **
        setTitle ("Add Grades");
        setDlgCloseIndicator ("Cancel");
        setSize (600, 250);
		
        this.stu = arr;
        
        qAmmt.setBackground(Color.GRAY);
		qAmmt.setForeground(Color.WHITE);
		qAmmt.setBorderPainted(false);
		
		tAmmt.setBackground(Color.GRAY);
		tAmmt.setForeground(Color.WHITE);
		tAmmt.setBorderPainted(false);
		
		hAmmt.setBackground(Color.GRAY);
		hAmmt.setForeground(Color.WHITE);
		hAmmt.setBorderPainted(false);
		
		fAmmt.setBackground(Color.pink);
		fAmmt.setForeground(Color.white);
		fAmmt.setBorderPainted(false);
    }
	
	
	public void buttonClicked(JButton btn){
		if (!num.getText().isBlank()) {
			if (btn == addH) {
				add(hw);
			} else if (btn == addQ) {
				add(quizzes);
			} else if (btn == addT) {
				add(tests);
			}
		}
	}
	
	
	
	public void add(ArrayList<Integer> list) {
		list.add(num.getNumber());
	}
	

}
