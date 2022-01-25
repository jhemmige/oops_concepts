package interfaceConcept;

interface I1{
	
	int z=10;
	
	void method_I1();
	
	
}

interface I2{
	
	int b=20;
	void method_I2();
	
}





class class1{
	
	int x=5;
	
	void broadcast() {
		
		
		System.out.println("this is from class: " + x);
		
		
	}
	
	
}

public class HyBridInheritence_Using_interface extends class1 implements I1, I2 {
	
	public void method_I1() { // implemented from I1
		
		System.out.println( "this is from Interface I1: " + z);
		
		
	}
	
public void method_I2() { // implemented from I2
		
		System.out.println("this is from Interface I2: " + b);
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		
		HyBridInheritence_Using_interface hui = new HyBridInheritence_Using_interface();
	
		hui.broadcast(); //implemented from class
		hui.method_I1(); // implemented from I1
		hui.method_I2(); // implemented from I1
		

	}

}
