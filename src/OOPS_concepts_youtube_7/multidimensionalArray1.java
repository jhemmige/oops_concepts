package OOPS_concepts_youtube_7;

public class multidimensionalArray1 {

	public static void main(String[] args) {
	
		Object a[][] = new Object [5][2];
		
		a[0][0]= "great";
		a[0][1]= 100;
		a[1][0]= 'C';
		a[1][1]= 20.5;
		a[2][0]= true;
		a[2][1]= false;
		a[3][0]= 55.7;
		a[3][1]= 80;
		a[4][0]= 'G';
		a[4][1]= "Hey";
		
	System.out.println(" *************This is classic for loop***********");
		
		for (int i=0; i<a[0].length;i++) {
			
			for( int j =0; j<=a[0].length; j++) {
				
				System.out.println(a[i][j]);
	

	/*System.out.println(" *************This is advanced for loop OR for each loop***********");	
		
	
	
	for( Object i[]:a) {
		
		
		for (Object j:i) {
			
			System.out.println(j);
			
	
			}
					
		System.out.println();			*/
			
		}
		

	}

}
	
}
