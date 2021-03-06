
public class CastingNumericalValues {

	public static void main(String[] args) {
		
		String a = "qr";
		byte byteValue = 12;
		short shortValue = 567;
		int intValue = 24;
		long longValue = 2455467;
		
		float floatValue = 2345.654f;
		double doubleValue = 23.63;
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE + "\n");
		
		intValue = (int) longValue; // Casting long to int.
		System.out.println(intValue + "\n");
		
		intValue = (int) floatValue; // Remove all decimal points without rounding.
		System.out.println(intValue);
		
		// intValue = (int) a; - Cannot cast from String to int
		
	}

}
