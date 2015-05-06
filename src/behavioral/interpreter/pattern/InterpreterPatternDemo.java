/**
 * 
 */
package behavioral.interpreter.pattern;

/**
 * @author Vlad Lukjanenko
 * =======================    Behavioral Pattern    =======================
 */
public class InterpreterPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();

		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is a married women? "
				+ isMarriedWoman.interpret("Married Julie"));

	}

	// Rule: Robert and John are male
	public static Expression getMaleExpression() {

		Expression rebert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");

		return new OrExpression(rebert, john);

	}

	// Rule: Julie is a married women
	public static Expression getMarriedWomanExpression() {

		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");

		return new AndExpression(julie, married);

	}

}
