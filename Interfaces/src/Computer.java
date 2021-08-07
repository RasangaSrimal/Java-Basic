
public class Computer implements Information {

	private int speed = 345;
	
	public void start() {
		System.out.println("Starting the computer");
	}

	@Override
	public void displayInfo() {
		System.out.println("Computer ram speed is " + speed);		
	}
}
