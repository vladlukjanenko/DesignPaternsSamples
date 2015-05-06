/**
 * 
 */
package structural.decorator.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class RedShapeDecorator extends ShapeDecorator {

	/**
	 * @param decoratedShape
	 */
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	/*
	 * @see structural.decorator.pattern.ShapeDecorator#draw()
	 */
	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	
	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color: Red");
	}
	
}
