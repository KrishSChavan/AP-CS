public class Person {

	String name;
	int age;
	
	public Person(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	
//	SETTERS
	
	public void setAge(int a) {
		this.age = a;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	
//	GETTERS
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
}
