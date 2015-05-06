/**
 * 
 */
package creational.factory.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class ShapeFactory {

	// getShape(StringType) returns the type of the shape
	public Shape getShape(String shapeType) {
		if (shapeType == null)
			return null;
		
		if (shapeType.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		
		if (shapeType.equalsIgnoreCase("RECTANGLE"))
			return new Rectangle();
		
		if (shapeType.equalsIgnoreCase("SQUARE"))
			return new Square();

		return null;
	}
}
