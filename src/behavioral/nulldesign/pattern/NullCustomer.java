/**
 * 
 */
package behavioral.nulldesign.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class NullCustomer extends AbstractCustomer {
	
	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

}
