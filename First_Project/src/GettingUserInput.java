import java.util.Scanner;

public class GettingUserInput {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a text line: ");
		String text = input.nextLine();
		System.out.println("Your line is: " + text);
		
		System.out.println("Enter an enteger: ");
		int number = input.nextInt();
		System.out.println("Your number is: " + number);
	}	
}
