package inheritance;

public class UnderGrad extends Student {
	
	private static String grade;
    private String name, id;

    public UnderGrad(String enteredName, String enteredId, String enteredGrade) {
        super(enteredName, enteredId);
        name = enteredName;
        id = enteredId;
        grade = enteredGrade;
    }

    public String getGrade() {
        return grade;
    }

    public boolean equal(String grade) {
        if (grade.equals(getGrade())) {
            return true;
        }else {
            return false;
        }
    }

    public String print() {
        return "Name: " + name + " |ID:" + id + " |Grade:" + grade;

    }
}
