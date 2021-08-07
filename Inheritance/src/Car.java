 
public class Car extends Factory {
	public void brand() {
		System.out.println("Tesla");
	}
}

// Car is a sub-class of Factory
// Factory is the super-class of Car 
// Now Car class inherits everything of Factory class

/*
 
Access Modifiers:
	
	1) public    - Can access methods in any class any where regardless of 
				   whether the class is are or aren't in the same package.
	2) protected - This method can access this class or other class in 
				   same package. But in the different packages it must be extend 
				   the Car class to use protected method. 
	3) default (lack of access modifier) 
				 - only you can access this method in same class, same package. It
				   can't access in different packages regardless of whether it is a
				   sub class or not.
	4) private   - Only access in same class. Can't access any where even is a sub class
	
*/
  
