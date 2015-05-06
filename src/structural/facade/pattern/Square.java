/**
 * 
 */
package structural.facade.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Square implements Shape {

	/* 
	 * @see structural.facade.pattern.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}

}
