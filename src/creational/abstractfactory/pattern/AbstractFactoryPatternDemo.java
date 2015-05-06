/**
 * 
 */
package creational.abstractfactory.pattern;

/**
 * @author Vlad Lukjanenko
 * =======================    Creational Pattern    =======================
 */
public class AbstractFactoryPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		// get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		// create shapes
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();
		
		// create colors
		Color red = colorFactory.getColor("RED");
		red.fill();
		
		Color green = colorFactory.getColor("GREEN");
		green.fill();
		
		Color blue = colorFactory.getColor("BLUE");
		blue.fill();
	}

}
