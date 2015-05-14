/**
 * 
 */
package creational.builder.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}
	
}
