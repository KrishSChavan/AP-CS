import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {

	JLabel startingLabel = addLabel ("Pick the size of your square", 1,1,1,1);
	
    JButton size2Button = addButton ("2x2", 5,1,1,1);
    JButton size4Button = addButton ("4x4", 4,1,1,1);
    JButton size6Button = addButton ("6x6", 3,1,1,1);
    JButton size8Button = addButton ("8x8", 2,1,1,1);
    
    JButton doneButton = addButton ("Done?", 11,3,1,1);
    
    
    
    public int currentBoxSize = 0;

    boolean valEntered = false;
    
    public void grid2x2() {
    	
    	IntegerField r1xc1 = addIntegerField (0, 2,1,1,1);
    	IntegerField r1xc2 = addIntegerField (0, 2,2,1,1);
        
        IntegerField r2xc1 = addIntegerField (0, 3,1,1,1);
        IntegerField r2xc2 = addIntegerField (0, 3,2,1,1);

        currentBoxSize = 2;
        size8Button.setVisible(false);
        size6Button.setVisible(false);
        size4Button.setVisible(false);
        size2Button.setVisible(false);
        startingLabel.setText("Please fill in the input fields");
        
        while (valEntered) {
			System.out.println(valEntered);
			
			System.out.println(r1xc1.getNumber() + " " + r1xc2.getNumber());
			System.out.println(r2xc1.getNumber() + " " + r2xc2.getNumber());
		}       
        
    }
    
    public void buttonClicked(JButton buttonObj){

        if (buttonObj == size2Button && currentBoxSize == 0) {
 
        	
//        	IntegerField r1xc1 = addIntegerField (0, 2,1,1,1);
//        	IntegerField r1xc2 = addIntegerField (0, 2,2,1,1);
//            
//            IntegerField r2xc1 = addIntegerField (0, 3,1,1,1);
//            IntegerField r2xc2 = addIntegerField (0, 3,2,1,1);
//
//            currentBoxSize = 2;
//            size8Button.setVisible(false);
//            size6Button.setVisible(false);
//            size4Button.setVisible(false);
//            size2Button.setVisible(false);
//            startingLabel.setText("Please fill in the input fields");
//            
//            while (valEntered) {
//				System.out.println(valEntered);
//    			
//    			System.out.println(r1xc1.getNumber() + " " + r1xc2.getNumber());
//    			System.out.println(r2xc1.getNumber() + " " + r2xc2.getNumber());
//			}            
            
        	
            
        } else if (buttonObj == size4Button && currentBoxSize == 0)  {
        	
        	IntegerField r1xc1 = addIntegerField (0, 2,1,1,1);
        	IntegerField r1xc2 = addIntegerField (0, 2,2,1,1);
            IntegerField r1xc3 = addIntegerField (0, 2,3,1,1);
        	IntegerField r1xc4 = addIntegerField (0, 2,4,1,1);
            
            IntegerField r2xc1 = addIntegerField (0, 3,1,1,1);
            IntegerField r2xc2 = addIntegerField (0, 3,2,1,1);
            IntegerField r2xc3 = addIntegerField (0, 3,3,1,1);
            IntegerField r2xc4 = addIntegerField (0, 3,4,1,1);
        	
            IntegerField r3xc1 = addIntegerField (0, 4,1,1,1);
            IntegerField r3xc2 = addIntegerField (0, 4,2,1,1);
            IntegerField r3xc3 = addIntegerField (0, 4,3,1,1);
            IntegerField r3xc4 = addIntegerField (0, 4,4,1,1);
            
            IntegerField r4xc1 = addIntegerField (0, 5,1,1,1);
            IntegerField r4xc2 = addIntegerField (0, 5,2,1,1);
            IntegerField r4xc3 = addIntegerField (0, 5,3,1,1);
            IntegerField r4xc4 = addIntegerField (0, 5,4,1,1);
        	
            currentBoxSize = 4;
            size8Button.setVisible(false);
            size6Button.setVisible(false);
            size4Button.setVisible(false);
            size2Button.setVisible(false);
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == size6Button && currentBoxSize == 0) {
        	
        	IntegerField r1xc1 = addIntegerField (0, 2,1,1,1);
            IntegerField r1xc2 = addIntegerField (0, 2,2,1,1);
        	IntegerField r1xc3 = addIntegerField (0, 2,3,1,1);
            IntegerField r1xc4 = addIntegerField (0, 2,4,1,1);
            IntegerField r1xc5 = addIntegerField (0, 2,5,1,1);
            IntegerField r1xc6 = addIntegerField (0, 2,6,1,1);
        	
            IntegerField r2xc1 = addIntegerField (0, 3,1,1,1);
            IntegerField r2xc2 = addIntegerField (0, 3,2,1,1);
            IntegerField r2xc3 = addIntegerField (0, 3,3,1,1);
            IntegerField r2xc4 = addIntegerField (0, 3,4,1,1);
            IntegerField r2xc5 = addIntegerField (0, 3,5,1,1);
            IntegerField r2xc6 = addIntegerField (0, 3,6,1,1);
            
            IntegerField r3xc1 = addIntegerField (0, 4,1,1,1);
            IntegerField r3xc2 = addIntegerField (0, 4,2,1,1);
            IntegerField r3xc3 = addIntegerField (0, 4,3,1,1);
            IntegerField r3xc4 = addIntegerField (0, 4,4,1,1);
            IntegerField r3xc5 = addIntegerField (0, 4,5,1,1);
            IntegerField r3xc6 = addIntegerField (0, 4,6,1,1);
            
            IntegerField r4xc1 = addIntegerField (0, 5,1,1,1);
            IntegerField r4xc2 = addIntegerField (0, 5,2,1,1);
            IntegerField r4xc3 = addIntegerField (0, 5,3,1,1);
            IntegerField r4xc4 = addIntegerField (0, 5,4,1,1);
            IntegerField r4xc5 = addIntegerField (0, 5,5,1,1);
            IntegerField r4xc6 = addIntegerField (0, 5,6,1,1);
            
            IntegerField r5xc1 = addIntegerField (0, 6,1,1,1);
            IntegerField r5xc2 = addIntegerField (0, 6,2,1,1);
            IntegerField r5xc3 = addIntegerField (0, 6,3,1,1);
            IntegerField r5xc4 = addIntegerField (0, 6,4,1,1);
            IntegerField r5xc5 = addIntegerField (0, 6,5,1,1);
            IntegerField r5xc6 = addIntegerField (0, 6,6,1,1);
            
            IntegerField r6xc1 = addIntegerField (0, 7,1,1,1);
            IntegerField r6xc2 = addIntegerField (0, 7,2,1,1);
            IntegerField r6xc3 = addIntegerField (0, 7,3,1,1);
            IntegerField r6xc4 = addIntegerField (0, 7,4,1,1);
            IntegerField r6xc5 = addIntegerField (0, 7,5,1,1);
            IntegerField r6xc6 = addIntegerField (0, 7,6,1,1);
            
            currentBoxSize = 6;
            size8Button.setVisible(false);
            size6Button.setVisible(false);
            size4Button.setVisible(false);
            size2Button.setVisible(false);
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == size8Button && currentBoxSize == 0) {
      	
        	IntegerField r1xc1 = addIntegerField (0, 2,1,1,1);
            IntegerField r1xc2 = addIntegerField (0, 2,2,1,1);
        	IntegerField r1xc3 = addIntegerField (0, 2,3,1,1);
            IntegerField r1xc4 = addIntegerField (0, 2,4,1,1);
            IntegerField r1xc5 = addIntegerField (0, 2,5,1,1);
            IntegerField r1xc6 = addIntegerField (0, 2,6,1,1);
            IntegerField r1xc7 = addIntegerField (0, 2,7,1,1);
            IntegerField r1xc8 = addIntegerField (0, 2,8,1,1);
            
            IntegerField r2xc1 = addIntegerField (0, 3,1,1,1);
            IntegerField r2xc2 = addIntegerField (0, 3,2,1,1);
            IntegerField r2xc3 = addIntegerField (0, 3,3,1,1);
            IntegerField r2xc4 = addIntegerField (0, 3,4,1,1);
            IntegerField r2xc5 = addIntegerField (0, 3,5,1,1);
            IntegerField r2xc6 = addIntegerField (0, 3,6,1,1);
            IntegerField r2xc7 = addIntegerField (0, 3,7,1,1);
            IntegerField r2xc8 = addIntegerField (0, 3,8,1,1);
            
            IntegerField r3xc1 = addIntegerField (0, 4,1,1,1);
            IntegerField r3xc2 = addIntegerField (0, 4,2,1,1);
            IntegerField r3xc3 = addIntegerField (0, 4,3,1,1);
            IntegerField r3xc4 = addIntegerField (0, 4,4,1,1);
            IntegerField r3xc5 = addIntegerField (0, 4,5,1,1);
            IntegerField r3xc6 = addIntegerField (0, 4,6,1,1);
            IntegerField r3xc7 = addIntegerField (0, 4,7,1,1);
            IntegerField r3xc8 = addIntegerField (0, 4,8,1,1);
            
            IntegerField r4xc1 = addIntegerField (0, 5,1,1,1);
            IntegerField r4xc2 = addIntegerField (0, 5,2,1,1);
            IntegerField r4xc3 = addIntegerField (0, 5,3,1,1);
            IntegerField r4xc4 = addIntegerField (0, 5,4,1,1);
            IntegerField r4xc5 = addIntegerField (0, 5,5,1,1);
            IntegerField r4xc6 = addIntegerField (0, 5,6,1,1);
            IntegerField r4xc7 = addIntegerField (0, 5,7,1,1);
            IntegerField r4xc8 = addIntegerField (0, 5,8,1,1);
            
            IntegerField r5xc1 = addIntegerField (0, 6,1,1,1);
            IntegerField r5xc2 = addIntegerField (0, 6,2,1,1);
            IntegerField r5xc3 = addIntegerField (0, 6,3,1,1);
            IntegerField r5xc4 = addIntegerField (0, 6,4,1,1);
            IntegerField r5xc5 = addIntegerField (0, 6,5,1,1);
            IntegerField r5xc6 = addIntegerField (0, 6,6,1,1);
            IntegerField r5xc7 = addIntegerField (0, 6,7,1,1);
            IntegerField r5xc8 = addIntegerField (0, 6,8,1,1);
            
            IntegerField r6xc1 = addIntegerField (0, 7,1,1,1);
            IntegerField r6xc2 = addIntegerField (0, 7,2,1,1);
            IntegerField r6xc3 = addIntegerField (0, 7,3,1,1);
            IntegerField r6xc4 = addIntegerField (0, 7,4,1,1);
            IntegerField r6xc5 = addIntegerField (0, 7,5,1,1);
            IntegerField r6xc6 = addIntegerField (0, 7,6,1,1);
            IntegerField r6xc7 = addIntegerField (0, 7,7,1,1);
            IntegerField r6xc8 = addIntegerField (0, 7,8,1,1);
            
            IntegerField r7xc1 = addIntegerField (0, 8,1,1,1);
            IntegerField r7xc2 = addIntegerField (0, 8,2,1,1);
            IntegerField r7xc3 = addIntegerField (0, 8,3,1,1);
            IntegerField r7xc4 = addIntegerField (0, 8,4,1,1);
            IntegerField r7xc5 = addIntegerField (0, 8,5,1,1);
            IntegerField r7xc6 = addIntegerField (0, 8,6,1,1);
            IntegerField r7xc7 = addIntegerField (0, 8,7,1,1);
            IntegerField r7xc8 = addIntegerField (0, 8,8,1,1);
            
            IntegerField r8xc1 = addIntegerField (0, 9,1,1,1);
            IntegerField r8xc2 = addIntegerField (0, 9,2,1,1);
            IntegerField r8xc3 = addIntegerField (0, 9,3,1,1);
            IntegerField r8xc4 = addIntegerField (0, 9,4,1,1);
            IntegerField r8xc5 = addIntegerField (0, 9,5,1,1);
            IntegerField r8xc6 = addIntegerField (0, 9,6,1,1);
            IntegerField r8xc7 = addIntegerField (0, 9,7,1,1);
            IntegerField r8xc8 = addIntegerField (0, 9,8,1,1);
        	
            currentBoxSize = 8;
            size8Button.setVisible(false);
            size6Button.setVisible(false);
            size4Button.setVisible(false);
            size2Button.setVisible(false);
            startingLabel.setText("Please fill in the input fields");
        } else if (buttonObj == doneButton) {
        	
        	valEntered = true;
        	
        	System.out.println("clicked");
        	
        }
    	
        
        

    }


    public static void main(String[] args) {
        JFrame frm = new Main();
        frm.setTitle ("Magic Square:Select size");
        frm.setSize (700, 300);
        frm.setVisible (true);
    }

}
