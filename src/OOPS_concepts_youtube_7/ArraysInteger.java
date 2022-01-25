//Arrays are collection of values of same datatype

package OOPS_concepts_youtube_7;

public class ArraysInteger {

	public static void main(String[] args) {
		
		
		int arr[] = new int[5];
		
		arr[0]=5;
		arr[1]=15;
		arr[2]=25;
		arr[3]=35;
		arr[4]=45;
		
		
	//System.out.println(arr.length);
	//System.out.println( arr[4]);
	
/*	for (int i=0;  i< arr.length;  i++) {
		
		
		
	//int j=	arr[i];
	
	System.out.println( i +" index"+ arr[i]);
	
		
	} */
	
	//for each loop - advanced for loop
	
for ( int i:arr) {
		
		System.out.println( i);
		
	}
		

	}
	
}


