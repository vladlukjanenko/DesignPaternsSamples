/**
 * 
 */
package creational.singleton.pattern;

/**
 * @author Vlad Lukjanenko
 * 
 * Without synchronization
 */
public class Singleton {
	
	private Singleton() {}
	
	private static Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}
	
}
