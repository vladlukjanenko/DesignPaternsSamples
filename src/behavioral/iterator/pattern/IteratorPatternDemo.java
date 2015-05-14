/**
 * 
 */
package behavioral.iterator.pattern;

/**
 * @author Vlad Lukjanenko
 * =======================    Behavioral Pattern    =======================
 */
public class IteratorPatternDemo {

	public static void main(String[] args) {

		NameRepository namesRepository = new NameRepository();

		for (Iterator iterator = namesRepository.getIterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println("Name : " + name);
		}

	}

}
