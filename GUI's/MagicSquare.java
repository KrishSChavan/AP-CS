import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {
	
	IntegerField[][] msArray = new IntegerField[17][17];
	
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
    
    Checker myClass = new Checker();
    
    public int currentBoxSize = 0;
    
    public void buttonClicked(JButton buttonObj){

        if (buttonObj == size2Button) {
        	currentBoxSize = 2 + 1;
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == size3Button)  {
            currentBoxSize = 3 + 2;
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == size4Button) {
            currentBoxSize = 4 + 3;
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == size5Button) {
            currentBoxSize = 5 + 4;
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == size6Button) {
        	currentBoxSize = 6 + 5;
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == size7Button)  {
            currentBoxSize = 7 + 6;
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == size8Button) {
            currentBoxSize = 8 + 7;
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == doneButton) {
        	
        	int[][] msArray2 = new int[17][17];
        	
        	System.out.println(currentBoxSize);
        	System.out.println();
        	
        	for (int i=0; i < currentBoxSize; i++) {
            	for (int j=0; j < currentBoxSize; j++) {
            		System.out.println("i" + i + "    j" + j);
            		msArray2[i][j] = msArray[i][j].getNumber();
            		System.out.println(msArray2[i][j]);
            	}
            }
        	
        	System.out.println("clicked");	
        }
        	
        
        msFields.removeAll();
        for (int i=0; i < currentBoxSize; i++) {
        	for (int j=0; j < currentBoxSize; j++) {
        		msArray[i][j] = msFields.addIntegerField (1, j+10,i + 10,2,2);
        	}
        }
        
        msFields.setVisible(false);
        msFields.setVisible(true);

    }


    public static void main(String[] args) {
        JFrame frm = new Main();
        frm.setTitle ("Magic Square:Select size");
        frm.setSize (700, 500);
        frm.setVisible (true);
    }

}
