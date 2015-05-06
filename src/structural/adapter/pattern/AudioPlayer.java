/**
 * 
 */
package structural.adapter.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;
	
	/* 	
	 * @see adapter.pattern.MediaPlayer#play(java.lang.String, java.lang.String)
	 */
	@Override
	public void play(String audioType, String fileName) {
		
		// inbuilt support for mp3 files
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name " + fileName);
		} else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			// media adapter provide support for other formats
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid media type");
		}
		
	}

}
