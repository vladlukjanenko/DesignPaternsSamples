/**
 * 
 */
package creational.abstractfactory.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
