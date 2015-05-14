/**
 * 
 */
package behavioral.state.pattern;

/**
 * @author Vlad Lukjanenko
 * =======================    Behavioral Pattern    =======================
 */
public class StatePatternDemo {

	public static void main(String[] args) {

		Context context = new Context();

		State startState = new StartState();
		startState.doAction(context);

		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);

		System.out.println(context.getState().toString());
	}

}
