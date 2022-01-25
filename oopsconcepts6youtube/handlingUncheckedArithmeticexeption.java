

public class handlingUncheckedArithmeticexeption {

	public static void main(String[] args) {
		
		System.out.println(" program started");
		
		int a=20;
		
		try {
			
			System.out.println (a/0); // Arithmetic exception*/
		
		}
		
		//catch takes the parameter - type of exception. with a variable e.
		catch( ArithmeticException e ) {
			System.out.println(e.getMessage());
			
			
		}
		
		System.out.println("program completed");
		

	}

}
