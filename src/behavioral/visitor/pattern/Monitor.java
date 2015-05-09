/**
 * 
 */
package behavioral.visitor.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Monitor implements ComputerPart {

	/* 
	 * @see behavioral.visitor.pattern.ComputerPart#accept(behavioral.visitor.pattern.ComputerPartVisitor)
	 */
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
