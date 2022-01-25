

//PRIVATE CANNOT BE ACCESSED OUTSIDE OF THE CLASS
 class A1 {
	
private int a = 1;
	
 private void method1() {
		
		System.out.println( "this is from method1");
	}
	
	
}

//WHEN NO ACCESS MODIFIER PRESENT, ITS CONSIDERED DEFAULT
 class Defaultclass{
	
	int b=20;
	
	void methoddefault() {
		
		System.out.println( "this is from default");
		
	}
	
}


public class accessmodifiers  {
	
private  int c= 50;// private variable 

public String s= "welcome"; // public variable 

int d= 35; //this is a default variable 


public void pubclass() {
	System.out.println("testing testing");
	
}

	public static void main(String[] args) {
	
		A obj= new A();
		
	//System.out.println(obj.a);//a private method cannot be accessed outside of the class.

	accessmodifiers amobj=  new accessmodifiers();
	
	System.out.println(amobj.c);	
	
	Defaultclass bobj= new Defaultclass();
	
	bobj.methoddefault();
	

	}

}
