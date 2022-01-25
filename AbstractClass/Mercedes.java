

public class Mercedes extends Cars  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		
		//Cars c = new Cars(); // we cannot instantiate abstract directly
		
		//Cars C= new Mercedes();
		//C.color();
	
		Mercedes mechanic= new Mercedes();
		mechanic.engine();
		mechanic.drive();
		mechanic.year();
		mechanic.color();
		
		
		

	}

	@Override
	public void color() {
		System.out.println("Abstract Class method");
		
	}

}
