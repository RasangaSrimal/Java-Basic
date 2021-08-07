//define new class
class Methods {
	
	String animal; //define variables
	int value;
	int months;
	
	//add a method
	void run() {
		System.out.println("Running");
		System.out.println("My " + animal + " is " + value + " years old.");
	}
	
	int monthsLeft() {
		int monthsLeft = 12 - months;
			return monthsLeft;
	}
	
	void talk(String name, int min) {
		System.out.println("Hi " + name + " it takes " + min + " mins.");		
	}
}

public class ClassesMethodsObjects {
	public static void main(String[] args) {
		
		Methods name = new Methods(); //create a new object (name)
		name.animal = "cat"; // give values to initialised 
		name.value = 5;
		name.run(); //call the method
		name.months = 3;
		int month = name.monthsLeft();
		System.out.println(month);
		name.talk("Bob", 18);
	}
}
