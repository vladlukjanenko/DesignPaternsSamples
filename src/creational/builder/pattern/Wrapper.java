/**
 * 
 */
package creational.builder.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Wrapper implements Packing {

	/*
	 * @see builder.pattern.Packing#pack()
	 */
	@Override
	public String pack() {
		return "Wrapper";
	}

}
