package player;


public interface MediaPlayer {
	public void play(String filename);
}


interface AdvancedMediaPlayer {
	public void playFile(String filename);
}

class MP3Player implements MediaPlayer {
	@Override
	public void play(String filename) {
		System.out.println("Playing MP3 file " + filename);		
	}
}


class MP4Player implements AdvancedMediaPlayer {
	@Override
	public void playFile(String filename) {
		System.out.println("Playing MP4 file " + filename);		
	}
}


class VLCPlayer implements AdvancedMediaPlayer {
	@Override
	public void playFile(String filename) {
		System.out.println("Playing VLC file " + filename);		
	}
}


class MediaPlayerAdapter implements MediaPlayer {
	 private AdvancedMediaPlayer advancedMediaPlayer;
	 public MediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
	    this.advancedMediaPlayer = advancedMediaPlayer;
	 }
	 @Override
	 public void play(String filename) {
	   System.out.print("Using MediaPlayerAdapter - ");
	   advancedMediaPlayer.playFile(filename);
	 }
}




package player;
public class Main {
	public static void main(String args[]){
	    MediaPlayer player = new MP3Player();
	    player.play("testmp3file.mp3");
	    player = new MediaPlayerAdapter(new MP4Player());
	    player.play("testmp4file.mp4");
	    player = new MediaPlayerAdapter(new VLCPlayer());
	    player.play("testvlcfile.avi");
	}
}