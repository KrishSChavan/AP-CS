import java.util.*;

import javax.swing.*;
import BreezySwing.*;

public class ReturnBook extends GBDialog {

	// Definging GUI elements
	
	JLabel nameLbl = addLabel ("Borrower Name:", 1,1,1,1);
	JTextField name = addTextField ("", 1,2,3,1);
	JButton enterName = addButton ("Enter Name", 2,1,1,1);
	
	JLabel returnLabel = addLabel ("", 1,2,1,1);
	
	JComboBox<String> combo = addComboBox (2,2,1,1);
	
	JButton returnSelect = addButton ("RETURN", 3,1,1,1);
	JButton cancel = addButton ("CLOSE", 3,3,1,1);
	
	
	private ArrayList<Library> library;
	
	public ReturnBook(JFrame frame, ArrayList<Library> lib) {
		super(frame);
		
		setTitle ("Return Book");
        setSize (350, 200);
        setDlgCloseIndicator ("CLOSE");
        
        this.library = lib;
        
        combo.setVisible(false);
        returnSelect.setVisible(false);
	}
	
	// Button click event
	
	public void buttonClicked(JButton buttonObj){
		
		if (buttonObj == enterName) {
			
			if (!name.getText().isBlank()) {
				for (int i=0; i<library.size(); i++) {
					if (((Library) library.get(i)).getBorrower() != null) {
						if (((Library) library.get(i)).getBorrower().equals(name.getText().trim())) {
							combo.addItem(((Library) library.get(i)).getTitle());
						}
					}
				}
				
				if (combo.getItemCount() != 0) {
					nameLbl.setVisible(false);
					name.setVisible(false);
					enterName.setVisible(false);
					
					returnLabel.setText(name.getText().trim() + "'s Return List");
					
					combo.setVisible(true);
					returnSelect.setVisible(true);
				} else {
					dispose();
					messageBox("You have not loaned out any books yet.");
				}
				
			} else {
				messageBox("Enter a name to continue");
			}
			
		} else if (buttonObj == returnSelect) {
			
			System.out.println("Returning- " + combo.getSelectedItem());
			
			for (int i=0; i<library.size(); i++) {
				if (((Library) library.get(i)).getTitle().equals(combo.getSelectedItem())) {
					
					combo.removeItem(combo.getSelectedItem());
					System.out.println("size: " + combo.getItemCount());
					
					if (combo.getItemCount() == 0) {
						dispose();
					}
					
					
					((Library) library.get(i)).setBorrower(null);
					
					((Library) library.get(i)).setBorrowDate(null);
					
					return;
				}
			}		
			
		} else if (buttonObj == cancel) {
			dispose();
		}
		
	}
	
}
