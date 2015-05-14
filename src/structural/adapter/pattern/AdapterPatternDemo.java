/**
 * 
 */
package structural.adapter.pattern;

/**
 * @author Vlad Lukjanenko
 * =======================    Structural Pattern    =======================
 * 
 */
public class AdapterPatternDemo {

	public static void main(String[] args) {
		
		MediaPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "Nothing else matters.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "Interstellar.vlc");
		audioPlayer.play("avi", "The Maze Runner.avi");
		
	}

}
