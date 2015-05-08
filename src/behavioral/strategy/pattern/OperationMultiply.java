/**
 * 
 */
package behavioral.strategy.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class OperationMultiply implements Strategy {

	/*
	 * @see behavioral.strategy.pattern.Strategy#doOperation(int, int)
	 */
	@Override
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}

}
