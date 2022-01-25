package inheritenceconcept;

class parent1{
	
	String color= "White";
	
	
	
	public void printing() {
		
		System.out.println(color);
		
		
	}
	
	
	public void eating() {
		
		
		System.out.println("eating");
		
	}
	
	parent1(){
		
		
		System.out.print("This is from parent1construtor");
		
	}
	
}


class parent2 extends parent1 {
	
	
	String color= "Black";
	
	
public void printing() {
		
	
		System.out.println(color);
		System.out.println(super.color);
		
	}

public void eating() {
	
	super.eating();
	System.out.println("eating bread");
	
}

parent2(){
	
	
	super(); // this is how superkeyword used in constructor
	
	/**If I comment out below command only parent1 constructor is run */
	//System.out.println("this is from parent2 constructor");
	
	
	
}
	
	
}





public class SuperKeyword {

	public static void main(String[] args) {
		//3.Used to involve immediate parent class constructor
		
		parent2 p2= new parent2(); //since contstructor invokation starts when the obj is created, this will print both"This is from parent1construtor""this is from parent2 constructor"
		
		//1.Used to refer immediate parent class instance variable
		
		p2.printing(); /* when printing command is placed before p2.color, black is printed as output. 
		however when printing command is placed below p2.color, magenta gets printed. 
		Recent assignment of color is displayed*/
		
		//2.Used to invoke immediate parent class methods
		
		p2.eating(); /*  prints eating bread since its the latest assignment before adding the super keyword to eating method*/
		p2.color="magenta";
		//p2.printing(); this command is added here just to show magenta is output
		
		
		

	}

}
