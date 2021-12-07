import java.util.*;

import javax.swing.*;
import BreezySwing.*;

public class Search extends GBDialog {

	JTextField title = addTextField ("", 1,1,2,1);
	JButton enter = addButton ("SEARCH", 1,3,1,1);
	JComboBox<String> combo = addComboBox (2,1,1,1);
	JLabel noResults = addLabel ("No Results Found", 2,1,1,1);
	JButton select = addButton ("SELECT", 2,3,1,1);
	JButton close = addButton ("CLOSE", 3,2,1,1);
	
	
	private ArrayList<Library> library;
	
	public Search(JFrame frame, ArrayList<Library> lib) {
		super(frame);
		setTitle ("Search Book");
        setSize (350, 200);
        setDlgCloseIndicator ("CLOSE");
        
        this.library = lib;
        
        combo.setVisible(false);
        select.setVisible(false);
        noResults.setVisible(false);
	}
	
	
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
			
			System.out.println(combo.getSelectedItem());
			
		}
	}
	
}
