
public class IfStatement {
	public static void main(String[] args) {
		
		int amount = 10;
		
		if(amount > 15) {
			System.out.println("It's true");
		}
		else if(amount < 5) {
			System.out.println("It's false");
		}
		else {
			System.out.println("None of above");
		}
		
		while(true) {
			System.out.println("In the loop");
			
			if(amount == 14) {
				break;
			}
			amount++;
			
			System.out.println("out of it");
		}
	}
}
