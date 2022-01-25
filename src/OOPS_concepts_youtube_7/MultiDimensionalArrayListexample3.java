package OOPS_concepts_youtube_7;

public class MultiDimensionalArrayListexample3 {

	public static void main(String[] args) {
		
		Object a[][]= {{"great", 900, 'C', false}, {500, "her", 50.125, true}, {true, 60.8, false, 0.05}};
		
	
		//classic method 
		
		for (int r=0; r< a.length; r++) {
			
			for (int c=0; c< a[r].length;c++) {
				
				System.out.println(a[r][c]);
				
			}
		}
		
		for ( int row=0; row <a.length ; row++) {
			
			for (int col=0; col <a[row].length; col++) {
				
				System.out.println(a[row][col]);
				
		
		/*for (Object i[]:a) {
			
			for (Object j:i) {
				
				
				System.out.println(j);*/
				
		
				
			}
			
			
			
		}
		
		

	
	}
}
