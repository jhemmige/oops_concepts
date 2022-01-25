package OOPS_concepts_youtube_7;

public class Arrayexample2 {

	/*whenever we are working with array, we mostly use for loops */
	
	/** Classic for loop */
	
	public static void main(String[] args) {
		
		int a[]= {100, 200,300, 400,500,600};
		 // we can add any number of values here.
		//this type of array declaration is useful when we dont have enough information about # of memory location needed as in the previous way to declarion.
		
		int sum=0; //initially the value assigned to sum is 0. once a[i] ( which is 100) is added to 0, sum=100
		
		for( int i=0; i<a.length;i++) {
			
			System.out.println(i +" "+ a[i]);
			
			sum= sum +a[i]; // 100, 300, 600, 1000, 1500
			
			
		}
		
		System.out.println(sum);
		
		/** enhanced for loop */
		for (int i:a ) {
			
			System.out.println(i);
		}
		
		
	}
	

	


}

