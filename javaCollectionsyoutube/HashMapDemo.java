

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//HashMap HM= new HashMap(); //used for heterogeneous data. 
		
		HashMap < Integer, String> HM= new HashMap<Integer, String>(); //this stores homogeneuous data
		
		
HM.put(100, "Victor");		
HM.put(101, "David");
HM.put(102, "John");
HM.put(103, "Rick");
HM.put(104, "Scot");
HM.put(105, "Mary");
HM.put(101, "Kathy");//we have added a duplicate here. Old value replaced with new value.{101=Kathy, 102=John, 103=Rick, 104=Scot, 105=Mary} 
HM.put(106, "John"); // here we see value can be duplicated. 2 johns printed //{100=Victor, 101=Kathy, 102=John, 103=Rick, 104=Scot, 105=Mary, 106=John}

System.out.println( "Results for HM" + HM);



System.out.println("Results for HM with Object i" + HM.get(101));

System.out.println(HM.remove(100));//removes victor
System.out.println(HM);//{101=Kathy, 102=John, 103=Rick, 104=Scot, 105=Mary, 106=John}

System.out.println(HM.containsKey(106)); // returns boolean true.
System.out.println(HM.containsKey(109));// returns boolean false
System.out.println(HM.containsValue("John")); // returns boolean true.

System.out.println(HM.isEmpty());
System.out.println(HM.size());

System.out.println(HM.keySet());// will return all keys as SET  - No duplicates printed.[101, 102, 103, 104, 105, 106]
System.out.println(HM.values());// will return all values as Collection - [Kathy, John, Rick, Scot, Mary, John]

System.out.println(HM.entrySet());// will return all entries as  set [101=Kathy, 102=John, 103=Rick, 104=Scot, 105=Mary, 106=John]

//LOOP1 that brings values of all keys

/* error is  thrown here because by default , HMap considers the elements to be 
/*	defined as Object even though they are strings. Once they are defined as Integer or String, error goes off.*/


/*for (Object i:HM.keySet())  

 {
	
	System.out.println(i);
	
}*/

//LOOP2 that brings elements from  values column

/*for ( Object str: HM.values()) {
	
	System.out.println(str);
}*/


//LOOP 3 that brings both Keys and Values as set . 
  
/*for (Object o: HM.entrySet()) {
	
	System.out.println("entryset"+ o);

}*/

//LOOP 4 that brings both Keys and Values independently 

// we can get Key set and values using this loop
 
 
/*for ( Object obj: HM.keySet()) {
	
System.out.println(obj + " "+ HM.get(obj));
	
}*/


// LOOP 5 -Methods related only to entry where we extract individual element 
//like KEY and Value individually and not as KEY -VALUE pair.
//LOOP 4 & 5 both give out same results. In loop 4, we use HashMap method . In loop 5, we use
//entry method
//Returns as follows
/*101 Kathy
102 John
103 Rick
104 Scot
105 Mary
106 John*/

//Map.entry is the datatype for HashMap Entry
for (Map.Entry entry: HM.entrySet()) // this needs the elements to be specified as Integer or String


{
	
	System.out.println(("Hello" + ""+ entry.getKey() + " " + entry.getValue()));
	
}


//LOOP 6 Iterator 

//entry is the variable representing all entries in the collection.
Set entry = HM.entrySet(); // Entry set is stored as Set.
Iterator it=	entry.iterator();
while ( it.hasNext()) {		
 Map.Entry ent= (Entry) it.next(); //if we want to store an entry in a variable, we use Map.Entry
 System.out.println(ent.getKey() + " "  + ent.getValue());	
}
	
	
}

}




	


