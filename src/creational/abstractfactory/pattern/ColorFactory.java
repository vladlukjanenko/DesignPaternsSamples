/**
 * 
 */
package creational.abstractfactory.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		
		if(color == null)
			return null;
		
		if(color.equalsIgnoreCase("RED"))
			return new Red();
		
		if(color.equalsIgnoreCase("BLUE"))
			return new Blue();
		
		if(color.equalsIgnoreCase("GREEN"))
			return new Green();
		
		return null;
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}

}
