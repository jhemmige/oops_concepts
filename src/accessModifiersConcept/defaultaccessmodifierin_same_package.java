package accessModifiersConcept;



//default variables, methods can be accessed with in same package

public class defaultaccessmodifierin_same_package {
	
	protected  String name="Jayashree"; // can be accessed with in the class 
	
	protected  void methodinaccessmodifier() { // can be accessed with in the class
		
		System.out.println(name );
		
	}
	
	

	public static void main(String[] args) {
	
	//Defaultclass bobj= new Defaultclass();
	//System.out.println(bobj.b);
	//bobj.methoddefault();
	
	
	defaultaccessmodifierin_same_package dam= new defaultaccessmodifierin_same_package();
	dam.methodinaccessmodifier();
	
	
	}

}




