class Computer {
	
	public void shutDown() {
		System.out.println("Computer is shut down");
	}
}

interface Phone {
	void call();
}

public class Main {

	public static void main(String[] args) {
		
		Computer computer1 = new Computer() {
			@Override
			public void shutDown() {
				System.out.println("Macbook is shut down");
			}
		};
		computer1.shutDown();
		
		Phone phone1 = new Phone() {

			@Override
			public void call() {
				System.out.println("Calling....");
			}
			
		};
		phone1.call();
	}

}
