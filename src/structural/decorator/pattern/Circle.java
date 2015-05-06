/**
 * 
 */
package structural.decorator.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Circle implements Shape {

	/* (non-Javadoc)
	 * @see structural.decorator.pattern.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}

}
