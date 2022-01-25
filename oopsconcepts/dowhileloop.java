

public class dowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//do while loop executes the very first loop for sure and then validates and compares to while
		
		double i=33.5;
		do
		{
			i++;
System.out.println(i);
		} while 
			(i<=100);
		
		
		dowhileloop nested=new dowhileloop();
		nested.nestedforloop();
		nested.newnestedforloop();
		nested.reversenestedforloop();
		nested.nestedforloop1();

	}



	//NESTED FOR LOOP- MY METHOD

//1 2 3 4
//5 6 7
//8 9
//10

	
public void nestedforloop(){
	
	
	
	for (int i=1; i<=4;i++){
		
		
		
		System.out.print(i);
		System.out.print("\t");
		
} System.out.println(" ");
	
	for (int j=5; j<=7;j++) {
	
	
	System.out.print(j);
	System.out.print("\t");
	
	
}System.out.println(" ");
	for (int k=8;k<=9;k++) {
		System.out.print(k);
		System.out.print("\t");
	}
	
	
	
	int l=10;
	System.out.println(" ");
		System.out.print(l);
		System.out.println(" ");
		
		
	}
	
	
//New method to print pyramid - Rahul Shetty

public void newnestedforloop() {
	
	int k=1;
	for(int i=0;i<4;i++) //(outer for loop) this block will loop for 4 times
	{
	System.out.println( "outer loop started");
	for(int j=1;j<=4-i;j++) // inner loop
	{
	System.out.println("Innter loop started");
	System.out.print(k);
	System.out.print("\t");
	k++;
	}
	System.out.println("outer loop finished");
	System.out.println( "");
	}
	}

{
		
	}
	
	
	
//	1
//	2 3
//	4 5 6
//	7 8 9 10
	


//My Method

public void reversenestedforloop() {
	int l=1;
	
	System.out.println(l=1);
	
	for (int i=3-1;i<=3;i++) {
		
		System.out.print(i);
		System.out.print("\t");
		
	}System.out.println("");
	for (int j=7-3;j<7;j++) {
		
		System.out.print(j);
		System.out.print("\t");
	}System.out.println("");
	
	for (int k=10-3;k<=10;k++) {
		
		System.out.print(k);
		System.out.print("\t");
	}
	
	
	
	
}
//3
//6 9
//12 15 18
//21 24 27 30

public void nestedforloop1() {
	
	for (int i=4;i<4;i++) {
		
		for (int j=1;j<4;j++) {
			
			System.out.println(j);
		
	}
	
	}
	
	
}

}





