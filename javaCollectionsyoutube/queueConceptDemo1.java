

import java.util.Iterator;
import java.util.PriorityQueue;

public class queueConceptDemo1 {

	public static void main(String[] args) {
		
		PriorityQueue pq= new PriorityQueue();
		pq.add("Addition");
		pq.add("Subtraction");
		pq.add("Multiplication");
		pq.add("Division");
		pq.add("factorial");
		pq.offer("factorial");
		
		System.out.println(pq);
		
		
		for (Object o: pq) {
			
			System.out.println(o);
			
		}
		
		Iterator it = pq.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
// same methods available for LinkedList as well in addition to the methods implemented from LIST interface
		

	}

}
