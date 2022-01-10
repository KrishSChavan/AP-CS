package inheritance;

public class Grad extends Student {

	private static String major;
    private String name, id;

    public Grad(String enteredName, String enteredId, String enteredMajor) {
        super(enteredName, enteredId);
        name = enteredName;
        id = enteredId;
        major = enteredMajor;
    }

    public String getGrade() {
        return major;
    }

    public boolean equal(String grade) {
        if (grade.equals(getGrade())) {
            return true;
        }else {
            return false;
        }
    }

    public String print() {
        return "Name: " + name + " |ID:" + id + " |Major:" + major;

    }

}
