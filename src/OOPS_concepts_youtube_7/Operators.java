package OOPS_concepts_youtube_7;


public class Operators {

	public static void main(String[] args) {
	/*	 	These are functions that helps in doing certain kind of operations between 2 operands
			Arithmatic Operator - +, -, *, /, %
			Relational Operator - ==, <, >, >=, <=, !=
			Logical Operator  &&, ||, !
			Increment/Decrement Operator  - ++, --;
			Assignment =


Relational and Logical operators always return boolean values.
	 * 	
	 * 		X 		Y  		X&Y 	X|| 	!X
		 TRUE	 TRUE		TRUE	TRUE	FALSE
		 TRUE	FALSE		FALSE	TRUE	FALSE
		 FALSE	TRUE		FALSE	TRUE	TRUE
		 FALSE	FALSE		FALSE	FALSE	TRUE 
		 
		 * X&Y returns TRUE ONLY if both X Y are true
		 * X||Y returns TRUE when either of them are true
		 * !X is a negation. If the value of X is true, then negation of true is false . Hence false is returned
	
		 */
		
		boolean x= true;
		boolean y = false;
		
		
		System.out.println(x&y);//false
		System.out.println(x||y); //true
		System.out.println(!x);//false
		System.out.println(!y);//true
		
	}

}
