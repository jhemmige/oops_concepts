

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		
		
		HashSet hs = new HashSet(); // Default is 16 Load factor 0.75
		
		//HashSet hs = new HashSet(100); // we can increase the memory location by setting 100 as parameter.
		
		/*if we have to increase the load factor, we can increase the default load factor from 0.75 to 0.90*/
		
		//HashSet hs = new HashSet(100,  (float) 0.90);
		
		//HashSet< String> hs = new HashSet <String>();
		//HashSet< Integer> hs = new HashSet <Integer>();
		
		
		//Adding element. Insertion order not preserved. 
		hs.add('M');
		hs.add('A');
		hs.add(100);
		hs.add(null);
		hs.add(true);
		hs.add("hashset");
		hs.add(16.4);
		
		System.out.println(hs);
		
		hs.remove('A');
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		System.out.println(hs.contains(16.4));
		System.out.println(	hs.isEmpty());	
		
	/*	since index is not present in hashset, we cannot use  index value to get an element or 
	 * remove an element or  set an element
	 * Also with for loop, its not possible to print elements in the set. 
	 * */
		
		
	/*for (int i=0; i<hs.size();i++) {
		
		
		System.out.println(hs +" "+i );
	}
		
	/*loop above will give out the following result
	 * [null, 100, 16.4, hashset, M, true] 0
[null, 100, 16.4, hashset, M, true] 1
[null, 100, 16.4, hashset, M, true] 2
[null, 100, 16.4, hashset, M, true] 3
[null, 100, 16.4, hashset, M, true] 4
[null, 100, 16.4, hashset, M, true] 5
	
	 * */
	
		
	//hence we use for each and iterator loop
		
	/*	for (Object o:hs) {
			
			
			System.out.println(o);
		}*/
		
		
	/*	Iterator it = hs.iterator();
		
		while (it.hasNext()) {
		
		System.out.println	("This is " + it.next());*/
		
		
		HashSet < Integer> HM= new HashSet < Integer>();
		
		HM.add(10);
		HM.add(1);
		HM.add(5);
		HM.add(3);
		HM.add(7);
		
		System.out.println(HM);
		
		
		
		HashSet < Integer> numbers= new HashSet < Integer>();
		
		numbers.addAll(HM);
		numbers.add(10);// duplicate is ommitted automatically. HM already has a 10.
		numbers.add(11);
		numbers.add(7);
		 
		
		System.out.println("After adding to numbers " + numbers);
		
		numbers.removeAll(HM);
		System.out.println("After removing numbers  from :" + numbers);
		
		
		HM.retainAll(numbers);
		
		System.out.println("numbers common between HM and Numbers" + numbers);
		
		
		
		}
		
		
	
	

}
