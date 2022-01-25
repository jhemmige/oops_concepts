package OOPS_concepts_youtube_7;

public class ArraysString {

	public static void main(String[] args) {
		
		
		String str[]=  new String [5];
		
		 str[0] = "welcome";
		 str[1] = "to";
		 str[2] = "my";
		 str[3] = "channel";
		 str[4] = "great";

		 
		System.out.println( str.length);
//here we are trying to get the characters of "great"		
		String s= ( str[4]);
		
	for (int j=0; j<s.length();j++) {
		
		System.out.println(j + "and" +s.charAt(j));
		
	}
		
	/*	for( int i=0;i<str.length; i++) {
			System.out.println( str[i]);
		}
		
		for (String i: str) {
			
			System.out.println( i);
		}*/
		
		
	}

}
