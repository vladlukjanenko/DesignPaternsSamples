/**
 * 
 */
package creational.prototype.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}
	
	/* 
	 * @see prototype.pattern.Shape#draw()
	 */
	@Override
	void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
