import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		
		String myFile = "text.txt";
		
		File file = new File(myFile);
		
		Scanner text1 = new Scanner(file);
		
		int value = text1.nextInt();
		
		System.out.println("The value is " + value);
	}

}
