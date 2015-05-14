/**
 * 
 */
package structural.bridge.pattern;

/**
 * @author Vlad Lukjanenko
 * =======================    Structural Pattern    =======================
 * 
 */
public class BridgePatternDemo {
	
	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(40, 100, 20, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}
	
}