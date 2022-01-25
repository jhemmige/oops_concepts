
public class ConstructorOverloading {
	
	int a;
	int b;
	double c;
	// default constructor with no parameters
	ConstructorOverloading(){
		a=500;
		b=200;
		
		
		//System.out.println(a+b);// we can put the print command inside the constructor itself or create a seperate method for it. 	
	}
	
	
	ConstructorOverloading(int x, int y){
		
		a=x;
		b=y;
		
	}
	
	ConstructorOverloading(int x, int y, double z){
		
		a=x;
		b=y;
		c=z;
	}
	
ConstructorOverloading(int x, double y, int z){
		
a=x;
c=y;
b=z;
	}

ConstructorOverloading(int x, double z){
	
a=x;
c=z;
	}
	
	
	void display() {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		
		//ConstructorOverloading co= new ConstructorOverloading();// default constructor - no parameters
		//ConstructorOverloading co= new ConstructorOverloading(10, 20);//parameterized constructor 
		//ConstructorOverloading co= new ConstructorOverloading(10, 50, 20.7);// parameterized constructor
		//ConstructorOverloading co= new ConstructorOverloading(10, 50.6,20);//parameterized constructor where the order of variables
		//changed
		ConstructorOverloading co= new ConstructorOverloading(10, 25.5);
		co.display();
		
	}

}
