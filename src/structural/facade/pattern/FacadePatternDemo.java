/**
 * 
 */
package structural.facade.pattern;

/**
 * @author Vlad Lukjanenko
 * =======================    Structural Pattern    =======================
 */
public class FacadePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
		
	}

}
