package OOPS_concepts_youtube_7;


public class ReverseConcept {

	public static void main(String[] args) {
	
	
		//METHOD 1
	String Str= "Jayashree";
	int len=	Str.length();//9
	
	//Str.charAt(index) this method brings out the character at each index.
	
	//Printing forward 
	
	for (int i =0; i<len;i++){
		
		//System.out.println(Str.charAt(i));	
	}
	
	//printing reverse 
	//basically we take the length of the Str
	for (int i=len-1; i>=0; i--) //8 9 7 6 5 6 5 4 3 2 1 0
	{
		
		System.out.println(Str.charAt(i)); // e e r h s a y a J
		
	}
	
	//METHOD 2
	//String Buffer is a method which takes Str as a parameter for reversing.
	StringBuffer RS= new StringBuffer(Str);
	System.out.println(RS.reverse());
	
	
	
	//METHOD 3 - Using character Array.
	
	char C[] = Str.toCharArray();
	int len1= Str.length();
	
	for (int i= len1-1;i>=0; i--) {
		
		System.out.print(C[i]);
		
		
		
		
		
		for (int k=Str.length()-1;k>0;k--) {
			
			
			System.out.println(Str.charAt(k));
		}
		
		
	}
	

	}

}
