


final public class finalkeyword {// if method has final keyword, method cannot be overridden in child class
	
	final int a= 100;
	
	final void m1(){
		
		System.out.println(" this is a method- no final ");
	
		
}
	
	
	//class finalclass extends finalkeyword{ // WE CANNOT EXTEND PARENT CLASS THAT HAS FINAL PREFIX
		
		/*void m1() { //Cannot use method with final prefix - throws error
			
			System.out.println(" this is a method with finall ");
			
		}
		
	}*/
	

	
	

	public static void main(String[] args) {
		
	finalkeyword fkobj= new finalkeyword();
	System.out.println(fkobj.a);
	//fkobj.a=50; ===> this will throw error since a variable is final.Hence cannot be modified
	//System.out.println(fkobj.a);
	
	
	fkobj.m1();
	
	}

}

