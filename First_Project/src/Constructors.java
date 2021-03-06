
class Program {
	
	int value;
	String text;
	
	public Program() {
		this(6);
		System.out.println("First Constructor " + this.value + "\n");
		value = 12;
	}
	
	public Program(int value) {
		this.value = value;
		System.out.println("Second Constructor " + this.value);
	}
	
	public Program(int value, String text) {
		this();
		this.value = value;
		this.text = text;
		System.out.println("Third Constructor " + this.value + " " + this.text);
	}
	
}

public class Constructors {

	public static void main(String[] args) {
		
		Program myProgram = new Program();
		new Program();
		Program myProgram1 = new Program(4);
		Program myProgram2 = new Program(7, "Hi");
	}

}
