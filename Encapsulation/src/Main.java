
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		// student1.name(); - The method name() is undefined for the type Student
		
		student1.setName("Lal");
		System.out.println(student1.getName());
		
		student1.setAge(12);
		System.out.println(student1.getAge());
	}

}
