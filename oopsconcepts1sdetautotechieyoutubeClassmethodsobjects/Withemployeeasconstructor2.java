/*We can assign values to the class variables by creating a constructor as below
//Constructor - Constructor will also have the same class name . Its a kind of method. Constructor will take 
	//arguments similar to the variables of the class.
	//datatype variable 
	//datatype = int, string 
	//variable =ID, Name, Sal, DNo
	//They should be seperate dby commas.
	//same variable values should be assigned to the class variables.
	 * A constructor is only for initializing variable and cannot be used to writing logic*/



public class Withemployeeasconstructor2 {
	
	int empID;
	String empName;
	int empSalary;
	int deptNo;
	
	
	Withemployeeasconstructor2(int Id, String Name, int Sal, int dNo){
		
		empID=Id;
		empName=Name;
		empSalary=Sal;
		deptNo=dNo;	
		
	}
	
	
void display() {
		
		System.out.println("This is employee ID for emp1 =" + empID);
		System.out.println("This is Name for emp1=" + empName);
		System.out.println("This is salary for emp1="+ empSalary);
		System.out.println("Department emp1 belongs to="+ deptNo);
	}

public static void main (String args[]) {
	
	//To call the class, we create an obj and pass the values .
	//Constructor will have the same name as the Classname.Constructor will be invoked at the time of obj creation.
	Withemployeeasconstructor2 emp1 = new Withemployeeasconstructor2(101, "Jayashree", 10, 50000000);
	
	emp1.display();
	
	Withemployeeasconstructor2 emp2 = new Withemployeeasconstructor2(201, "Shree", 20, 1000000000);
	
	emp2.display();
		
	
}
}


