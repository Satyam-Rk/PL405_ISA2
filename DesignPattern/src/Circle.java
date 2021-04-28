
public class Circle implements Shape {
private double radius;
	
	public Circle(){				
		this.radius = 0;
	}
	
	public Circle(double radius){			
		this.radius = radius;
	}

	public void display() {					
	      System.out.println("Calculating Area of Circle....");
	}
	
	public double calArea() {			
		return 3.14*this.radius*this.radius;
	}
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
