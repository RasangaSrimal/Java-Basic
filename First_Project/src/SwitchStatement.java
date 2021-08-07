import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your instructions:");
		String text = input.nextLine();
		
		switch(text) {
		case "run":
			System.out.println("The programme is running");
			break;
		case "stop":
			System.out.println("The programme stopped");
			break;
		default:
			System.out.println("Not recognized");
		}
	}

}
