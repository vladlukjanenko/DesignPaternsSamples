/**
 * 
 */
package behavioral.template.pattern;

/**
 * @author Vlad Lukjanenko
 * =======================    Behavioral Pattern    =======================
 */
public class TemplatePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		
		System.out.println();
		
		game = new Football();
		game.play();

	}

}
