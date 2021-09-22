import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {

    JLabel startingLabel = addLabel ("Pick the size of your square", 1,1,1,1);

    JButton size2Button = addButton ("2x2", 2,1,1,1);
    JButton size4Button = addButton ("4x4", 3,1,1,1);
    JButton size6Button = addButton ("6x6", 4,1,1,1);
    JButton size8Button = addButton ("8x8", 5,1,1,1);
    
    JButton enterValBtn = addButton ("Enter Value", 1,1,1,1);
    
    IntegerField field;
    
    int currentBoxSize = 0;
    
    boolean valEntered = true;

    public void buttonClicked(JButton buttonObj){

        if (buttonObj == size2Button && currentBoxSize == 0) {	
        	
        	for (int i = 1; i < 4; i++) {
    			// rows
        		for (int j = 1; j < 4; j++) {     			
        			field = addIntegerField (1, j+1,i+1,2,2);
        			startingLabel.setText("Please fill in the input fields");
        			j--;
        			
        			while (valEntered) {
        				System.out.println(valEntered);
        				
        				System.out.println("j: " + j);
            			System.out.println("i: " + i);
            			
            			System.out.println(field.getNumber());
            			
            			System.out.println();
            			
        				j++;
        				
        				valEntered = false;
            			
        				return;
        			}
        			
        			
        			
        		}
        		
        	}
        	
        	System.out.println(field.getNumber());
        	        	
            currentBoxSize = 2;
            size8Button.setVisible(false);
            size6Button.setVisible(false);
            size4Button.setVisible(false);
            size2Button.setVisible(false);
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == size4Button && currentBoxSize == 0)  {
        	
        	for (int i = 1; i < 8; i++) {
    			// rows
        		for (int j = 1; j < 8; j++) {     			
        			IntegerField field = addIntegerField (1, j+1,i+1,2,2);
        			
        			System.out.println("j: " + j);
        			System.out.println("i: " + i);
        		}
        		
        	}
        	
            currentBoxSize = 4;
            size8Button.setVisible(false);
            size6Button.setVisible(false);
            size4Button.setVisible(false);
            size2Button.setVisible(false);
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == size6Button && currentBoxSize == 0) {
        	
        	for (int i = 1; i < 12; i++) {
    			// rows
        		for (int j = 1; j < 12; j++) {     			
        			IntegerField field = addIntegerField (1, j+1,i+1,2,2);
        			
        			System.out.println("j: " + j);
        			System.out.println("i: " + i);
        		}
        		
        	}
        	
            currentBoxSize = 6;
            size8Button.setVisible(false);
            size6Button.setVisible(false);
            size4Button.setVisible(false);
            size2Button.setVisible(false);
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == size8Button && currentBoxSize == 0) {
      	
        	for (int i = 1; i < 16; i++) {
    			// rows
        		for (int j = 1; j < 16; j++) {     			
        			IntegerField field = addIntegerField (1, j+1,i+1,2,2);
        			
        			System.out.println("j: " + j);
        			System.out.println("i: " + i);
        		}
        		
        	}
        	
            currentBoxSize = 8;
            size8Button.setVisible(false);
            size6Button.setVisible(false);
            size4Button.setVisible(false);
            size2Button.setVisible(false);
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == enterValBtn) {
        	valEntered = true;
        }
    	
        
        

    }


    public static void main(String[] args) {
        JFrame frm = new Main();
        frm.setTitle ("Magic Square:Select size");
        frm.setSize (500, 250);
        frm.setVisible (true);
    }

}
