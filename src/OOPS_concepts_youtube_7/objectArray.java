
package OOPS_concepts_youtube_7;

public class objectArray {

	public static void main(String[] args) {
		
		Object o[] = new Object[5];
		
		o[0]= "hello";
		o[1]= 100 ;
		o[2]= 'G';
		o[3]= 50.6;
		o[4]= true;
		
		
		//Object o[]= {"hello", 'G', 40.21, false, 100}; // object can be declared like this also
		
		for (Object i:o) {
			
			System.out.println(i);
			
		}
		

	}

}
