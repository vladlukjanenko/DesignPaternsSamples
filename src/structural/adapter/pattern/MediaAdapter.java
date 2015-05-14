/**
 * 
 */
package structural.adapter.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter(String audioType) {

		if (audioType.equalsIgnoreCase("vlc"))
			advancedMediaPlayer = new VlcPlayer();
		else if (audioType.equals("mp4"))
			advancedMediaPlayer = new Mp4Player();

	}

	@Override
	public void play(String audioType, String fileName) {

		if (audioType.equalsIgnoreCase("vlc"))
			advancedMediaPlayer.playVlc(fileName);
		else if (audioType.equals("mp4"))
			advancedMediaPlayer.playMp4(fileName);
		
	}

}
