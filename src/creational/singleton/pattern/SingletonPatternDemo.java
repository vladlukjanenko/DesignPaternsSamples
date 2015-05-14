/**
 * 
 */
package creational.singleton.pattern;

/**
 * @author Vlad Lukjanenko
 * =======================    Creational Pattern    =======================
 * 
 */
public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		System.out.println("Singleton");
		
		Singleton singleton = Singleton.getInstance();
	}

}
