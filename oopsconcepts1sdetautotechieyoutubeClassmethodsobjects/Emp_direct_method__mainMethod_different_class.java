//here we are calling objects in EmployeeDirectMethod.Java class
public class Emp_direct_method__mainMethod_different_class {

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
