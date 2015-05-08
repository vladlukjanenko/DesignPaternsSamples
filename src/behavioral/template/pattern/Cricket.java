/**
 * 
 */
package behavioral.template.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Cricket extends Game {

	/* 
	 * @see behavioral.template.pattern.Game#initialize()
	 */
	@Override
	void initialize() {
		System.out.println("Cricket Game Initialized! Start playing.");
	}

	/* 
	 * @see behavioral.template.pattern.Game#startPlay()
	 */
	@Override
	void startPlay() {
		System.out.println("Cricket Game Started. Enjoy the game!");
	}

	/* 
	 * @see behavioral.template.pattern.Game#endPlay()
	 */
	@Override
	void endPlay() {
		System.out.println("Cricket Game Finished!");
	}

}
