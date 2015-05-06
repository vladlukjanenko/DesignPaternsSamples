/**
 * 
 */
package behavioral.observer.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}
