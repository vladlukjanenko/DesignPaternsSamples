/**
 * 
 */
package behavioral.template.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Football extends Game {

	/* 
	 * @see behavioral.template.pattern.Game#initialize()
	 */
	@Override
	void initialize() {
		System.out.println("Football Game Initialized! Start playing.");
	}

	/* 
	 * @see behavioral.template.pattern.Game#startPlay()
	 */
	@Override
	void startPlay() {
		System.out.println("Football Game Started. Enjoy the game!");
	}

	/* 
	 * @see behavioral.template.pattern.Game#endPlay()
	 */
	@Override
	void endPlay() {
		System.out.println("Football Game Finished!");
	}

}
