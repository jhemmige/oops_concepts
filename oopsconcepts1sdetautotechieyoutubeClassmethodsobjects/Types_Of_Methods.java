/* 1. A method may not contain parameters also not return any value
 * 2. Not taking parameters but return a value 
 * 3. Method takes the parameter but not return any value	
 * 4. Method takes parameters and also  return a value  */
public class Types_Of_Methods {
	
	//static int x =10;
	//static int y=20;
	
	int x= 10;
	int y=20;
	//1. A method may not contain parameters
	public void sum() {
		
	System.out.println(x+y);	
		
	}
	//2. Not taking parameters but return a value 
	public int sum1() {
		
		return (x+y);	
		
		}
	
	//3. Method takes the parameter but not return any value	
	
	
	public void sum2(int a, int b) {
		
		x=a; // we are assigning value of a to x and value of b to y. I have commented the result in main method.
		y=b;
		System.out.println(a+b);	
		
		}
	
	//3. Method takes the parameter but not return any value

	public void sum3(int a, int b) {
	
	
		System.out.println(a+b);	
	
	}
	
	//4. Method takes parameters and also  return a value 

	public int sum4(int a, int b) {
		
		
		return a+b;	
	
	}
	
	
	public static void main(String[] args) {
		//1. A method may not contain parameters also not return any value
		
		Types_Of_Methods cal= new Types_Of_Methods();
		cal.sum();
		
		//2. Not taking parameters but return a value. When a value is returned, we need another variable to hold it. 
		//Additional variable is required in this case becuase of returned value	
			int returnedvalue= cal.sum1();
			System.out.println(returnedvalue);
			//or 
			System.out.println(cal.sum1());
			
		//	3. Method takes the parameter but not return any value	
			
			//cal.sum2(x, y); // in this case variables should be made static so that we can access in a static method
		
		//	3. Method takes the parameter but not return any value
			cal.sum3(50, 60);
			
		//4. Method takes parameters and also  return a value 	
		int sum=cal.sum4(50, 60);
		
		System.out.println(sum);
			
			
	}

}
