import javax.swing.*;
import java.util.ArrayList;
import BreezySwing.*;

public class Main extends GBFrame {

	
	// Defining parts of the frame
	
	static JFrame frm;	
	
	
	JLabel countL = addLabel ("0 People added", 1,1,1,1);
	
	JButton p = addButton ("Add Person", 2,1,1,1);
	JButton s = addButton ("Add Student", 3,1,1,1);
	JButton u = addButton ("Add Undergraduate", 4,1,1,1);
	JButton g = addButton ("Add Graduate", 5,1,1,1);
    
	JLabel nameL = addLabel ("Name:", 2,1,1,1);
	JTextField nameF = addTextField ("", 2,2,5,1);
	
	JLabel idL = addLabel ("Id:", 3,1,1,1);
	JTextField idF = addTextField ("", 3,2,5,1);
	
	JLabel glvlL = addLabel ("Grade Level:", 4,1,1,1);
	JTextField glvlF = addTextField ("", 4,2,5,1);
	
	JLabel mL = addLabel ("Major:", 5,1,1,1);
	JTextField mF = addTextField ("", 5,2,5,1);
	
	
	JButton enter = addButton ("DONE", 7,1,1,1);
	JButton back = addButton("BACK", 7, 2, 1, 1);
	
	
	// Search GUI \/
	
	JLabel blank = addLabel(" ", 7,1,3,1);
	
	JButton sG = addButton ("Search Grade", 8,1,1,1);
	JButton sM = addButton ("Search Major", 9,1,1,1);
	
	JLabel searchL = addLabel ("Search ", 2,1,1,1);
	JTextField search = addTextField ("", 2,2,5,1);
	JButton searchBtn = addButton ("SEARCH", 6,1,1,1);
	
	JComboBox<String> combo = addComboBox (4,1,2,2);
	
	JButton view = addButton ("VIEW", 5,1,1,1);
	
	
	// Print GUI \/
	
	JLabel blank2 = addLabel (" ", 10,1,1,1);
	
	JButton print = addButton ("Print All", 6,1,1,1);
	
	
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
    	
    	print.setVisible(false);	
    	view.setVisible(false);
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
    		
    		System.out.println("COUNT is " + count);
    		
    		if (fieldsFilled == items.size()) {
    			if (type == "p") {
    				obj[count] = new Person(nameF.getText());
					System.out.println("is person " + obj[count].print());
					System.out.println(count);
					
				} else if (type == "s") {
					obj[count] = new Student(nameF.getText(), idF.getText());
					System.out.println(obj[count].print());
					System.out.println(count);
					
				} else if (type == "u") {
					obj[count] = new UnderGrad(nameF.getText(), idF.getText(), glvlF.getText());
					System.out.println(obj[count].print());
					System.out.println(count);
					
				} else if (type == "g") {
					obj[count] = new Grad(nameF.getText(), idF.getText(), mF.getText());
					System.out.println(obj[count].print());
					System.out.println(count);
					
				}
    			
    			countL.setText("People added: " + (count+1));
    			count++;
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
    	} else if (buttonObj == print) {
    		printThis(type);
    	} else if (buttonObj == view) {
    		printComboVal(type2);
    	}
    	
    }
    
    private void printComboVal(String type) {
    	if (type2 == "GRADE") {
    		ArrayList<Person> underGradsList = new ArrayList<Person>();
    		for (int i=0; i<count; i++) {
    			if (obj[i] instanceof UnderGrad) {
    				underGradsList.add(obj[i]);
    			}
    		}
    		
    		if (combo.getItemCount() != 0) {
    			messageBox(underGradsList.get(combo.getSelectedIndex()).print());
    		} else {
    			messageBox("Empty");
    		}
    		
    	} else if (type2 == "MAJOR") {
    		ArrayList<Person> gradsList = new ArrayList<Person>();
    		for (int i=0; i<count; i++) {
    			if (obj[i] instanceof Grad) {
    				gradsList.add(obj[i]);
    			}
    		}
    		
    		if (combo.getItemCount() != 0) {
    			messageBox(gradsList.get(combo.getSelectedIndex()).print());
    		} else {
    			messageBox("Empty");
    		}
  
    	}
    }
    
    private void printThis(String type) {
    	
    	String result = "";
    	int peopleCount = 0;
    	
    	if (type == "p") {
    		for (int i=0; i<count; i++) {
    			if (obj[i] instanceof Person) {
    				result += (peopleCount+1) + "| " + obj[i].print() + '\n';
    				peopleCount++;
    			}
    		}
    	} else if (type == "s") {
    		for (int i=0; i<count; i++) {
    			if (obj[i] instanceof Student) {
    				result += (peopleCount+1) + "| " + obj[i].print() + '\n';
    				peopleCount++;
    			}
    		}
    	} else if (type == "u") {
    		for (int i=0; i<count; i++) {
    			if (obj[i] instanceof UnderGrad) {
    				result += (peopleCount+1) + "| " + obj[i].print() + '\n';
    				peopleCount++;
    			}
    		}
    	} else if (type == "g") {
    		for (int i=0; i<count; i++) {
    			if (obj[i] instanceof Grad) {
    				result += (peopleCount+1) + "| " + obj[i].print() + '\n';
    				peopleCount++;
    			}
    		}
    	}
    	
    	messageBox(result);
    	
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
    	print.setVisible(true);
    	combo.setVisible(false);
    	view.setVisible(false);
    	
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
    	
    	print.setVisible(false);
    	
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
    	view.setVisible(false);
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
    	combo.setVisible(false);
    	view.setVisible(false);
    	
    	for (int i=0; i<items.size(); i++) {
    		items.get(i).setVisible(false);
		}
    	
    	enter.setVisible(false);
    	
    	searchL.setVisible(true);
    	searchL.setText("Search " + whatSearch + ":");
    	search.setVisible(true);
    	search.setText("");
    	searchBtn.setVisible(true);
    }
    

	private void setCombo(String here) {
		
		combo.removeAllItems();
		
//    	for (int i=0; i<count; i++) {
//    		System.out.println((i+1) + " " + obj[i].print());
//    	}
    	
		System.out.println(here);
		System.out.println(search.getText());
		
    	if (here == "GRADE") {
    		
    		for (int i=0; i<count; i++) {
    			if (obj[i] instanceof UnderGrad) {
    				if (((UnderGrad) obj[i]).getGrade().equals(search.getText())) {
    					combo.addItem(obj[i].getName());
    				}
    			}
    		}
    		
    		combo.setVisible(true);
    		view.setVisible(true);
    		
    	} else if (here == "MAJOR") {
    		
    		for (int i=0; i<count; i++) {
    			if (obj[i] instanceof Grad) {
    				if (((Grad) obj[i]).getGrade().equals(search.getText())) {
    					combo.addItem(obj[i].getName());
    				}
    			}
    		}
    		
    		combo.setVisible(true);
    		view.setVisible(true);
    		
    	}
    	
    }
    
    
    
    
    
    // Creation of the frame
    
    public static void main(String[] args) {
        frm = new Main();
        frm.setTitle ("Krish's Database");
        frm.setSize (400, 250);
        frm.setVisible (true);
    }

}
