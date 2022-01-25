
/**
 * Lecture #256 rahul shetty
 * 1.An abstract class is a class that is declared with abstract keyword.
 * 2. An abstract method is a method that is declared without an implementation- when curly braces are missing, it is an abstract method
 * for eg : Color method below
 * 3. An abstract class may or may not have all abstract methods. Some of them can be concrete methods
 * A method defined abstract must always be redefined in the subclass,
 * thus making overriding compulsory OR either make subclass itself abstract.
 * 4. Any class that contains one or more abstract methods must also be declared with abstract keyword.
 * 5. There can be no object of an abstract class.That is, an abstract class can not be directly instantiated with the new operator.
 * 6. An abstract class can have parametrized constructors and default constructor is always present in an abstract class.
 */



public abstract class Cars {
	
	
	Cars(){
		
		System.out.println("abstract class constructor");
	}

	public static void main(String[] args) {
	

	}

	
	public void engine() {
		
		System.out.println("1200 CC");
	}
	
	public void drive() {
		
		System.out.println("All Wheel Drive");
		
	}
	
	public void year() {
		
		System.out.println(" model 2020");
		
		
	}
	
	public abstract void color();
	
}
