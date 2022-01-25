

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i=10;
		int j=0;
		
		
		//If we dont add i-- here, it'll start printing infinite times since all numbers are greater than 10 
		while (i>=0) {
			
			System.out.println(i);
			i--;
		
		}
		
		
		
		
		while (j<=10) {
			System.out.println(j);
			j++;
		}

	}

}
