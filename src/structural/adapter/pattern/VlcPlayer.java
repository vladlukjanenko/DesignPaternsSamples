/**
 * 
 */
package structural.adapter.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class VlcPlayer implements AdvancedMediaPlayer {

	/* 
	 * @see adapter.pattern.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name " + fileName);
	}

	/* 
	 * @see adapter.pattern.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName) {
		
	}

}
