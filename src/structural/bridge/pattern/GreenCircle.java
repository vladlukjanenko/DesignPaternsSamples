/**
 * 
 */
package structural.bridge.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class GreenCircle implements DrawAPI {

	/* 
	 * @see bridge.pattern.DrawAPI#drawCircle(int, int, int)
	 */
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	}

}
