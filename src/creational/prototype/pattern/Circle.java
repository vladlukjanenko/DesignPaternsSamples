/**
 * 
 */
package creational.prototype.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}
	
	@Override
	void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
