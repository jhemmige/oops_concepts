
public class All_about_Constructors {
	
	int a;
	int b;
	
	All_about_Constructors(){ // default constructor
		
		a=10;
		b=20;
		
		System.out.println(a+b);
		
		
		
	}
	
	All_about_Constructors(int x, int y){ //parameterized constructor
		
		a=x;
		b=y;
		
		
	}
	
	public void display() {
		
		
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		

		All_about_Constructors abc= new All_about_Constructors();
		
		All_about_Constructors abc1 = new All_about_Constructors (100, 200);
		
		abc1.display();
		
		
		
	}

}
