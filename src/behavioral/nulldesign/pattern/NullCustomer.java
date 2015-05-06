/**
 * 
 */
package behavioral.nulldesign.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class NullCustomer extends AbstractCustomer {
	
	/* 
	 * @see behavioral.nulldesign.pattern.AbstractCustomer#isNull()
	 */
	@Override
	public boolean isNull() {
		return true;
	}

	/* 
	 * @see behavioral.nulldesign.pattern.AbstractCustomer#getName()
	 */
	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

}
