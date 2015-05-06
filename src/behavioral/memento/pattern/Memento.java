/**
 * 
 */
package behavioral.memento.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Memento {
	
	private String state;
	
	public Memento(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
}
