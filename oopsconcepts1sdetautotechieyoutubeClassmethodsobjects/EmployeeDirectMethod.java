//here we are setting values to values at run time.


import javax.swing.Spring;

public class EmployeeDirectMethod {
	
	//Employee class will have many variables such as below
	
	int empID;
	String empName;
	int empSalary;
	int deptNo;
	
	//In order to display these details we need to call a method that'll take action
	
	void display() {
		
		System.out.println("This is employee ID for emp1 =" + empID);
		System.out.println("This is Name for emp1=" + empName);
		System.out.println("This is salary for emp1="+ empSalary);
		System.out.println("Department emp1 belongs to="+ deptNo);
	}

	
//In order to create a object to call the class, we need a main method 
	
	
	public static void main (String args[]) {
		
		
		EmployeeDirectMethod emp1= new EmployeeDirectMethod();
		
	//its important we declare the variable here. 
		//emp1.empID; //else error like this will be displayed . Inorder to see error remove the comment.
		
		emp1.empID=101;
		emp1.empName="Jayashree";
		emp1.empSalary=5000000;
		emp1.deptNo=10;
		emp1.display();
		
		
		EmployeeDirectMethod emp2= new EmployeeDirectMethod();
		emp2.empID=201;
		emp2.empName="Shree";
		emp2.empSalary=1000000;
		emp2.deptNo=20;
		emp2.display();
		
		
	}
	
	
	
}
