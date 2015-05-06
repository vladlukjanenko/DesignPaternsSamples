/**
 * 
 */
package creational.abstractfactory.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Red implements Color {

	/* 
	 * @see abstractfactory.pattern.Color#fill()
	 */
	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}

}
