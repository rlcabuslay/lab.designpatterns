package com.lab4;

import com.lab4.advancedplayer.Mp4Player;
import com.lab4.advancedplayer.VLCPlayer;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		VLCPlayer vlc = new VLCPlayer();
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play(vlc);
		
		Mp4Player mp4 = new Mp4Player();
		audioPlayer.play(mp4);

		audioPlayer.play(null);
	}

}
