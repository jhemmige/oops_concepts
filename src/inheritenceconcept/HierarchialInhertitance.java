package inheritenceconcept;
class parentnewA{
	
int a;

void display() {
	
	System.out.println(a);
}
	
	
}

class parentnewB extends parentnewA{
	
	int b;
	
	public void show() {
		
		
		System.out.println(b);
		
	}
	
	
	
}

class parentnewC extends parentnewA{
	
	
int c;
	
	public void print() {
		
		
		System.out.println(c);
		
	}
	
	
	
	
}

class parentnewD extends parentnewA{
	
int d;
	
	public void broadcast() {
		
		
		System.out.println(d);
		
	}
	
	
	
	
}



public class HierarchialInhertitance {

	public static void main(String[] args) {
		
		
		parentnewA pa = new parentnewA();
		pa.a=10;
		pa.display();
		
		
		parentnewB pb= new parentnewB();
		//from parent A
		pb.a=15;
		pb.display();
		//from parent B
		pb.b=20;
		pb.show();
		
		
		parentnewC pc = new parentnewC();
		//from parent A
		pc.a= 25;
		pb.display();
		//from parent C
		pc.c= 30;
		pc.print();
		
		parentnewD pd = new parentnewD();
		//from parent A
		pd.a=50;
		pd.display();
		
		//from parent D
		pd.d=100;
		pd.broadcast();
		

	}

}
