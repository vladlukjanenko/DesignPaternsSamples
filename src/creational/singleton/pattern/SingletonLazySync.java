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
public class SingletonLazySync {
	
	private SingletonLazySync() {}
	
	private static SingletonLazySync instance = null;
	
/*	public synchronized SingletonLazySync getInstance() {
		if(instance == null)
			return instance = new SingletonLazySync();
		else
			return instance;
	}*/
	
	// or we can make like this
	
	public static SingletonLazySync getInstance() {
		if(instance == null)
			synchronized (SingletonLazySync.class) {
				return instance = new SingletonLazySync();	
			}
		else
			return instance;
	}
	
}
