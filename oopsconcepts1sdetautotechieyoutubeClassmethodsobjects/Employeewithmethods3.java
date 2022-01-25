
/*Method 3: We can assign values to the class variables using methods too 
 A method may or may not return something. 
 A method may or may not contain parameters but in the case below, we are passing some parameters to 
 the method which inturn assigns to the variables of the class.
 Method can be invoked by creating object
 * */


public class Employeewithmethods3 {
	
	int empID;
	String empName;
	int empSalary;
	int deptNo;
	
	void setdata(int Id, String name, int sal, int Dno ) {
		
		empID=Id;
		empName=name;
		empSalary=sal;
		deptNo=Dno;
	}
	
void display() {
		
		System.out.println("This is employee ID for emp1 =" + empID);
		System.out.println("This is Name for emp1=" + empName);
		System.out.println("This is salary for emp1="+ empSalary);
		System.out.println("Department emp1 belongs to="+ deptNo);
	}
public static void main (String args[]) {
	
	
	Employeewithmethods3 emp1= new Employeewithmethods3();
	emp1.setdata(101, "jayashree", 5000000, 10);
	emp1.display();
	
	Employeewithmethods3 emp2= new Employeewithmethods3();
	emp2.setdata(201, "shree", 9000000, 20);
	emp2.display();
	
}


}
	




