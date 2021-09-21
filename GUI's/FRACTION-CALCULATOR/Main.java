import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {

    JLabel startingLabel = addLabel ("Pick the size of your square", 1,1,1,1);

    JButton size2Button = addButton ("2x2", 5,1,1,1);
    JButton size4Button = addButton ("4x4", 4,1,1,1);
    JButton size6Button = addButton ("6x6", 3,1,1,1);
    JButton size8Button = addButton ("8x8", 2,1,1,1);
    
    
    public int currentBoxSize = 0;
    

    public void buttonClicked(JButton buttonObj){

        if (buttonObj == size2Button && currentBoxSize == 0) {
 
        	for (int i = 1; i < 3; i++) {
    			// rows
        		for (int j = 1; j < 3; j++) {     			
        			IntegerField field = addIntegerField (1, j+1,i+1,2,2);
        			
        			System.out.println("j: " + j);
        			System.out.println("i: " + i);
        		}
        		
        	}
        	
            currentBoxSize = 2;
            size8Button.setVisible(false);
            size6Button.setVisible(false);
            size4Button.setVisible(false);
            size2Button.setVisible(false);
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == size4Button && currentBoxSize == 0)  {
        	
        	for (int i = 1; i < 5; i++) {
    			// rows
        		for (int j = 1; j < 5; j++) {     			
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
        	
        	for (int i = 1; i < 7; i++) {
    			// rows
        		for (int j = 1; j < 7; j++) {     			
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
      	
        	for (int i = 1; i < 9; i++) {
    			// rows
        		for (int j = 1; j < 9; j++) {     			
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
        }
    	
        
        

    }


    public static void main(String[] args) {
        JFrame frm = new Main();
        frm.setTitle ("Magic Square:Select size");
        frm.setSize (500, 250);
        frm.setVisible (true);
    }

}
