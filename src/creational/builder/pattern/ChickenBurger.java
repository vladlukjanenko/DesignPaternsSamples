/**
 * 
 */
package creational.builder.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class ChickenBurger extends Burger {

	/* 
	 * @see builder.pattern.Item#name()
	 */
	@Override
	public String name() {
		return "Chicken Burger";
	}

	/* 
	 * @see builder.pattern.Item#price()
	 */
	@Override
	public float price() {
		return 50.5f;
	}

}
