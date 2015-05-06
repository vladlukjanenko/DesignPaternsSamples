/**
 * 
 */
package structural.decorator.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Rectangle implements Shape {

	/*
	 * @see structural.decorator.pattern.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}

}
