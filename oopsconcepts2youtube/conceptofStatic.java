/* static variable or static method  can be accessed only by static main method directly with out objects.  
 * We dont need to create an object for it . */



public class conceptofStatic {
	
	
	static int z=1000; // variable value declared at class level
	int a;
	static int b;
	
	
	/*  Concept of System .print.ln*/
	static String s="welcome";
	
	//A STATIC METHOD CAN ACCESS ONLY STATIC VARIABLES AND METHOD
	static void  display() {
		
		System.out.println("this is a static method!");
		
	}
		
	// A NON STATIC METHOD
	void display2() {
		
		System.out.println("this is a NON static method!");
		
	}
	
	
	// A NON STATIC METHOD CAN ACCESS BOTH STATIC AND NONSTATIC VARIABLES AND METHODS
	void display3() {
		
		a=10;
		b=20;
		System.out.println( a);
		System.out.println( b);
		System.out.println( a+b);
		display();
		display2();
		
	}
			

	public static void main(String[] args) {
		
		System.out.println(z);// can access class level variable since its static. 	
		
		//b=100; 
		//System.out.println("this is the variable b value" +b );
		//display();
		//a=200; --> this will throw error as its is not static.

		//display2();--> this will throw error as its is not static.
		
		conceptofStatic cos= new conceptofStatic(); // creating object for this
		
		//int c= cos.a=500;
		
		//System.out.println("this is the variable a value" + c);
		
		//OR  same thing above can be written as 
		
		//System.out.println("this is the variable a value" +(cos.a=500));
		
		//cos.display2();
		
		cos.display3();
		
		
		/*  Concept of System .print.ln
		int len=	s.length();

		System.out.println(len);*/
	
		
		
	}

}
