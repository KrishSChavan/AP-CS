import java.util.*;

import javax.swing.*;
import BreezySwing.*;

public class Search extends GBDialog {

	// Defining GUI elements
	
	JTextField title = addTextField ("", 1,1,2,1);
	JButton enter = addButton ("SEARCH", 1,3,1,1);
	JComboBox<String> combo = addComboBox (2,1,1,1);
	JLabel noResults = addLabel ("No Results Found", 2,1,1,1);
	JButton select = addButton ("SELECT", 2,3,1,1);
	JButton close = addButton ("CLOSE", 3,2,1,1);
	
	
	private ArrayList<Library> library;
	private JFrame frame;
	
	public Search(JFrame frameMain, ArrayList<Library> lib) {
		super(frameMain);
		setTitle ("Search Book");
        setSize (350, 200);
        setDlgCloseIndicator ("CLOSE");
        
        this.library = lib;
        this.frame = frameMain;
        
        combo.setVisible(false);
        select.setVisible(false);
        noResults.setVisible(false);
	}
	
	// Button click event
	
	public void buttonClicked(JButton buttonObj){
		if (buttonObj == close) {
			dispose();
		} else if (buttonObj == enter) {
			
			if (!enter.getText().isBlank()) {
				
				combo.removeAllItems();
				
				for (int i=0; i<library.size(); i++) {
					
					if (((Library) library.get(i)).getTitle().equals(title.getText())) {
						combo.addItem(((Library) library.get(i)).getTitle());
					}
				}
				
				if (combo.getItemCount() == 0) {
					noResults.setVisible(true);
					combo.setVisible(false);
			        select.setVisible(false);
				} else {
					noResults.setVisible(false);
					combo.setVisible(true);
			        select.setVisible(true);
				}
				
			}
			
		} else if (buttonObj == select) {
			
			for (int i=0; i<library.size(); i++) {
				
				if (((Library) library.get(i)).getTitle().equals(combo.getSelectedItem())) {		        	
		        	dispose();
		        	
		        	Extra extra = new Extra(frame, library, i);
		        	
		        	extra.setVisible(true);
		        	
		        	return;
				}
			}
			
		}
	}
	
}
