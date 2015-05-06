/**
 * 
 */
package creational.factory.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Square implements Shape {

	/*
	 * @see factory.pattern.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
