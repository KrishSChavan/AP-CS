import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {
	
	IntegerField[][] msArray = new IntegerField[8][8];
	
	GBPanel msFields = addPanel(new GBPanel(), 1, 1, 1, 1);

	JLabel startingLabel = addLabel ("Pick the size of your square", 1,1,1,1);
	
    JButton size2Button = addButton ("2x2", 2,1,1,1);
    JButton size3Button = addButton ("3x3", 3,1,1,1);
    JButton size4Button = addButton ("4x4", 4,1,1,1);
    JButton size5Button = addButton ("5x5", 5,1,1,1);
    JButton size6Button = addButton ("6x6", 6,1,1,1);
    JButton size7Button = addButton ("7x7", 7,1,1,1);
    JButton size8Button = addButton ("8x8", 8,1,1,1);
    
    JButton doneButton = addButton ("Done?", 11,3,1,1);
    
    JTextField answerField = addTextField ("Answer", 20,3,7,7);
    
    int currentBoxSize = 0;
    
    boolean errorExists = false;
    
    public void buttonClicked(JButton buttonObj){

        if (buttonObj == size2Button) {
        	currentBoxSize = 2;
        	size2Button.setVisible(false);
            size3Button.setVisible(false);
            size4Button.setVisible(false);
            size5Button.setVisible(false);
            size6Button.setVisible(false);
            size7Button.setVisible(false);
            size8Button.setVisible(false);
            
            msFields.removeAll();        
            for(int i = 0; i < currentBoxSize; i++) {
    			for(int j = 0; j < currentBoxSize; j++) {
    				msArray[i][j] = addIntegerField (0, i+2,j+2,1,1);
    			}
    		}
            
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == size3Button)  {
            currentBoxSize = 3;
            size2Button.setVisible(false);
            size3Button.setVisible(false);
            size4Button.setVisible(false);
            size5Button.setVisible(false);
            size6Button.setVisible(false);
            size7Button.setVisible(false);
            size8Button.setVisible(false);
            
            msFields.removeAll();        
            for(int i = 0; i < currentBoxSize; i++) {
    			for(int j = 0; j < currentBoxSize; j++) {
    				msArray[i][j] = addIntegerField (0, i+2,j+2,1,1);
    			}
    		}
            
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == size4Button) {
            currentBoxSize = 4;
            size2Button.setVisible(false);
            size3Button.setVisible(false);
            size4Button.setVisible(false);
            size5Button.setVisible(false);
            size6Button.setVisible(false);
            size7Button.setVisible(false);
            size8Button.setVisible(false);
            
            msFields.removeAll();        
            for(int i = 0; i < currentBoxSize; i++) {
    			for(int j = 0; j < currentBoxSize; j++) {
    				msArray[i][j] = addIntegerField (0, i+2,j+2,1,1);
    			}
    		}
            
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == size5Button) {
            currentBoxSize = 5;
            size2Button.setVisible(false);
            size3Button.setVisible(false);
            size4Button.setVisible(false);
            size5Button.setVisible(false);
            size6Button.setVisible(false);
            size7Button.setVisible(false);
            size8Button.setVisible(false);
            
            msFields.removeAll();        
            for(int i = 0; i < currentBoxSize; i++) {
    			for(int j = 0; j < currentBoxSize; j++) {
    				msArray[i][j] = addIntegerField (0, i+2,j+2,1,1);
    			}
    		}
            
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == size6Button) {
        	currentBoxSize = 6;
        	size2Button.setVisible(false);
            size3Button.setVisible(false);
            size4Button.setVisible(false);
            size5Button.setVisible(false);
            size6Button.setVisible(false);
            size7Button.setVisible(false);
            size8Button.setVisible(false);
            
            msFields.removeAll();        
            for(int i = 0; i < currentBoxSize; i++) {
    			for(int j = 0; j < currentBoxSize; j++) {
    				msArray[i][j] = addIntegerField (0, i+2,j+2,1,1);
    			}
    		}
            
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == size7Button)  {
            currentBoxSize = 7;
            size2Button.setVisible(false);
            size3Button.setVisible(false);
            size4Button.setVisible(false);
            size5Button.setVisible(false);
            size6Button.setVisible(false);
            size7Button.setVisible(false);
            size8Button.setVisible(false);
            
            msFields.removeAll();        
            for(int i = 0; i < currentBoxSize; i++) {
    			for(int j = 0; j < currentBoxSize; j++) {
    				msArray[i][j] = addIntegerField (0, i+2,j+2,1,1);
    			}
    		}
            
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == size8Button) {
            currentBoxSize = 8;
            size2Button.setVisible(false);
            size3Button.setVisible(false);
            size4Button.setVisible(false);
            size5Button.setVisible(false);
            size6Button.setVisible(false);
            size7Button.setVisible(false);
            size8Button.setVisible(false);
            
            msFields.removeAll();        
            for(int i = 0; i < currentBoxSize; i++) {
    			for(int j = 0; j < currentBoxSize; j++) {
    				msArray[i][j] = addIntegerField (0, i+2,j+2,1,1);
    			}
    		}
            
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == doneButton) {
        	
        	errorExists = false;
			
			//error check
			for(int i = 0; i < currentBoxSize; i++) {
				
				for(int j = 0; j < currentBoxSize; j++) {
					
					int positive = 0;
					positive = msArray[i][j].getNumber();
						
					if(!(positive > 0 && positive < 100000)) {
						answerField.setText("Can't have non numeric characters, 0, or negatives in grid");
						errorExists = true;
					} 
					
				}
			}

			
			
			
			//Magic square array to be used in the class
			int[][]msArrayChecker = new int[currentBoxSize][currentBoxSize];
			
			for(int i = 0; i < currentBoxSize; i++) {
				for(int j = 0; j < currentBoxSize; j++) {
					msArrayChecker[i][j] = msArray[i][j].getNumber();
				}
			}
			
			// CLASS CODE
			if (!errorExists) {
				Checker myClass = new Checker();
				
				myClass.setMsSize(currentBoxSize);
				myClass.msAClass(msArrayChecker);

				String Result = myClass.getSquare();
				answerField.setText(Result);
			}
        	
        }
        

    }


    public static void main(String[] args) {
        JFrame frm = new Main();
        frm.setTitle ("Magic Square:Select size");
        frm.setSize (700, 500);
        frm.setVisible (true);
    }

}
