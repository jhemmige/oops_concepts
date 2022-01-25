

import java.util.stream.IntStream;

public class NewDemo1 {

	public static void main(String[] args) {
   CarGetterSetter Benz=new CarGetterSetter();{
			
			Benz.setColor("Royal Metallic Blue");
			
			System.out.println(Benz.getColor());
			
			
			Benz.setYear(1800);
			System.out.println(Benz.getYear());
			
			
			System.out.println(Benz.getModel()); //When we run this block, this method returns null 'cos we haven't set any variable to it.
		
            NewDemo1 cb=new NewDemo1();
			cb.GetData();
			
			
			
			
			
	}

}


public void GetData()
{
	System.out.println("Let's see if this code prints");
	
	String a= "Hemmige life/ in a fast lane";
	String ab=new String ("           hemmiged       ");
	System.out.println(a);
	System.out.println(ab);
	
	//Gets the char at 6th index
	char c= a.charAt(6);
	System.out.println(c);
	
	//Not sure what it does, just tried this
	IntStream d= a.chars();
	System.out.println(d);
	
	//Gets the Index of g in Hemmige
	int index= a.indexOf("g");
	System.out.println(index);
	
	int index1=a.indexOf("d");
	System.out.println(index1);
	
	//Gets the lenth ( the number of characters) of the string hemmige
	int len=a.length();
	System.out.println(len);
	
	//fetches the characters present between the index given
	
	String int1=a.substring(8, 27);
	System.out.println(int1);
	//fetches the characters present after the index given
	
	String int2=a.substring(6);
	System.out.println(int2);
	
	//fetches the characters present between the index given- Similar to SubString
	
	CharSequence int3=a.subSequence(8, 27);
	System.out.println(int3);
	
	
	//Joins 2 strings 
	System.out.println(a.concat(ab));
	
	//Trims any space present before n after string
	System.out.println(ab.trim());
	
	//Converts to UpperCase or lowecase
	
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	
	
	//When we use Split, it basically splits the string word or sentence. So each part is stored into an array and can be returned as below.
	//Hemmige life
	 //in a fast lane
	
	//When the sentence is split, if no more splits, it throws below exception
//	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
//	at oopsconcepts.NewDemo1.GetData(NewDemo1.java:95)
//	at oopsconcepts.NewDemo1.main(NewDemo1.java:22)
	 String array[]=a.split("a"); // OR String array[]=a.split("/")
	 System.out.println(array[0]);
	 System.out.println(array[1]);
	 System.out.println(array[2]);
	 System.out.println(array[3]);
	 
	 
	
	
	
	
	
}
}