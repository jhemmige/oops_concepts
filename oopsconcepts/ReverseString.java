
public class ReverseString {

	public static void main(String[] args) {
		
		
		//Method 1 by using String Buffer
		String J=("Jayashree hem");
		String t=("");
		StringBuffer ReverseString= new StringBuffer("Jayashree this is not fair");
		//System.out.println(ReverseString.reverse());
		
	
		
		//System.out.println(J.substring(1));
		
		
		int m=J.length();
		
		//System.out.println(J.length());
		
	
		
		//This prints Jayashree with letters at each index.
		for (int r=0; r<m;r++)
			
	{
			System.out.println(J.charAt(r)+" and "+ r);
	}

		//This prints Jayashree with letters at each index in a reverse manner
		
	for (int i=m-1; i>=0;i--)
		
	{
		
		//System.out.println(J.charAt(i));
	}
	
	
	for (int i=m-1; i>=0;i--)
		
	{
		t=t+J.charAt(i);
		
	}
	System.out.println(t);
	
	}
	
	}


