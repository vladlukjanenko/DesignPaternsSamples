/**
 * 
 */
package structural.decorator.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public abstract class ShapeDecorator implements Shape {

	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	/* 
	 * @see structural.decorator.pattern.Shape#draw()
	 */
	@Override
	public void draw() {
		decoratedShape.draw();
	}

}
