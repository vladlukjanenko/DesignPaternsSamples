/**
 * 
 */
package creational.abstractfactory.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
