import java.util.*;

import javax.swing.*;
import BreezySwing.*;

public class CheckOut extends GBDialog {
	
	public CheckOut(JFrame frame, ArrayList<Object> library) {
		super(frame);
		
		setTitle ("Checkout Book");
        setSize (300, 200);
		
		for (int i=0; i<library.size(); i++) {
//			this.add(new JButton(((Library) library.get(i)).getTitle()));
			this.add(new JButton(((Library) library.get(i)).getTitle()));
			this.add(new JLabel(" "));
		}
		
		// TODO Auto-generated constructor stub
	}
	
	public void buttonClicked(JButton buttonObj){
		
		
		
	}

}
