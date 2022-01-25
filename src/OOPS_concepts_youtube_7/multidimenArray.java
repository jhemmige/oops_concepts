package OOPS_concepts_youtube_7;

public class multidimenArray {

	public static void main(String[] args) {
		
		int a[][] = new int[3][2];
		
		a[0][0]= 10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		
	System.out.println(a.length); // gives the numbr of rows
	System.out.println(a[0].length);//gives the number of columns
	//System.out.println(	a.length);
		
	//Classic for loop	
		for (int i=0; i <a.length; i++) { // outloop increments rows
			
			for (int j=0;j<a[i].length;j++) {// innerforloop increments columns. It'll finish incrementing the inner loop until it finishes its entire length
				
				System.out.println("classic for loop " + a[i][j] +" ");
				
				
			} 
		
			 System.out.println(); //this will give space after each row 
	}
		
	 for (int i1[]:a) { // outerforloop 
			 
			 for (int j:i1) {//innerfor loop
				 
				 System.out.println("enhanced for loop " + j);
				 
			 }
		
			
			 System.out.println();
		
		}

}
	
}
