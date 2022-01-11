package inheritance;

import javax.swing.*;
import java.util.ArrayList;
import BreezySwing.*;

public class Main extends GBFrame {

	
	// Defining parts of the frame
	
	static JFrame frm;	
	
	
	JLabel countL = addLabel ("0 People added", 1,1,1,1);
	
	JButton p = addButton ("Person", 2,1,1,1);
	JButton s = addButton ("Student", 3,1,1,1);
	JButton u = addButton ("Undergraduate", 4,1,1,1);
	JButton g = addButton ("Graduate", 5,1,1,1);
    
	JLabel nameL = addLabel ("Name:", 2,1,1,1);
	JTextField nameF = addTextField ("", 2,2,5,1);
	
	JLabel idL = addLabel ("Id:", 3,1,1,1);
	JTextField idF = addTextField ("", 3,2,5,1);
	
	JLabel glvlL = addLabel ("Grade Level:", 4,1,1,1);
	JTextField glvlF = addTextField ("", 4,2,5,1);
	
	JLabel mL = addLabel ("Major:", 5,1,1,1);
	JTextField mF = addTextField ("", 5,2,5,1);
	
	
	JButton enter = addButton ("DONE", 6,1,1,1);
	JButton back = addButton("BACK", 6, 2, 1, 1);
	
	
	// Search GUI \/
	
	JLabel blank = addLabel(" ", 7,1,3,1);
	
	JButton sG = addButton ("Search Grade", 8,1,1,1);
	JButton sM = addButton ("Search Major", 9,1,1,1);
	
	JLabel searchL = addLabel ("Search ", 2,1,1,1);
	JTextField search = addTextField ("", 2,2,5,1);
	JButton searchBtn = addButton ("SEARCH", 6,1,1,1);
	
	JComboBox<String> combo = addComboBox (4,1,2,2);
	
	ArrayList<JTextField> items = new ArrayList<JTextField>();
	String type;
	String type2;
	
	Person[] obj = new Person[10];
	int count = 0;
	
	public Main() {
		
		nameL.setVisible(false);
		nameF.setVisible(false);
		
		idL.setVisible(false);
		idF.setVisible(false);
		
		glvlL.setVisible(false);
		glvlF.setVisible(false);
		
		mL.setVisible(false);
		mF.setVisible(false);
	
		
		enter.setVisible(false);
		
    	combo.setVisible(false);
    	searchL.setVisible(false);
    	search.setVisible(false);
    	searchBtn.setVisible(false);
    	
    	back.setVisible(false);
		
	}
	
    // Checking for button click
	
    public void buttonClicked(JButton buttonObj) {
    	
    	if (buttonObj == p) {
    		display("p");
    		
    	} else if (buttonObj == s) {
    		display("s");
    		
    	} else if (buttonObj == u) {
    		display("u");
    		
    	} else if (buttonObj == g) {
    		display("g");
    		
    	} else if (buttonObj == enter) {
    		
    		int fieldsFilled = 0;
    		
    		for (int i=0; i<items.size(); i++) {
    			if (items.get(i).getText().isBlank()) {
    				messageBox("Fill out field " + (i+1));
    			} else {
    				fieldsFilled++;
    			}
    		}
    		
    		if (fieldsFilled == items.size()) {
    			if (type == "p") {
					obj[count] = new Person(nameF.getText());
					System.out.println(obj[count].print());
					count++;
					countL.setText("People added: " + count);
					
				} else if (type == "s") {
					obj[count] = new Student(nameF.getText(), idF.getText());
					System.out.println(obj[count].print());
					count++;
					countL.setText("People added: " + count);
					
				} else if (type == "u") {
					obj[count] = new UnderGrad(nameF.getText(), idF.getText(), glvlF.getText());
					System.out.println(obj[count].print());
					count++;
					countL.setText("People added: " + count);
					
				} else if (type == "g") {
					obj[count] = new Grad(nameF.getText(), idF.getText(), mF.getText());
					System.out.println(obj[count].print());
					count++;
					countL.setText("People added: " + count);
					
				}
    			
//				System.out.println("All fields filled");
				backDisplay();
    		}
    		
    	} else if (buttonObj == back) {
    		backDisplay();
    	} else if (buttonObj == sG) {
    		searchDisplay("GRADE");
    	} else if (buttonObj == sM) {
    		searchDisplay("MAJOR");
    	} else if (buttonObj == searchBtn) {
    		setCombo(type2);
    	}
    	
    }
    
    private void display(String item) {
    	
    	p.setVisible(false);
    	s.setVisible(false);
    	u.setVisible(false);
    	g.setVisible(false);
    	enter.setVisible(true);
    	back.setVisible(true);
    	blank.setVisible(false);
    	sG.setVisible(false);
    	sM.setVisible(false);
    	
    	type = item;
    	items.clear();
    	
    	if (item == "p") {
    		
    		nameL.setVisible(true);
    		nameF.setVisible(true);
    		
    		items.add(nameF);
    		
    	} else if (item == "s") {
    		
    		nameL.setVisible(true);
    		nameF.setVisible(true);
    		
    		idL.setVisible(true);
    		idF.setVisible(true);
    		
    		items.add(nameF);
    		items.add(idF);
    		
    	} else if (item == "u") {
    		
    		nameL.setVisible(true);
    		nameF.setVisible(true);
    		
    		idL.setVisible(true);
    		idF.setVisible(true);
    		
    		glvlL.setVisible(true);
    		glvlF.setVisible(true);
    		
    		items.add(nameF);
    		items.add(idF);
    		items.add(glvlF);
    		
    	} else if (item == "g") {
    		
    		nameL.setVisible(true);
    		nameF.setVisible(true);
    		
    		idL.setVisible(true);
    		idF.setVisible(true);
    		
    		mL.setVisible(true);
    		mF.setVisible(true);
    		
    		items.add(nameF);
    		items.add(idF);
    		items.add(mF);
    		
    	}
    	
    }

    private void backDisplay() {
    	
    	nameL.setVisible(false);
		nameF.setVisible(false);
		nameF.setText("");
		
		
		idL.setVisible(false);
		idF.setVisible(false);
		idF.setText("");
		
		glvlL.setVisible(false);
		glvlF.setVisible(false);
		glvlF.setText("");
		
		mL.setVisible(false);
		mF.setVisible(false);
		mF.setText("");
	
		
		enter.setVisible(false);
		back.setVisible(false);
		
		
		sG.setVisible(true);
		sM.setVisible(true);
    	combo.setVisible(false);
    	searchL.setVisible(false);
    	search.setVisible(false);
    	searchBtn.setVisible(false);
    	
    	if (count < 10) {
    		blank.setVisible(true);
        	p.setVisible(true);
        	s.setVisible(true);
        	u.setVisible(true);
        	g.setVisible(true);
    	} else{
    		blank.setVisible(false);
        	p.setVisible(false);
        	s.setVisible(false);
        	u.setVisible(false);
        	g.setVisible(false);  		    		
    	}
    	
    }
    
    private void searchDisplay(String whatSearch) {
    	
    	type2 = whatSearch;
    	
    	p.setVisible(false);
    	s.setVisible(false);
    	u.setVisible(false);
    	g.setVisible(false);
    	enter.setVisible(false);
    	back.setVisible(true);
    	blank.setVisible(false);
    	sG.setVisible(false);
    	sM.setVisible(false);
    	
    	for (int i=0; i<items.size(); i++) {
    		items.get(i).setVisible(false);
		}
    	
    	enter.setVisible(false);
    	
    	searchL.setVisible(true);
    	searchL.setText("Search " + whatSearch + ":");
    	search.setVisible(true);
    	searchBtn.setVisible(true);
    }
    
	@SuppressWarnings("unlikely-arg-type")
	private void setCombo(String here) {
		
		combo.removeAllItems();
		
//    	for (int i=0; i<count; i++) {
//    		System.out.println((i+1) + " " + obj[i].print());
//    	}
    	
		System.out.println(here);
		System.out.println(search.getText());
		
    	if (here == "GRADE") {
    		
    		for (int i=0; i<count; i++) {
    			
    			System.out.println(((UnderGrad) obj[i]).getGrade() + " ||| " + obj[i].getName());
    			
    			if (obj[i].equals(search.getText())) {
    				combo.addItem(obj[i].getName());
    			}
    		}
    		
    		combo.setVisible(true);
    		
    	} else if (here == "MAJOR") {
    		
    		for (int i=0; i<count; i++) {
    			if (obj[i].equals(search.getText())) {
    				combo.addItem(obj[i].getName());
    			}
    		}
    		
    		combo.setVisible(true);
    		
    	}
    	
    }
    
    
    
    
//    String MResult = "People with the same Major:" + "\n";
//
//    if(Button == MSearch) {
//                String Comparing = Msearch.getText();
//    System.out.println(Comparing);
//                boolean check = false;
//                for(int i = 0; i < count; i++) {
//    System.out.println(i);
//                    if(studentlist[i] instanceof GraduateStudent) {
//                        String Check = ((GraduateStudent) studentlist[i]).getMajor();
//                        if(Check.equals(Comparing)) {
//                            MResult += studentlist[i].getName() + "\n";
//                        }
//    System.out.println(Check);
//    System.out.println(studentlist[i].getName());
//                    }
//                }
//                messageBox(MResult);
//            } 
    
    
    
    
    
    // Creation of the frame
    
    public static void main(String[] args) {
        frm = new Main();
        frm.setTitle ("Krish's Library");
        frm.setSize (400, 250);
        frm.setVisible (true);
    }

}
