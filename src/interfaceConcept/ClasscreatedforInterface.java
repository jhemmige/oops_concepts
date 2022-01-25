package interfaceConcept;

interface A{
	
	//static variable is in italics. They are static and final
	int a=10; // we cannot just declare a variable in interface. we have to assign value to it or initialize it else it throws error
	
	void m1(); //abstract method and public by default
	
}








public class ClasscreatedforInterface implements A  {
	
/**so when we use the method in interface to be implemented in class, 
 *it SHOULD BE PUBLIC else this will throw error
void m1{
}**/
	public void m1() {
		
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		
		ClasscreatedforInterface cft= new ClasscreatedforInterface();
		
	/*A a = new A();  this is not possible. We can create obj for interface but cannot instantiate it.
	 * Hence we can create something like below. Create obj reference for interface but create new class and
	 * then call the method*/
		A a = new ClasscreatedforInterface();
		cft.m1(); // this is class obj ref
		a.m1(); // this is from interface. however method has been implemented in class
	}

	

}
