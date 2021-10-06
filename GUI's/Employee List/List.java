import javax.swing.JFrame;

public class List {

	int q1Sales = 0;
	
	public class Person {
		public void setQ1(int q1) {
			q1Sales = q1;
		}
	}
	
}

public static void main(String[] args) {
	Person p = new Person();
	p.setQ1(5);
}

// https://www.infoworld.com/article/2076301/learn-how-to-store-data-in-objects.html
