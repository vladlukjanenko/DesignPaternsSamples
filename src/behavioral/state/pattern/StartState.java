package behavioral.state.pattern;
import behavioral.state.pattern.Context;
import behavioral.state.pattern.State;

/**
 * 
 */

/**
 * @author Vlad Lukjanenko
 *
 */
public class StartState implements State {

	/* 
	 * @see behavioral.state.pattern.State#doAction(behavioral.state.pattern.Context)
	 */
	@Override
	public void doAction(Context context) {

		System.out.println("Player is in start state");
		context.setState(this);

	}

	public String toString() {
		return "Start State";
	}

}
