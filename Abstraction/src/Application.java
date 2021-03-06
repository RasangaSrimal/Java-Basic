// Abstract method is a method that isn't implemented yet
abstract class Dog {
	
	String breed;
	
	public void bark() {
		System.out.println("Bark!");
	}
	
	public abstract void poop();
}

class Rex extends Dog {
	
	public void poop() {
		System.out.println("Dog poop!");
	}
}

public class Application {

	public static void main(String[] args) {
		
		Rex dog1 = new Rex();
		dog1.bark(); 
		System.out.println(dog1.breed);
		dog1.poop();	
		
	}

}
