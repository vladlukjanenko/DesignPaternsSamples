/**
 * 
 */
package structural.facade.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Circle implements Shape {

	/* (non-Javadoc)
	 * @see structural.facade.pattern.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}

}
