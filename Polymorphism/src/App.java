
public class App {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle();
		Car car1 = new Car();
		
		Vehicle vehicle2 = vehicle1;// Now we have two references pointing at the same object.
		Vehicle vehicle3 = car1; // This is polymorphism in action.
		
		vehicle1.design();
		vehicle3.design();
		car1.ride();
		
		//vehicle3.ride(); - The method ride() is undefined for the type Vehicle.
		
		createDesign(car1);
	}
	
	public static void createDesign(Vehicle vehicle) {
		vehicle.design();
	}

}
