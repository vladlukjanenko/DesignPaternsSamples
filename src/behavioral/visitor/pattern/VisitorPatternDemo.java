/**
 * 
 */
package behavioral.visitor.pattern;

/**
 * @author Vlad Lukjanenko
 * =======================    Behavioral Pattern    =======================
 */
public class VisitorPatternDemo {

	public static void main(String[] args) {

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());

	}

}