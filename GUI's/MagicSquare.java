import javax.swing.*;
import BreezySwing.*;

public class MagicSquare extends GBFrame {

    JLabel startingLabel = addLabel ("Pick the size of your square", 1,1,1,1);

    JButton size2Button = addButton ("2x2", 5,1,1,1);
    JButton size4Button = addButton ("4x4", 4,1,1,1);
    JButton size6Button = addButton ("6x6", 3,1,1,1);
    JButton size8Button = addButton ("8x8", 2,1,1,1);


    public class Square2 extends GBFrame{
        JFrame square = new Square2();
        square.setTitle ("Fraction Calculator");
        square.setSize (500, 200);
        square.setVisible (true);
    }
    public class Square4 extends GBFrame{
        JFrame square = new Square2();
        square.setTitle ("Fraction Calculator");
        square.setSize (500, 200);
        square.setVisible (true);
    }
    public class Square6 extends GBFrame{
        JFrame square = new Square2();
        square.setTitle ("Fraction Calculator");
        square.setSize (500, 200);
        square.setVisible (true);
    }
    public class Square8 extends GBFrame{
        JFrame square = new Square2();
        square.setTitle ("Fraction Calculator");
        square.setSize (500, 200);
        square.setVisible (true);
    }

    public void buttonClicked(JButton buttonObj){

        if (buttonObj == size2Button) {
            JFrame square = new Square2();
            square.setTitle ("Fraction Calculator");
            square.setSize (500, 200);
            square.setVisible (true);
        } else if (buttonObj == size4Button)  {
            JFrame square = new Square4();
            square.setTitle ("Fraction Calculator");
            square.setSize (500, 200);
            square.setVisible (true);
        } else if (buttonObj == size6Button) {
            JFrame square = new Square6();
            square.setTitle ("Fraction Calculator");
            square.setSize (500, 200);
            square.setVisible (true);
        } else if (buttonObj == size8Button) {
            JFrame square = new Square8();
            square.setTitle ("Fraction Calculator");
            square.setSize (500, 200);
            square.setVisible (true);
        }

    }


    public static void main(String[] args) {
        JFrame frm = new MagicSquare();
        frm.setTitle ("Fraction Calculator");
        frm.setSize (500, 200);
        frm.setVisible (true);
    }

}
