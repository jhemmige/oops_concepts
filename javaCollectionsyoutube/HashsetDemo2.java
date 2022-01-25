

import java.util.HashSet;

public class HashsetDemo2 {

	public static void main(String[] args) {
	
		HashSet < Integer> Set1 = new HashSet< Integer>();
		
		Set1.add(1);
		Set1.add(2);
		Set1.add(3);
		Set1.add(4);
		Set1.add(5);
		
		System.out.println( "Hashset Set1 :"+  Set1);
		
		HashSet < Integer> Set2 = new HashSet< Integer>();	
		Set2.add(3);
		Set2.add(4);
		Set2.add(5);
		System.out.println( "Hashset Set2 :"+  Set2);
		
		//Removal  or difference between set1 and set2
		
		Set1.removeAll(Set2);
		System.out.println("After removing collection :"+Set1);
		
		//union
		Set1.addAll(Set2);
		System.out.println("Union"+ Set1);
		
		//Intersection
		Set1.retainAll(Set2);
		System.out.println("intersection"+ Set1);
		
		
		Set2.retainAll(Set1);
		System.out.println(Set2);
		
		//whatever elements we see in set2 is also seen in set1. Return boolean subset of Set1
		System.out.println( Set1.containsAll(Set2));

	}

}
