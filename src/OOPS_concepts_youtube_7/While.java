package OOPS_concepts_youtube_7;



/* while (condition) {
 * 
 * 
 *code 
 *  }
 *  
 *  */

public class While {
	
	//increment is a must else loop goes infinite.
	
	public void getevennumber() {
		
		int i=0;
		
		while( i<=50) {
			
		//	System.out.println(i);
			
			i+=2;
			
			
		}
		
		
		
	}
	
	public void getOddnumber() {
		
	int i=0;
		
		while( i<=50) {
			
			//System.out.println(i);
			
			i+=3;
			
			
		}
		
	}
	public void multipleof5() {
		
		int i=5;
		
		while (i<=50) {
			
		System.out.println(i);
			
			i+=5; // we have to increment by 5
			
			//i+=5;
			
			
		}
	
		
	}
	

	public static void main(String[] args) {
		
		While dw= new While();
		dw.getevennumber();
		dw.getOddnumber();
		dw.multipleof5();
		
		int i=1;

		
		while (i<=30) {
		
			//System.out.println(i);
			
		i ++;
			
		
			
		}
		
			//System.out.println("No," + i + " not less than 30");
			
		}
	}


