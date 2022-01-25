

interface Testinter{ //starts with interface keyword
	
	
	int a=100; // a is a variable which  is final and static  in interface by default
	
	void interfacemethod() ; /*by default the method in interface is public. Even if it doesnot contain the keyword "public" hence when 
	this gets implemented in the class, we HAVE TO USE public keyword else it throws error. 
	
	{
		interface method is abstract. So just has the definition but no body. 
	}*/
	
}


class Testingclass  implements  Testinter{
	
	public void interfacemethod() { /*/*by default the method in interface is public. Even if it doesnot contain the keyword "public" hence when 
	this gets implemented in the class, we HAVE TO USE public keyword else it throws error. 
	Try removing public and uncomment the method to see error*/
		
		
		System.out. println(" this method implemented from interface");
		
	}
	

	
	
	
	
	void classmethod() {
		
		System.out.println("This is class method");
	}
	
}




public class InterfaceConcept {

	public static void main(String[] args) {
		
		
/*		 * points to note:
 * 1. we cannot instantiate interface directly.  meaning Testinter tiobj= new Testinter(); is INVALID.
 * */
		
		
		Testinter tiobj = new Testingclass(); //THIS IS VALID
		tiobj.interfacemethod();
		
		
		Testingclass tcobj= new Testingclass();
		tcobj.interfacemethod();// obj reference for interface method
		tcobj.classmethod();// obj reference for class method
		
		

	}

}
