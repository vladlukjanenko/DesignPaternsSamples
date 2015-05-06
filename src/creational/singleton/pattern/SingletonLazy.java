/**
 * 
 */
package creational.singleton.pattern;

/**
 * @author Vlad Lukjanenko
 * Creational pattern
 * 
 * Without synchronization
 */
public class SingletonLazy {
	
	private SingletonLazy() {}
	
	private static SingletonLazy instance = null;
	
	public static SingletonLazy getInstance() {
		if(instance == null)
			return instance = new SingletonLazy();
		else
			return instance;
	}
	
}
