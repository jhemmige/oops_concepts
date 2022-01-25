package OOPS_concepts_youtube_7;


public class StringMethods {

	public static void main(String[] args) {
		String s= "Welcome";
		String t= "to";
		String u="     my channel     ";
		String s1= "to";
		String s2="TO";
		
System.out.println(s.length());

// 5 ways to concatinate
System.out.println(s.concat(" "+ t  +" "+ u));

System.out.println( s+ t + u );

System.out.println("Welcome" +"to" +  "my channel");

System.out.println("Welcome" .concat("to" ).concat("my channel"));

System.out.println(s .concat(t ).concat(u));

//Equals
System.out.println(t.equals(s1)); //boolean  returns true or false. Compares 2 strings.
System.out.println(s.equals(s1));

//checks equals but ignores the case sensitivity.
System.out.println(s1.equalsIgnoreCase(s2));

//Contains - checks if the string contains certain characters
System.out.println(s.contains("ABC"));

//Substring

System.out.println("substring" + s.substring(0,5));
System.out.println(s.substring(3));

//Replace
System.out.println(s.replace('W', 'D' ));
System.out.println(s.replace("Wel", "Dal" ));

//removes spaces preceeding and succeeding spaces
//String u="     my channel     ";
System.out.println("trimming " + u.trim()); // trimmingmy channel

//returns char at a certain index
System.out.println(s.charAt(4)); //o

//Converts to lowercase
System.out.println(s.toLowerCase()); //welcome

//Converts to lowercase
System.out.println(s.toUpperCase());//WELCOME
	}

}
