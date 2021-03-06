
public class Arrays {

	public static void main(String[] args) {
		
		int number = 10; //primetive type
		int[] numbers = new int[5]; //reference type
		
		System.out.println(numbers[0]);
		
		numbers[0] = 4;
		numbers[1] = 15;
		numbers[2] = 54;
		numbers[3] = 42;
		numbers[4] = 6;

		
		System.out.println(numbers[0]);
		System.out.println(numbers[3] + "\n");
		
		int[] numbers1 = {21, 4, 67, 4, 3};
		
		System.out.println(numbers1[0]);
		System.out.println(numbers1[3] + "\n");

		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("\n");
		
		int[] oneDimensionalArray = {23, 5, 76};
		System.out.println(oneDimensionalArray[1]);
		
		int[][] multiDimensionalArray = {{12, 3, 5}, {2, 4}, {1}};
		System.out.println(multiDimensionalArray[1][1]);
		
		double[][] dArray = new double[5][3];
		System.out.println(dArray[4][2]);
		dArray[4][2] = 2.4;
		System.out.println(dArray[4][2] + "\n");
		
		//nested for loop
		for(int array=0; array<multiDimensionalArray.length; array++) {
			for(int item=0; item<multiDimensionalArray[array].length; item++) {
				System.out.print(multiDimensionalArray[array][item] + "\t");
			}
			System.out.println();
		}

	}

}
