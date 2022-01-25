package accessModifiersConcept;
//private is access only with in the class

class A {
	
	private int a=10;
	
	private void methodm1() {
		
	}	
	
}


class B{
	
 String s="school";
 
 void method_default() {
	 
	 
	 System.out.println(s);
 }
	
}

class C{
	
	
	
	
	
}





public class PrivateAccessModifier {

	public static void main(String[] args) {
		
		
		A aobj = new A();
		// aobj. private methods can be access only with in same class
		B bobj= new B();
		bobj.method_default(); // can be access in different class of the same package

	}

}
