package inheritance;

import javax.swing.*;
import BreezySwing.*;

public class Person {
	
	public static String name = "";
	
	public Person(String enteredName) {
		name = enteredName;
	}
	
	public String getName() {
		return name;
	}
	
	public String print() {
		return "Name - " + name;
	}

}
