

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraylistConcept2 {
	
	

	public static void main(String[] args) {
		
	// Addall adds the elements of one collection to another collection.	
		ArrayList <String> al = new ArrayList <String>();
		
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("m");
		
		
	ArrayList al_dup= new ArrayList(); // this is a new collection.
	
	al_dup.add("t");
	al_dup.add("o");
	al_dup.add("p");
	
		
	al_dup.addAll(al); // addALL adds al to al_dup
	System.out.println(al_dup)	;
	
	
	al_dup.removeAll(al);
	System.out.println(al_dup); // removes the elements from al and just retains its own collections.
	
	ArrayList al_dup1= new ArrayList(); 
	al_dup1.addAll(al);
	System.out.println(al_dup1);
	al_dup1.removeAll(al);
	System.out.println(al_dup1.isEmpty());
	
	//To sort, we have a method in the parent interface that we use . Arraylist doesnot have methods by itself 
	
 Collections.sort(al);
 System.out.println(al);
 
 Collections.reverse(al);
 System.out.println(al);
 
 Collections.reverse(al_dup);
 System.out.println(al_dup);
 
 
 Collections.shuffle(al);
 System.out.println(al);
 
 //converting to  array to arraylist
 
 //First Method
 String[] arr= {"dog", "cat", "elephant"};
 
 List<String> a = Arrays.asList(arr);
 
 System.out.println(a);
 
 
 
 String[] arr1= {"car", "lorry", "bus", "auto", "plane"};
 
 ArrayList ar= new ArrayList(Arrays.asList(arr1));
System.out.println(ar);



 
 
	}

}
