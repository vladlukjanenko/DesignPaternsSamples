/**
 * 
 */
package creational.builder.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}
	
}
