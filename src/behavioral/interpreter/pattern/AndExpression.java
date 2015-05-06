/**
 * 
 */
package behavioral.interpreter.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class AndExpression implements Expression {

	private Expression expr1 = null;
	private Expression expr2 = null;

	public AndExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	/*
	 * @see
	 * behavioral.interpreter.pattern.Expression#interpret(java.lang.String)
	 */
	@Override
	public boolean interpret(String context) {
		return expr1.interpret(context) && expr2.interpret(context);
	}

}
