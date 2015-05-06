/**
 * 
 */
package behavioral.observer.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	/*
	 * @see behavioral.observer.pattern.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
	}

}
