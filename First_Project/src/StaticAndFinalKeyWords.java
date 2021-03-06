
class Student {
	
	//create our own constant
	public static final int MY_CONSTANT = 10;
	
	public String name; //non-static variables, instance variables
	public static String studentClass; //static variables, class variables
	public static int count = 0;
	
	public Student() {
		count++;
	}
	
	//return type - void 
	public void studentName() {
		//non static methods can access static data
		System.out.println(name + ":" + studentClass + "\n");
	}
	
	public static void classInfo() {
		System.out.println("Java-" + studentClass + "\n");
		//Static method cannot access instance variables
		//System.out.println(name); This gives an error
	}
}

public class StaticAndFinalKeyWords {

	public static void main(String[] args) {
		
		Student.studentClass = "Java project";
		System.out.println(Student.studentClass);
		
		Student.classInfo();
		
		System.out.println("Before create objects: " + Student.count);
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		System.out.println("After create objects: " + Student.count + "\n");
		
		student1.name = "Bob";
		student2.name = "Jane";
		
		System.out.println(student1.name);
		System.out.println(student2.name + "\n");
		
		student1.studentName();
		student2.studentName();
		
		System.out.println(Math.E);
		System.out.println(Student.MY_CONSTANT);
	}

}
