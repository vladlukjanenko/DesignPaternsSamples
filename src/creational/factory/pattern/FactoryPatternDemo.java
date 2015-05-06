/**
 * 
 */
package creational.factory.pattern;

/**
 * @author Vlad Lukjanenko
 * =======================    Creational Pattern    =======================
 *
 */
public class FactoryPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create ShapeFactory object
		ShapeFactory shapeFactory = new ShapeFactory();
		
		// create rectangle object using ShapeFactory
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw(); // draw rectangle
		
		// create circle object using ShapeFactory
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw(); // draw circle
		
		// create square object using ShapeFactory
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw(); // draw square
	}

}
