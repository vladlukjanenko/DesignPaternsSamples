/**
 * 
 */
package creational.abstractfactory.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class FactoryProducer {
	
	public static AbstractFactory getFactory(String type) {
		
		if(type == null)
			return null;
		
		if(type.equalsIgnoreCase("COLOR"))
			return new ColorFactory();
		
		if(type.equalsIgnoreCase("SHAPE"))
			return new ShapeFactory();
				
		return null;
	}
}
