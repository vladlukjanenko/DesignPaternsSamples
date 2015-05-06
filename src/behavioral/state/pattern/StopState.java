/**
 * 
 */
package behavioral.state.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class StopState implements State {

	/*
	 * @see
	 * behavioral.state.pattern.State#doAction(behavioral.state.pattern.Context)
	 */
	@Override
	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}
	
	public String toString() {
		return "Stop State";
	}

}
