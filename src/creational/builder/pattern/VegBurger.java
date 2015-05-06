/**
 * 
 */
package creational.builder.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class VegBurger extends Burger {

	/*
	 * @see builder.pattern.Item#name()
	 */
	@Override
	public String name() {
		return "Veg Burger";
	}

	/* 
	 * @see builder.pattern.Item#price()
	 */
	@Override
	public float price() {
		return 25.0f;
	}

}
