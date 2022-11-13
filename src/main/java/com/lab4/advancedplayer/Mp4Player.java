package com.lab4.advancedplayer;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVLC() {
		System.out.println("Mp4 Player playVLC()");
	}

	@Override
	public void playMp4() {
		System.out.println("Mp4 Player playMp4()");
	}

}
