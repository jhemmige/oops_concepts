
public class mainMethodoverloading {
	
	
	public void main (int x) {
		
		System.out.println(x);
		
		
	}
	
	public void main (int x, int y) {
		
		
		System.out.println(x+y);
		
	}
	
	

	public static void main(String[] args) {
		
		mainMethodoverloading main = new mainMethodoverloading();
		
		main.main(100);
		
		main.main(100, 200);
		
		

	}

}
