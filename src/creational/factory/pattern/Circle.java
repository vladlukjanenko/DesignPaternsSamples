/**
 * 
 */
package creational.factory.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Circle implements Shape {

	/* 
	 * @see factory.pattern.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
