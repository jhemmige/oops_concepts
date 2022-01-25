package interfaceConcept;

/* points to note here : 
 * 
Its a blue print of a class.
Uses the keyword interface.
It has hold only static and final variables.
Methods in interface are abstract that means Methods in the interface has only definition and NO body. 
Methods in interface are PUBLIC by default. These methods can be accessed from anywhere. BUT if the method from interface needs to be accessed in a class, public keyword has to be used else it uses default access modifier and throws error.
Interface does not have a main method for implementation.
Interface can be extended to another class using implements keyword 
We cannot instantiate an interface 
Note: When class extends class, we use extends keyword 
When an class extends interface, we use implements keyword.

 *  */




interface  Testinterface{
	
	
	int a =10;
	String s= "show me the  Testinter method";
	void display();
		
}


interface TesterInter{
	
	int b=15;
	String f="flashing yellow!";
	
	void show();
	
}



interface Testinginter{
	
	int c= 25;
	
	String g="go green!";
			
	void showoff1();		
	
	
}


public class Multiple_inheritance_interface implements  Testinterface, TesterInter, Testinginter {
	
	// method in the class using the keyword public else it'll throw error. Since method in class has default accessor.
public void display() {
	
	System.out.println(s);
		
	}

public void show() {
	
	System.out.println(f);
	
}
	
public void showoff1() {
	
	System.out.println(g);
	
}

public void newshow() {
	
	System.out.println(a*b*c);
	
}

	public static void main(String[] args) {
		
		Multiple_inheritance_interface miobj= new Multiple_inheritance_interface();
		miobj.show();
		miobj.display();
		miobj.showoff1();
		miobj.newshow();
	
	}






}

