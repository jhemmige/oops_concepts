//this script is mainly to show "this" concept.



public class ThisConcept {
	
	int a; // these are instance variables or class variables 
	int b;
	
	//this is a method // a &b are method variables/external variables
	void sum(int a, int b) {
		
		this. a=a;
		this. b= b;
			
	}
// this is a constructor 
	ThisConcept(int a, int b){
		
		this. a=a;
		this. b= b;
	}
	
void display() {
	
	System.out.println( "this is the sum of 2 numbers" + (a+b));
	
	
}
	public static void main(String[] args) {
	
	/*	ThisConcept tc= new ThisConcept();  // this is for the method "sum"
		tc.sum(10, 20);
		tc.display();*/
		
		ThisConcept tc= new ThisConcept(1,2); // this is for the constructor.
		tc.display();

	}

}
