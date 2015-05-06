/**
 * 
 */
package creational.abstractfactory.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class ColorFactory extends AbstractFactory {

	/*
	 * @see abstractfactory.pattern.AbstractFactory#getColor(java.lang.String)
	 * getColor(String color) returns the type of the color
	 */
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

	/* 
	 * @see abstractfactory.pattern.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
	Shape getShape(String shape) {
		return null;
	}

}
