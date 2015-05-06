/**
 * 
 */
package creational.prototype.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Square extends Shape {

	public Square() {
		type = "Square";
	}
	
	/* 
	 * @see prototype.pattern.Shape#draw()
	 */
	@Override
	void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
