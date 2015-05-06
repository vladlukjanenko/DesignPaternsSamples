/**
 * 
 */
package behavioral.observer.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		
		this.subject = subject;
		this.subject.attach(this);
		
	}

	/*
	 * @see behavioral.observer.pattern.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
	}

}
