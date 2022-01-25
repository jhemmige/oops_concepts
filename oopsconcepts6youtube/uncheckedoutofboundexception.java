/* This script basically shows 3 types of unchecked exception  and how its handled using try, catch and finally block*/



public class uncheckedoutofboundexception {

	public static void main(String[] args) {
		
/*1.Exception occurs, catch block handles, finally block also executes.	
		
		int arr[] = new int[5];
		
		System.out.println("program started");
		
		try {
			
			
			arr[10]=100;
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println	(e.getMessage());
		}
		

		finally {
			
			
			System.out.println	("this msg is from finally block");
			
		}*/
		
//**************************************************************************************************************************		
		
/*  2.Exception occurs,catch block fails to handle, finally block executes*/	
		
		
/*int arr[] = new int[5];
		
		System.out.println("program started");
		
		try {
			
			
			arr[10]=100;
		}
	//here an incorrect exception is added as parameter. catch block fails to catch the exception. still finally block is executed.	
		catch (ArithmeticException e) {
			
			System.out.println	(e.getMessage());
			
		}
		
		
		finally {
			
			System.out.println	("this msg is from finally block");
			
		}*/
		
		//**************************************************************************************************************************	
		
		/*  3.Exception doesnot occur,catch block ignores, finally block still executes*/	
		
int arr[] = new int[5];
		
		System.out.println("program started");
		
		try {
			
		 
			arr[4]=100; // no exception . Size size 4 is within 5
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println	(e.getMessage()); // catch block ignores 
			
		}
		
		System.out.println	("end of program"); // this fails to run in 2nd case.
		
	}

}
