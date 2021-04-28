
public class Triangle implements Shape {
	private double base;
	private double height;
	
	public Triangle() {		
		
		this.base = 0;
		this.height = 0;
	}
	
	public Triangle(double base,double height){			
		this.base = base;
		this.height = height;
	}
	
	public void display() {								
	      System.out.println("Calculating Area of Triangle ......");
	}
	
	public double calArea() {						
		return 0.5*this.base*this.height;
	}

	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
