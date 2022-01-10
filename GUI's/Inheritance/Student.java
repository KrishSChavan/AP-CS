package inheritance;

public class Student extends Person {

	private static String id;
	private String name;
	
	public Student(String enteredName, String enteredId) {
		super(enteredName);
		// TODO Auto-generated constructor stub
		
		name = enteredName;
		id = enteredId;
	}

	 public String getID() {
	     return id;
	 }

	 public String print() {
	     return "Name: " + name + " |ID:" + id;
	 }

}
