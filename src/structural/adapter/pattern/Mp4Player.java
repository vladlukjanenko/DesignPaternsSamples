/**
 * 
 */
package structural.adapter.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class Mp4Player implements AdvancedMediaPlayer {

	/*
	 * @see adapter.pattern.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName) {
		

	}

	/* 
	 * @see adapter.pattern.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name " + fileName);
	}

}
