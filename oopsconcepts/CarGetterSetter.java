//we created this class Car so NewDemo NewDemo1 can call this class and use the objects from here. This is from Getters and Setters -25, 26 of Novice to Ninja



public class CarGetterSetter  {

	private String color;
	private String make;
	public String model;
	private int year;


	public String increasespeed() {
		
		System.out.println(" This car is speeding");
	
	return "pass";
	}


	public void setmake(String make) {
		
		this.make=make;
	}
	
	public String getmake() {
		
		return this.make ;
		
	}

	public void setColor(String color ) {
		this.color = color;
		
		
		
	}

	public String getColor() {
		return color;
	}


	


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		
		if (year>1950){
			this.year = year;
		}else {
			
			
		System.out.println("This year is not valid");
		
	}



}
}
	


	
	
	
	

