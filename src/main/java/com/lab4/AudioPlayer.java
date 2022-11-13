package com.lab4;

import com.lab4.adapter.MediaAdapter;
import com.lab4.advancedplayer.AdvancedMediaPlayer;
import com.lab4.oldplayer.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
	private MediaAdapter mediaAdapter;

	@Override
	public void play(AdvancedMediaPlayer advancedMusicPlayer) {
		if(advancedMusicPlayer == null) {
			System.out.println("Mp3 Player play()");
			
		} else {
			mediaAdapter = new MediaAdapter(advancedMusicPlayer);
			mediaAdapter.play(advancedMusicPlayer);
			
		}
		
	}

}
