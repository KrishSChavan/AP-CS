import javax.swing.*;
import BreezySwing.*;

public class EmployeeGUI extends GBFrame {

    String[][] employeeArr = new String[10][10];

    JLabel nameLabel = addLabel("Name: ", 1, 1, 1, 1);
    JTextField employeeName = addTextField ("", 1,2,1,1);

    JLabel q1Label = addLabel("Quarter 1 Sales: ", 2, 1, 1, 1);
    JTextField q1Sales = addTextField ("", 2,2,1,1);

    JLabel q2Label = addLabel("Quarter 2 Sales: ", 3, 1, 1, 1);
    JTextField q2Sales = addTextField ("", 3,2,1,1);

    JLabel q3Label = addLabel("Quarter 3 Sales: ", 4, 1, 1, 1);
    JTextField q3Sales = addTextField ("", 4,2,1,1);

    JLabel q4Label = addLabel("Quarter 4 Sales: ", 5, 1, 1, 1);
    JTextField q4Sales = addTextField ("", 5,2,1,1);

    JLabel blank = addLabel("", 6, 1, 1, 1);

    JButton enterBtn = addButton ("Enter", 7,1,1,1);
    JButton addEmployee = addButton ("Add Employee", 7,2,1,1);

    JLabel errLabel = addLabel("", 8, 1, 1, 1);

    int nameCount = 0;

    public boolean fieldsFilled() {
        boolean filled = false;

        if (employeeName != null && q1Sales != null && q2Sales != null && q3Sales != null && q4Sales != null) {
            filled = true;
        }
        return filled;
    }

    public void buttonClicked(JButton buttonObj){

        if (fieldsFilled()) {
            if (buttonObj == enterBtn) {
                nameCount++;
                employeeArr[nameCount][0] = employeeName.getText();
            } else if (buttonObj == addEmployee) {

                for (int i=0; i < employeeArr.length; i++) {
                    System.out.println(employeeArr[i][0] + '\n');
                }

                System.out.println("Add a new Employee");
            }
        } else {
//            errLabel.setText("Make sure to fill all the fields");
            System.out.println("Make sure to fill all the fields");
        }

    }




    public static void main(String[] args) {
        JFrame frm = new EmployeeGUI();
        frm.setTitle ("Employee Sales");
        frm.setSize (400, 250);
        frm.setVisible (true);
    }

}
