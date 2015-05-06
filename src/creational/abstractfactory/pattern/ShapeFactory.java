/**
 * 
 */
package creational.abstractfactory.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class ShapeFactory extends AbstractFactory {

	/* 
	 * @see abstractfactory.pattern.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	Color getColor(String color) {
		return null;
	}

	/*
	 * @see abstractfactory.pattern.AbstractFactory#getShape(java.lang.String)
	 * getShape(StringType) returns the type of the shape
	 */
	@Override
	Shape getShape(String shape) {

		if (shape == null)
			return null;

		if (shape.equalsIgnoreCase("CIRCLE"))
			return new Circle();

		if (shape.equalsIgnoreCase("RECTANGLE"))
			return new Rectangle();

		if (shape.equalsIgnoreCase("SQUARE"))
			return new Square();

		return null;

	}

}
