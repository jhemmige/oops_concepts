

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class HashTableConcept {

	public static void main(String[] args) {
		
		//Declaration of HashTable
		//Hashtable ht= new Hashtable();  //Capcity is 11. load factor 0.75
		
		//Hashtable ht= new Hashtable(initial capcity, fill ratio/load factor);
		
		//Hashtable has be either <Int, Int>  or <String String> or <  Int, String>
		
		Hashtable <Integer, String>ht= new Hashtable <Integer, String>();
		
		
	ht.put(101, "David");
	//ht.put(102, null); // hashtable doesnot allow null in either key or value so it throws null point exception
	ht.put(102, "Mary");
	ht.put(103, "john");
	ht.put(104, "victor");
	ht.put(105, "smith");
	
	System.out.println(ht);
	
	/*Methods:
	ht.Get(); // returns value of the Hastable
	ht. Remove() // Removes both Key and Value pair or entry
	ht. Contains() //  takes key or value as  parameter and returns boolean  */
	//ht.isEmpty() // returns boolean based on the collection being empty or not
	
	System.out.println(ht.keySet()); // they are returned as Set
	System.out.println(ht.values());// they are returned as Collection
	
	// to get individual keys and Values, we can use loop. and use get method that will get the 
	//value based on key
	
	//loop1 . This is with KeySet
	
	for (Object i: ht.keySet()) {
		
		
		System.out.println( i + ht.get(i));
	}
	
	
	//Loop 2. This is with Entryset
	
	for ( Object i : ht.entrySet()) {
		
		System.out.println( i);
	}
	
	//entry specific methods 
	
	//entryset method returns all entries present in hastable and Map.Entry is the return datatype.
	//entry is the variable
	//loop 3. This is using entry method
	
	for (Map.Entry entry :ht.entrySet()) {
		
	System.out.println(entry.getKey() +" "+ entry.getValue());
		
		
	}
	
	
	//loop 4: Using Iterator method
	
	
	Set s= ht.entrySet();
Iterator itr=	s.iterator();
	
	while (itr.hasNext()) {
		
	Map.Entry ent=	(Entry) itr.next();//(101, "David");
	
	System.out.println(ent.getKey()+ " "+ ent.getValue());
		
	}
		
	
	
	
	}

}
