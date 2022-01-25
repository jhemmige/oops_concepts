package OOPS_concepts_youtube_7;
//Conditional Statement - if a certain condition is met, it'll execute one block of code else a different block of code


public class Java_Control_Statements_IfElseloop {
	
	//FINDING EVEN OR ODD
	public void evenorOdd() {
		
		int a=21;
		
		//int a= 18;
		
		
		if (a%2==0) {
			
		System.out.println(	"This number is even ");
				
		}
		
		else {
			
			System.out.println(	"This number is odd ");
			
		}
		
		
	}

	public static void main(String[] args) {
		
		Java_Control_Statements_IfElseloop eor= new Java_Control_Statements_IfElseloop();
		
		eor.evenorOdd();
		
		
		
		int age=15;
		
		if (age>=18) {
			
			System.out.println("hey you are eligible to vote");
			
			
		}
		else  if (age <16){
		// only one statement for else, brackets are optional	
			System.out.println("you can still vote");
		}

		else {
			
			System.out.println("sorry you cannot vote!");
		}
		
	}

}
