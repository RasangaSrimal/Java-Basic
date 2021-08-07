
public class Application {

	public static void main(String[] args) {

		Vehicle vehicle1 = new Vehicle("Car");
		vehicle1.drive();
		
		Computer computer1 = new Computer();
		computer1.start();
		
		Information info = new Vehicle("Car");
		info.displayInfo();
		
		Information info1 = new Computer();
		info1.displayInfo();
		
		System.out.println();
		
		showInfo(vehicle1);
		showInfo(computer1);
		
	}
	
	public static void showInfo(Information info) {
		info.displayInfo();
	}

}
