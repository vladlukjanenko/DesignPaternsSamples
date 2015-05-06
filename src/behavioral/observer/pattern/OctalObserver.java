/**
 * 
 */
package behavioral.observer.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	/*
	 * @see behavioral.observer.pattern.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
	}

}
