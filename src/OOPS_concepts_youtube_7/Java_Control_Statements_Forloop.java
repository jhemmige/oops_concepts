package OOPS_concepts_youtube_7;
//iterative loop statement. When the same things needs to be executed multiple times, we use loop

public class Java_Control_Statements_Forloop {
	
	
	//REversing a string using stringbuffer concept
	public void reversestring() {
		
		String j="jayashree";
		j.length();
		
		StringBuffer SB= new StringBuffer(j);
		
	System.out.println(SB.reverse());
		
		
		
		
	}
	
	//printing number less than 10
	
	public void descendorderloop() {
		
		 int a= 1;
		 
	for 	( int i=10; i>=0;i--){
			 
		System.out.println(i); 
		System.out.println("loop exit");
			 
		 }
	
	}
	
//printing numbers less than 30	
	public void descendorderloop1() {
		
		
		 int a= 1;
		 
		 
		 for( int i=30;  i>=a; i-=2) {
			 
			 System.out.println(i);
			 
		 }
	}
	

	//printing number inan incremental fashion
	public static void main(String[] args) {
		
		
		
		Java_Control_Statements_Forloop fl = new Java_Control_Statements_Forloop();
		fl.descendorderloop();
		fl.descendorderloop1();
		fl.reversestring();
// in "for loop", we can use initialization part, condition part and increment part all in a single line.	
		
		/* in For loop, only the first time, the initialization part is checked for, from next time onwards, condition part and 
		 * increment part is checked */
		
	int a=300;
		
		for (int i=0; i <a ; i+=2 ) {
			
			
			System.out.println(i);
		}
	

	}

}
