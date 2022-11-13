package com.lab4.adapter;

import com.lab4.advancedplayer.AdvancedMediaPlayer;
import com.lab4.advancedplayer.Mp4Player;
import com.lab4.advancedplayer.VLCPlayer;
import com.lab4.oldplayer.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
	private AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter(AdvancedMediaPlayer advancedMusicPlayer) {
		this.advancedMusicPlayer = advancedMusicPlayer;
	}

	@Override
	public void play(AdvancedMediaPlayer advancedMusicPlayer) {
		if(advancedMusicPlayer instanceof VLCPlayer) {
			this.advancedMusicPlayer.playVLC();
			
		} else if (advancedMusicPlayer instanceof Mp4Player) {
			this.advancedMusicPlayer.playMp4();
			
		}

	}

}
