package inheritenceconcept;
/* Here the RBI is the main bank which is offering a loan at a certain % of interest and other banks associated with is offering the loan at
 * different % of interest. So, the definition remains the same but the body is differnt. */

class rbi{
	
	int getrateofInterest() {
		
		return 0;
		
	}
	
}


class hdfc extends rbi{
	
	
int getrateofInterest() {
		
		return 15;
		
	}
	
}
	
class ICICI extends rbi {
	
	
int getrateofInterest() {
		
		return 10;
		
	}
	
}
	

class Axis  extends rbi{
	
int getrateofInterest() {
		
		return 12;
		
		
	}
	
}
	
	

public class OverridingConcept {

	public static void main(String[] args) {
	

rbi rbiobj= new rbi();
System.out.println	(rbiobj.getrateofInterest());


hdfc hdfcobj= new hdfc();
System.out.println	(hdfcobj.getrateofInterest());

ICICI iciciobj= new ICICI();
System.out.println	(iciciobj.getrateofInterest());

Axis axisobj= new Axis();
System.out.println	(axisobj.getrateofInterest());

		
	}

}
