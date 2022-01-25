package inheritenceconcept;

//this script shows Single Level and Multiple Level inheritence
class parentA{
	
	int a;
	
	public void display() {
		
		System.out.println(a);
		
	}	
	
}

class parentB extends parentA{
	
	int b;
	
	public void show() {
		
		System.out.println(b);
	}
	
}

class parentc extends parentB{
	
	int c;
	
	public void broadcast() {
		
		System.out.println(b);
	
	}
	
	
	
}


public class Single_Multilevel_inhertence {

	public static void main(String[] args) {
		
		parentA parA= new parentA();
		
		parA.a=10;
		parA.display();
		
		
		
		parentB parB = new parentB();
		
		parB.a= 50; // from parentA
		parB.display();// from parentA
		parB.b=100;// from parentB
		parB.show();// from parentB
		
		
		
		parentc parC = new parentc();
		
		//this is from parentA
		parC.a= 500;
		parC.display();
		//this is from parentB
		parC.b= 1000;
		parC.show();
		//this is from parentC
		parC.c=80;
		parC.broadcast();
		

	}

}
