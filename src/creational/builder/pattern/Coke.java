/**
 * 
 */
package creational.builder.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Coke extends ColdDrink {

	/*
	 * @see builder.pattern.Item#name()
	 */
	@Override
	public String name() {
		return "Coke";
	}

	/* 
	 * @see builder.pattern.Item#price()
	 */
	@Override
	public float price() {
		return 30.0f;
	}

}
