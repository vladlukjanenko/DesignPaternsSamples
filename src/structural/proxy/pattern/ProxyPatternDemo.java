/**
 * 
 */
package structural.proxy.pattern;

/**
 * @author Vlad Lukjanenko
 * =======================    Structural Pattern    =======================
 */
public class ProxyPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Image image = new ProxyImage("test.png");

		// image will be loaded from disk
		image.display();

		System.out.println("");

		// image will not be loaded from disk
		image.display();

	}

}
