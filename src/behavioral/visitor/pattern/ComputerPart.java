/**
 * 
 */
package behavioral.visitor.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
