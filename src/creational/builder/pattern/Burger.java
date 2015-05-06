/**
 * 
 */
package creational.builder.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public abstract class Burger implements Item {

	/* 
	 * @see builder.pattern.Item#packing()
	 */
	@Override
	public Packing packing() {
		return new Wrapper();
	}
}
