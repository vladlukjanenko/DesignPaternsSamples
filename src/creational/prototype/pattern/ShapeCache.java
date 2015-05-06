/**
 * 
 */
package creational.prototype.pattern;

import java.util.Hashtable;

/**
 * @author Vlad Lukjanenko
 *
 */
public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeId) {
		Shape cachedShae = shapeMap.get(shapeId);
		return (Shape) cachedShae.clone();
	}
	
	public static void loadCache() {
		
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(), rectangle);
		
		Square square = new Square();
		square.setId("3");
		shapeMap.put(square.getId(), square);
		
	}
}