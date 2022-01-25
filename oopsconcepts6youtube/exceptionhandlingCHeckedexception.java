//checked exception with interrupted exception


import org.omg.CORBA.ExceptionList;

public class exceptionhandlingCHeckedexception {
	
	

	public void method1() throws InterruptedException {
		System.out.println("Program started");
		
		Thread.sleep(3000);
	}
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		
		//where ever we have reference for this it throws interrupedexception.
		exceptionhandlingCHeckedexception ehce= new exceptionhandlingCHeckedexception();
		ehce.method1();
		
	/*	System.out.println("Program initiated");
		System.out.println("Program is in progress");
		
		
		
		try {
			
			Thread.sleep(4000);
			
		}
		
		catch(InterruptedException e) {
	System.out.println(		e.getMessage());
		e.printStackTrace();
			
			
		}
		
		finally {
			
			System.out.println("Program completed");
			System.out.println("Program exited");
			
		}*/
		
		
		
		System.out.println("The end ");
		

	}

}
