

public class methodsOverloading {
	
	void method1(int x, int y) {
	
		//a=x;
		//b=y;
		
		System.out.println(x+y);
	}
	
	void method1(int x, int y, int z){
		
		System.out.println(x+y+z);
	}
	
void method1(int z, double x){
		
		System.out.println(x+z);
	}

	public static void main(String[] args) {
		
		methodsOverloading mo= new methodsOverloading();
		mo.method1(100,900);
		mo.method1(10, 20, 30);
		mo.method1(50, 1.5);
		
	

	}

}
