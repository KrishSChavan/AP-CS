import javax.swing.*;
import BreezySwing.*;

public class DecreasingSeq extends GBFrame{
	
	JButton startBtn = addButton("Let's get into it!", 1,5,1,1);
	JLabel	messageBox = null;
	JButton addAnotherBtn = null;
	JButton calculateBtn = null;
	JButton resetBtn = null;
	IntegerField inputField = null;
	GBPanel gridPanel = null;
	
		
	int[]seq = new int[25];
	int[][]Output;
		
	boolean TFSequence;
	int s;
	boolean validSize;
	boolean allGood;
	
	public void buttonClicked(JButton Button) {	
		// Checking for the user to bootup the program
		if(Button == startBtn) {
			s = 0;
			startBtn.setVisible(false);
			gridPanel = addPanel(1,9,1,1);
			inputField = gridPanel.addIntegerField(0, 1,5,2,2);
			messageBox = gridPanel.addLabel("1 of 25", 1, 7, 1, 1);
			addAnotherBtn	= gridPanel.addButton("Enter Number", 2,6,1,1);
			resetBtn = gridPanel.addButton("Revert", 2,7,1,1);
			calculateBtn = gridPanel.addButton("calculate", 2,8,1,1);
			inputField.grabFocus();
		}
		
		// adding the current number to an array
		if(Button == addAnotherBtn) {
			if(inputField.isValidNumber() == false) {
				validSize = false;
				messageBox.setVisible(true);
				messageBox.setText("Please input a valid number");
			}
			else{
				seq[s] = inputField.getNumber();
				s++;
				validSize = true;
			}
			if(validSize == true) {
				messageBox.setVisible(true);
				if (s < 25) {
					messageBox.setText((s + 1) + " of 25");
				} else {
					messageBox.setText("MAX LIMIT REACHED");
				}
				inputField.setNumber(0);
				inputField.grabFocus();
			}
		}
		
		// reseting everything back to the start
		if(Button == resetBtn) {
			for(int i = 0; i < s; i++) {
				seq[i] = 0;
			}
			gridPanel.setVisible(false);
			gridPanel.removeAll();
			gridPanel.repaint();
			startBtn.setVisible(true);
		}
		
		
		// finally calculating the longest non-decreasing sequence
		if(Button == calculateBtn && validSize == true) {
			Output = new int[12][s];
			int []realSequence = new int [s];
			for (int i = 0; i < s; i++) {
				realSequence[i] = seq[i];
			}
			
			
			// making sure that the user has inputed correct amount of numbers
			
			allGood = true;
			if(s < 2) {
				allGood = false;
				messageBox.setVisible(true);
				messageBox.setText("2 or more numbers required");
			}
			
			for(int i = 0; i < s ; i++) {
			}
			
			// setting up a new row for each non-decreasing sequence
			
			if(allGood == true) {
				
				int pos = 0;
				int RCount = 0;

				for (int r = 0; r <s/2; r++) {
					int Counter = 0;
					if(pos >= s-1) {
						break;
					}
					for(int i = pos; i < s-1; i++) {
						if (realSequence[i] <= realSequence[i+1]) {
							Output[r][Counter] = realSequence[i];
							Output[r][Counter+1] = realSequence[i+1];
							Counter++;
							if (i == s-2) {
								pos = pos + s;
								RCount++;
							}
						}else {
							pos = i + 1;
							RCount++;
							break;
						}
					}
				}
	
				// getting the longest sequence
				
				int[][]lndsResult = new int[RCount][s];
				int LongestRow = 0;
				for (int r = 0; r < RCount; r++) {
					int NZCount = 0;
					for(int i = 0; i < s; i++) {
						if(Output[r][i] != 0) {
							NZCount++;
						}
					}
					if(LongestRow < NZCount){
						LongestRow = NZCount;
					}
					for(int i = 0; i < NZCount; i++) {
						lndsResult[r][i] = Output[r][i];
						}
					}
				
				TFSequence = true;
				if (LongestRow < 2) {
					TFSequence = false;
					messageBox("There are no sequences present");
				}


				
				// handling arrays with same length
				
				String [][]lndsOutput = new String [RCount][LongestRow];
				if(TFSequence = true) {
					for (int r = 0; r < RCount; r++) {
						int NZCount = 0;
						for(int i = 0; i < s; i++) {
							if(Output[r][i] != 0) {
								NZCount++;
							}
						}
						if(LongestRow == NZCount) {
							for(int I = 0; I < LongestRow; I++) {
								lndsOutput[r][I] = lndsResult[r][I] + ", ";
							}
						}
					}
				}
				String FOutputs = "";
				for (int r = 0; r < RCount; r++) {
					String AOutputs = "";
					for (int i = 0; i < LongestRow; i++) {
						AOutputs = (AOutputs + lndsOutput[r][i]);
					}
					FOutputs = (FOutputs + "Sequence " + r + ": " + AOutputs + " | ");
				}
				messageBox((FOutputs));
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm = new DecreasingSeq();
		frm.setTitle("Longest Non-Decreasing Sequence");
		frm.setSize(400,200);
		frm.setVisible(true);
	}
}
