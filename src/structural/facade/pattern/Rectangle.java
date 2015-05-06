/**
 * 
 */
package structural.facade.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Rectangle implements Shape {

	/* 
	 * @see structural.facade.pattern.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}

}
