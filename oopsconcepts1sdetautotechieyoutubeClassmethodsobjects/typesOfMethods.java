/* 1. A method may not contain parameters
 * 2. A method may contain parameter
 * 3. method may return a value
 * 4. may not return a value  */



public class typesOfMethods {

//Method 1:  MAY NOT CONTAIN PARAMETER & Method 4 are the same
//Under Method 1 - values of the variables can be defined at the class itself or in the main method 

	//1a: value defined at class . Initialization at classlevel
/*	int a=100;
	int b=200; ----> Method 1*/
	
//1b: value defined in the main method . We just declare variables at class and assign values at mainmethod
/*	int a;
	int b; */
	
	//1a.  may not contain parameter - values defined at class level 
	/*void sum() {
	
	System.out.println("this will be the sum of a+b : " + ( a + b));

}*/
	
	//1b.  may not contain parameter - values defined at main method level 

	/*void sum() {
			
			System.out.println("this will be the sum of a+b :" + ( a + b));
		
		}*/
	
	// Method 2 - MAY CONTAIN PARAMETER
/*	int a;
	int b; */


	// Method 2 - MAY CONTAIN PARAMETER
	/*void sum(int x, int y) {
	
		a=x;
		b=y;
		
		
	System.out.println("this will be the sum of a+b : " + ( a + b));

}

/*Method 3 - MAY HAVE A RETURN TYPE*/
	
	
	int a;
	int b; 
	
//Method 3 - MAY HAVE A RETURN TYPE

/*	int sum(int x, int y) {
		
		a=x;
		b=y;

		return a+b;
		
	}*/
	
	//OR
	int sum () {
		
		return a+b;
	}
	

	public static void main(String[] args) {
		
		typesOfMethods cal = new typesOfMethods();
		
		
/*Method 1a- values of variable defined at class */
	
		//cal.sum; 
		
/*Method 1b- values of variable defined in main method 
		
/*cal.a=100;
	cal.b=200;
	cal.sum();*/
		
	
/*Method 2*/
		//cal.sum(100, 200);
		
/*Method 3*/
		
//int finalsum=	cal.sum(100, 200);
//System.out.println(finalsum);
		
		
//OR 

cal.a = 100;
cal.b= 200;
int finsum=cal.sum();

System.out.println(finsum);

	
	}

}
