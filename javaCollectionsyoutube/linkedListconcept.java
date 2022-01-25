

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedListconcept {

	public static <List> void main(String[] args) {
		
		//Declaration for heterogeneous elements
		LinkedList l = new LinkedList();
		
		//Declaration for homogeneous elements
		LinkedList <String> str= new LinkedList<String>();
		LinkedList <Integer> in= new LinkedList<Integer>();
		
		//Add new objects to linkedlist
		l.add("welcome");
		l.add(50);
		l.add('G');
		l.add(9.876);
		l.add(null);
		l.add(true);
		
		System.out.println(l);
		
		
		// Add new object with index
		l.add(4, "element");
		System.out.println(l);
		
		//Get element with index
		System.out.println(l.get(2));
		
		//add first 
		l.addFirst("super");
		System.out.println(l);
		
		//add last
		l.addLast(1000);
		System.out.println(l);
		
		
		//get the first element
		
		System.out.println(l.getFirst());
		
		//get the last element
		System.out.println(l.getLast());
		
		//remove
		
		l.remove("element");
		System.out.println("After removing element" + l);
		
		l.remove(6);
		System.out.println("After removing 6th index"+ l);
		
		l.set(6, 500.5);
		System.out.println("After setting new element at 6th position"+ l);
		
		//there are other methods like Contains, Is empty 
		
	//	l.contains(o)throws boolean
		
		//l.isEmpty(); throws boolean
		
		
		
		//Loops:
		
		
	/*for 	(int i=0; i<l.size(); i++) {
		
		
		System.out.println (l.get(i));
	}*/
		
		
		//for ...each
	for ( Object e: l)	{
		
		System.out.println (e);
		
	}
	// has next 
	Iterator it= l.iterator();
	
while(	it.hasNext()) {
	
System.out.println(it.next());
	
}

LinkedList j = new LinkedList();

j.add("M");
j.add("N");
j.add("O");
j.add("P");
j.add("A");
j.add("B");
j.add("Z");


LinkedList k= new LinkedList();

k.addAll(j);

System.out.println(k);

k.removeAll(j);

System.out.println(k.isEmpty());

Collections.sort(j);
System.out.println(j);

Collections.shuffle(j);
System.out.println(j);	

Collections.reverse(j);
System.out.println(j);	

Collections.sort(j,Collections.reverseOrder());
System.out.println(j);	




		
		

	}

}
