package OOPS_concepts_youtube_7;


public class Loopdowhile {
	
/*In do while loop, code gets executed even if the condition is false. it'll first enter the loop and execute atleast
 * one time before finding the condition to be false and then it realizes the condition to be false and then exit the loop */
	
	public void doWhileorintodd() {
		
		int i=0;
		
		
		do {
			
			System.out.println(i);
			
			i+=3;
			
		} while (i<=10);
		
		
		
		
	}	
	
	
	
	public void doWhile() {
		int i=20;
		
		
		do {
			
			System.out.println(i);
			
			i++;
			
		} while (i<=10);
		
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		Loopdowhile low= new Loopdowhile();
		low.doWhile();
		low.doWhileorintodd();
		
		int i=20;
		
		do {
			
			System.out.println(i);
			i+=20;
			
		} while (i<=100);

	}

}
