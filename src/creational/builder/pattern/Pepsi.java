/**
 * 
 */
package creational.builder.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Pepsi extends ColdDrink {

	/* 
	 * @see builder.pattern.Item#name()
	 */
	@Override
	public String name() {
		return "Pepsi";
	}

	/* 
	 * @see builder.pattern.Item#price()
	 */
	@Override
	public float price() {
		return 35.0f;
	}

}
