package OOPS_concepts_youtube_7;


public class AssignmentQuestions {
	
	//SWAPPING 2 numbers
	public void numberswapping() {
		
		
		int a= 10;
		int b=20;
		
		int c;
		
		System.out.println(" value of a before swapping :" + a);
		System.out.println(" value of a before swapping :" + b);
		
		c= a;// c is now 10
		
		a= b; // a is not 20
		
		b=c;// a is now 10
		

		
		System.out.println(" value of a after swapping :" + a);
		System.out.println(" value of b after swapping :" + b);
		
		
	}
	
	//FIND BIGGEST NUMBER 
	
	public void biggestNumber() {
		
		int i=10;
		int j= 20;
		int k= 30;
		
		if (i>j) {
			
			System.out.println(i + "is the  biggest number");
			
		}
		else if (j>k) {
			
			System.out.println(j + "is the  biggest number");
			
		} else if (k>i) {
			
			System.out.println(k + "is the  biggest number");
		}
		else if (j>i) {
			
			
			System.out.println(j + "is the  biggest number");
		}
		
		
	}
	
	
	
	public void biggestnum() {
		int i=10;
		int j= 20;
		int k= 30;
		
		
		if ((i>j) && (i>k)){
			
			System.out.println(i + "is the  biggest number");
			
		} else if ((j>k)&& (j>i)){
			
			System.out.println(j + "is the  biggest number");
			
		} else 
			
			System.out.println(k + "is the  biggest number");
		
		
	}

	
	public void findingmonth() {
		
		int month =6;
		
		switch (month) {
		
		case 1: System.out.println("month is January"); break;
		case 2: System.out.println("month is february"); break;
		case 3: System.out.println("month is mar"); break;
		case 4: System.out.println("month is apr"); break;
		case 5: System.out.println("month is may"); break;
		case 6: System.out.println("month is jun"); break;
		case 7: System.out.println("month is jul"); break;
		case 8: System.out.println("month is aug"); break;
		case 9: System.out.println("month is sep"); break;
		case 10: System.out.println("month is oct"); break;
		case 11: System.out.println("month is nov"); break;
		//case 12: System.out.println("month is dec"); break;
		default : System.out.println("month is dec");
		}
		
		
	}
	
//This program helps in adding numbers inside an Array	
	
	public void finding_sum_of_Array() {
		
		
		
		int[] s= {4, 5, 6, 7, 8, 9};
		
		
		int sum=0;
		
		for (int i=0; i<s.length;i++) {
			
			sum = sum + s[i] ;
			
			//sum = i+(i+1);
			System.out.println(sum);
			
		}
		
		System.out.println("this is the sum " + sum);
		
		
	}
	

	public static void main(String[] args) {
		
		AssignmentQuestions ns= new AssignmentQuestions();
		
		ns.numberswapping();
		ns.biggestNumber();
		ns.biggestnum();
		ns.findingmonth();
		ns.finding_sum_of_Array();
	}
	

	
	
	
	
	
	
	
}
