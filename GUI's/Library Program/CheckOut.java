import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;
import javax.swing.*;
import BreezySwing.*;

public class CheckOut extends GBDialog {
	
	private String dateFormat;
	
	// Defining GUI elements
	
	JComboBox<String> combo = addComboBox (1,2,1,1);
	
	JButton loanSelect = addButton ("LOAN", 2,1,1,1);
	JButton cancel = addButton ("CLOSE", 2,3,1,1);
	
	JLabel blank = addLabel ("", 3,1,1,1);
	
	JLabel bookBorrowerLbl = addLabel ("Borrower Name:", 4,1,1,1);
  	JTextField borrowerFld = addTextField ("", 4,2,2,1);
  
  	JLabel daysLbl = addLabel ("DD/MM/YYYY:",5,2,1,1);
  	IntegerField dayFld = addIntegerField (0, 6,1,1,1);
  	IntegerField monthFld = addIntegerField (0, 6,2,1,1);
  	IntegerField yearFld = addIntegerField (0, 6,3,1,1);
	
	private ArrayList<Library> library;
	
	public CheckOut(JFrame frame, ArrayList<Library> lib) {
		super(frame);
		
		setTitle ("Checkout Book");
        setSize (350, 200);
        setDlgCloseIndicator ("CLOSE");
        
        this.library = lib;
		
		for (int i=0; i<library.size(); i++) {
//			this.add(new JButton(((Library) library.get(i)).getTitle()));
			if (((Library) library.get(i)).getBorrower() == null) {
				combo.addItem(((Library) library.get(i)).getTitle());
			}
		}
		
		if (combo.getItemCount() == 0) {
			messageBox("No books left to loan out. Sorry.");
			combo.setVisible(false);
			loanSelect.setVisible(false);
			blank.setVisible(false);
			bookBorrowerLbl.setVisible(false);
			borrowerFld.setVisible(false);
			daysLbl.setVisible(false);
			dayFld.setVisible(false);
			monthFld.setVisible(false);
			yearFld.setVisible(false);
		}
		
	}
	
	
	// Printing an error for the field passed in
	private void fillFieldErr(String field) {
		messageBox("Please fill in the " + field + " field.");
	}
	
	
	// changing the day / month to 2 digits if 1 digit entered.    Ex: 1 entered --> 01
	public void configureDate(String day, String month, String year, int libraryIndex) {
		if (day.length() == 1) {
			day = 0 + day;
		}
		
		if (month.length() == 1) {
			month = 0 + month;
		}
		
		String finalDate = day + "-" + month + "-" + year;
		
		((Library) library.get(libraryIndex)).setBorrowDate(finalDate);
	}
	
	
	// Button click event
	public void buttonClicked(JButton buttonObj){
		
		if (buttonObj == loanSelect) {
			
			if (!borrowerFld.getText().isBlank()) {
				if (dayFld.getNumber() != 0) {
					if (monthFld.getNumber() != 0) {
						if (yearFld.getNumber() != 0) {
							if ((yearFld.getNumber() + "").length() >= 4) {
								
								try {
									LocalDate.parse(yearFld.getNumber()+"-"+monthFld.getNumber()+"-"+dayFld.getNumber());
								} catch (DateTimeParseException e) {
									messageBox("Invalid date entered. Please try again.");
									yearFld.setNumber(0);
									monthFld.setNumber(0);
									dayFld.setNumber(0);
									return;
								}
								
								System.out.println("Loaning- " + combo.getSelectedItem());
								
								for (int i=0; i<library.size(); i++) {
									if (((Library) library.get(i)).getTitle().equals(combo.getSelectedItem())) {
										
										combo.removeItem(combo.getSelectedItem());
										System.out.println("size: " + combo.getItemCount());
										
										if (combo.getItemCount() == 0) {
											dispose();
										}
										
										
										((Library) library.get(i)).setBorrower(borrowerFld.getText());
										
										configureDate(dayFld.getNumber() + "", monthFld.getNumber() + "", yearFld.getNumber() + "", i);
										
										return;
									}
								}								
								
								
								
							} else {
								messageBox("Need at least 4 digits for the year.");
							}
						} else {
							fillFieldErr("YEAR");
						}
					} else {
						fillFieldErr("MONTH");
					}
				} else {
					fillFieldErr("DAY");
				}
			} else {
				fillFieldErr("NAME");
			}
			

			
		} else if (buttonObj == cancel) {
			dispose();
		}
		
	}

}
