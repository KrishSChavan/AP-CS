import javax.swing.*;
import java.util.ArrayList;
import BreezySwing.*;

public class Main extends GBFrame {

	
	// Defining parts of the frame
	
	static JFrame frm;	
	
	
	JButton p = addButton ("Person", 1,1,1,1);
	JButton s = addButton ("Student", 2,1,1,1);
	JButton u = addButton ("Undergraduate", 3,1,1,1);
	JButton g = addButton ("Graduate", 4,1,1,1);
    
	JLabel nameL = addLabel ("Name:", 1,1,1,1);
	JTextField nameF = addTextField ("", 1,2,5,1);
	
	JLabel idL = addLabel ("Id:", 2,1,1,1);
	JTextField idF = addTextField ("", 2,2,5,1);
	
	JLabel glvlL = addLabel ("Grade Level:", 3,1,1,1);
	JTextField glvlF = addTextField ("", 3,2,5,1);
	
	JLabel mL = addLabel ("Major:", 4,1,1,1);
	JTextField mF = addTextField ("", 4,2,5,1);
	
	
	JButton enter = addButton ("DONE", 5,1,1,1);
	JButton back = addButton("BACK", 5, 2, 1, 1);
	
	
	// Search GUI \/
	
	JButton sG = addButton ("Search Grade", 1,1,1,1);
	JButton sM = addButton ("Search Major", 2,1,1,1);
	
	JComboBox<String> combo = addComboBox (2,2,2,2);
	
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
		
		
		
//		p.setVisible(false);
//    	s.setVisible(false);
//    	u.setVisible(false);
//    	g.setVisible(false);
		sG.setVisible(false);
		sM.setVisible(false);
    	combo.setVisible(false);
    	
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
					
				} else if (type == "s") {
					obj[count] = new Student(nameF.getText(), idF.getText());
					System.out.println(obj[count].print());
					count++;
					
				} else if (type == "u") {
					obj[count] = new UnderGrad(nameF.getText(), idF.getText(), glvlF.getText());
					System.out.println(obj[count].print());
					count++;
					
				} else if (type == "g") {
					obj[count] = new Grad(nameF.getText(), idF.getText(), mF.getText());
					System.out.println(obj[count].print());
					count++;
					
				}
				
    			searchDisplay();
    			
				System.out.println("All fields filled");
    		}
    		
    	} else if (buttonObj == back) {
    		backDisplay();
    	} else if (buttonObj == sG) {
    		setCombo("grade");
    	} else if (buttonObj == sM) {
    		setCombo("major");
    	}
    	
    }
    
    private void display(String item) {
    	
    	p.setVisible(false);
    	s.setVisible(false);
    	u.setVisible(false);
    	g.setVisible(false);
    	enter.setVisible(true);
    	back.setVisible(true);
    	
    	type = item;
    	
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
		
		
		
//		p.setVisible(false);
//    	s.setVisible(false);
//    	u.setVisible(false);
//    	g.setVisible(false);
		sG.setVisible(false);
		sM.setVisible(false);
    	combo.setVisible(false);
    	
    	back.setVisible(false);
    	
    	p.setVisible(true);
    	s.setVisible(true);
    	u.setVisible(true);
    	g.setVisible(true);
    	
    }
    
    private void searchDisplay() {
    	
    	for (int i=0; i<items.size(); i++) {
    		items.get(i).setVisible(false);
		}
    	
    	enter.setVisible(false);
    }
    
    private void setCombo(String type2) {
    	
    	if (type2 == "p") {
    		
    		System.out.println();
    		
//    		for (int i=0; i<studentList)
    		
    	} else if (type2 == "s") {
    		
    	} else if (type2 == "u") {
    		
    	} else if (type2 == "g") {
    		
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
