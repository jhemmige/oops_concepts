

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistConcept {
	
	public void arraylistintegertype() {
		
		ArrayList< Integer> al1= new ArrayList<Integer>(); //Declaring an arraylist to hold same datatype 
		
	}
	
	public void arraylistStringtype() {
		
		ArrayList <String > al2 = new ArrayList<String>(); //Declaring an arraylist to hold same datatype 	
		
	}
	

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(); //import Java.util package for it. This declaration can store any dataype.
		ArrayList< Integer> al1= new ArrayList<Integer>(); //Declaring an arraylist to hold same datatype 
		ArrayList <String > al2 = new ArrayList<String>(); //Declaring an arraylist to hold same datatype 
		
		List al3= new ArrayList(); // this is also correct since list is the parent interface for child ArrayList interface.

		//since al can store any datatype
		
		
		
		al.add("yolo");
		al.add(100);
		al.add(100.8);
		al.add(true);
		al.add('G');
		System.out.println(al);
		
		//System.out.println(	al.size()); //show how many values al holds.
		
		al.remove("yolo"); // you can remove an object directly
		System.out.println(al); 
		
		al.remove(3); // you can remove as index 
		System.out.println(al); 
		
		al.add("welcome on a holiday");
		System.out.println(al); 
		
		al.add(0, "added a new element");
		System.out.println(al); 
		
		//retrieves a specific element
		System.out.println(al.get(0)); //0 is the index of element or object
		
		
		// setting a new element or replacing an element with a new one.
		al.set(0, 75.987); //uses index and replace object
		System.out.println("after replacing :" + al);  
		
		//searches and confirm if a particular object is present or not in Boolean
		System.out.println(	al.contains("welcome on a holiday"));
		System.out.println(	al.contains(1000));
		
		//IS empty
		
		System.out.println(al.isEmpty()); //currently will return false since it has elements.
		System.out.println(al1.isEmpty());
		
		
		//for reading the data  in arraylist , we can use for loop, for each and iterator 
		
		//for loop
		System.out.println("reading elements using for loop");
		
	/*	for (int i=0; i<al.size(); i++) {
			
			System.out.println(i +" "+ al.get(i));*/
			
			
			
		
			//For ...Each
		System.out.println("reading elements using for...each loop");
		
		int i=0;
		for (Object o:al ) {
			
			System.out.println( i +" "+o );
			i++;
			
		}
		
		//Iterator method
		
		System.out.println("reading elements using iterator method");
		
		Iterator it = al.iterator(); //it iterates through al
		int j=0;
		while (it.hasNext()) {
			
		System.out.println(it.next() + " " + j);
			j++;
		}
		
		}
	
	} 
	



