import javax.swing.*;
import BreezySwing.*;

public class Print extends GBDialog {

	JButton nameSort = addButton("Sorted by Name", 1,1,1,1);
	JButton gradeSort = addButton("Sorted by Grades", 1,3,1,1);
	
	JButton close = addButton("CANCEL", 2,2,1,1);
	
	private Student[] stu;
	private int count;
	
	public Print(JFrame parent, Student[] stu2, int cnt){
		super (parent);                                 // ** REQUIRED **
        setTitle ("Print");
        setDlgCloseIndicator ("Cancel");
        setSize (400, 250);
        this.stu = stu2;
        this.count = cnt;
	}
	
	public void buttonClicked(JButton btn){
		dispose();
		AllStudents as = new AllStudents();
		if (btn == nameSort) {
			messageBox(as.printSorted(stu, count, "N"));
		} else if (btn == gradeSort) {
			messageBox(as.printSorted(stu, count, "G"));
		}
	}
	
}
