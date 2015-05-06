/**
 * 
 */
package creational.builder.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Bottle implements Packing {

	/* 
	 * @see builder.pattern.Packing#pack()
	 */
	@Override
	public String pack() {
		return "Bottle";
	}

}
