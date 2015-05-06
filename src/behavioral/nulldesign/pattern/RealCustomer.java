/**
 * 
 */
package behavioral.nulldesign.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class RealCustomer extends AbstractCustomer {

	public RealCustomer(String name) {
		this.name = name;
	}

	/* 
	 * @see behavioral.nulldesign.pattern.AbstractCustomer#isNull()
	 */
	@Override
	public boolean isNull() {
		return false;
	}

	/* 
	 * @see behavioral.nulldesign.pattern.AbstractCustomer#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

}
