package OOPS_concepts_youtube_7;


public class Java_Control_Statements_NestediFELSE {
	//helps in code line reduction
	
	public void switchcase() {
		
	/* switch (expression)
	 * {
	 * case <condition1>: Statements; break;
	 * case <condition2>: Statements; break;
	 * case <condition3>: Statements; break;
	 * ----
	 * ---
	 * default:statements;
	 * }
	 * 
	 * */	
		
		int day=5;
		
		
		switch(day) {
		
		case 1: System.out.println("day is sunday"); break;
		
		case 2: System.out.println("day is monday"); break;

		case 3: System.out.println("day is tuesday");  break;
		
		case 4: System.out.println("day is wednesday"); break;
		
		case 5: System.out.println("day is thursday"); break;
		
		case 6: System.out.println("day is friday"); break;
		
		default : System.out.println("day is saturday"); 
		
		
		}
		
		
	}
	
	//	Vs
	public static void main(String[] args) {
		
		Java_Control_Statements_NestediFELSE  nif= new Java_Control_Statements_NestediFELSE ();
		nif.switchcase();
		
		
		int day = 6;

		if (day==1) {
			
			System.out.println("today is a sunday");
			
		}
		else if (day==2) {
			
			System.out.println("today is a monday");
			
		}
else if (day==3) {
			
			System.out.println("today is a tuesday");
			
		}
		
else if (day==4) {
	
	System.out.println("today is a wednesday");
	
}
else if (day==5) {
	
	System.out.println("today is a thursday");
	
}
else if (day==6) {
	
	System.out.println("today is a friday");
	
}	
		
else {
	
	
		
		System.out.println("today is a saturday");
		
	}
}
		
	}


