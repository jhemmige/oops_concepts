

import java.util.PriorityQueue;

public class queueConcept {

	public static void main(String[] args) {
		
		
	PriorityQueue pq= new PriorityQueue(); // only homogeneous elements allowed. else it throws exception
	
	//ADD method
	pq.add(500);
	pq.add(100);
	pq.add(150);
	pq.add(200);
	pq.add(100);
	pq.offer(50);
	
	System.out.println(pq); // returns [50, 100, 100, 500, 200, 150]
	
	// Element method and Peek method
	
	
	 // Element method gets the element present in head position.
	/*if queue is empty, it throws 
	 * java.util.NoSuchElementException
	 */
	System.out.println(pq.element()); //gets 50
	
	 // Peek method gets the element present in head position.
	/*if queue is empty, it throws  null*/
	System.out.println(pq.peek());  // gets 50
	
	//Remove method  - Returns the element present in head position and removes it 
	/*if queue is empty, it throws 
	 * java.util.NoSuchElementException*/
	System.out.println(pq.remove()); // returns 50 
	System.out.println(pq); // [100, 150, 100, 500, 200]
	
	//Poll method  - Returns the element present in head position and removes it 
	/*if queue is empty, it throws  null*/
	System.out.println(pq.poll());// returns 50 
	System.out.println(pq);// [100, 150, 100, 500, 200]
	
	PriorityQueue pque= new PriorityQueue();
	
	//Poll method  - Returns the element present in head position and removes it 
		/*if queue is empty, it throws  null*/
		System.out.println(pque.poll());// 
		System.out.println(pque);// 
		
		//Remove method  - Returns the element present in head position and removes it 
		/*if queue is empty, it throws 
		 * java.util.NoSuchElementException*/
		System.out.println(pque.remove());  
		System.out.println(pque); 
		
		// Peek method gets the element present in head position.
		/*if queue is empty, it throws  null*/
		System.out.println(pque.peek());  
		
		// Element method gets the element present in head position.
		/*if queue is empty, it throws 
		 * java.util.NoSuchElementException
		 */
		System.out.println(pque.element());
	
	

	}

}
