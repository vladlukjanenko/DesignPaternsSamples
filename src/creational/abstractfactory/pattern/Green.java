/**
 * 
 */
package creational.abstractfactory.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Green implements Color {

	/* 
	 * @see abstractfactory.pattern.Color#fill()
	 */
	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}

}
