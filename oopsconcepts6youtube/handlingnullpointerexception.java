

public class handlingnullpointerexception {

	public static void main(String[] args) {
		
		
		System.out.println("program started");
		
		String s=null;
		
		try {
		
		
		System.out.println(s.length()); //  java.lang.NullPointerException*/
		
		}
		
		catch(NullPointerException e) {
			
		System.out.println(e.getMessage());
			
		}

		System.out.println("program ended");
		
		
	}

}
