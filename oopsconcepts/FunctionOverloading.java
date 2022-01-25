

public class FunctionOverloading {

	
	
	public void getdata(int a) {
		
		System.out.println(a);
		
	}
	
	
	public void getdata(String b) {
		System.out.println(b);
	}
	
public void getdata(int a,int b) {
	
	System.out.println(a & b);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionOverloading obj= new FunctionOverloading();
		
		obj.getdata(6);
		obj.getdata("java & lava ");
		obj.getdata(9,8);
		
	
		

	}

}
