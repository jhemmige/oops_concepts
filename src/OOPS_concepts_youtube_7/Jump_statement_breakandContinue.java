package OOPS_concepts_youtube_7;


public class Jump_statement_breakandContinue {
	
//	in break, as soon as the condition is met, the code comes out of the loop.
	public void breakloop() {
		
	for (int i=0; i<=10;i++) {
			
			if (i==5) {
				
				//System.out.println(i);
				
				break;
				
			}
			
			//System.out.println(i);
		}
		
		
	}
	
	// In continue, when i==5,  it starts printing 1 to 4 then it skips the number 5 
	//becase i==5, and then continues printing from 6 to 10.
	
	public void continueloop() {
		
		for (int i=0; i<=10; i++) {
			
			if (i==5) {
				
				
				continue;
			}
			
			//System.out.println(i);
			
		}
		
		
	}
	
	public void oddnumbercontinue() {
		
		for (int i=0; i<=10; i++) {
			
			
			if (i==3|| i==5 || i==7 ) {
				
				
				continue;
				
			}
			
			
			System.out.println( "odd number continue" + i);
			
		}
		
		
		
	}

	public static void main(String[] args) {
		
		Jump_statement_breakandContinue bc= new Jump_statement_breakandContinue();
		
		bc.breakloop();
		bc.continueloop();
		bc.oddnumbercontinue();
	

	}
	
	
	

}
