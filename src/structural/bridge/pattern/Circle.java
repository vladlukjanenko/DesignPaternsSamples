/**
 * 
 */
package structural.bridge.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Circle extends Shape {

	private int x, y, radius;
	
	/**
	 * @param drawAPI
	 */
	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;		
	}

	/* 
	 * @see bridge.pattern.Shape#draw()
	 */
	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}

}
