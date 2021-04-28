
public class ShapeFactory {
public Shape getInstance(shapeType type) {
		
		Shape shape = null;
			
		switch(type) 
		{		
			case RECTANGLE:
				shape = new Rectangle(10,5);
				break;
				
			case TRIANGLE:
				shape = new Triangle(8,3);
				break;
				
			case CIRCLE:
				shape = new Circle(17);
				break;
				
		}
		
		return shape;
	}	
}
