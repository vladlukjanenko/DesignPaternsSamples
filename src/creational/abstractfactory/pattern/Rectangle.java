/**
 * 
 */
package creational.abstractfactory.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Rectangle implements Shape {

	/* 
	 * @see factory.pattern.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Inside Rectanlge::draw() method.");
	}

}
