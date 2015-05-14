/**
 * 
 */
package creational.abstractfactory.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Color::fill() method.");
	}

}
