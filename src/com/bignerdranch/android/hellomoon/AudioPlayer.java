package com.bignerdranch.android.hellomoon;


import android.media.MediaPlayer;
import android.content.Context;

public class AudioPlayer
{
	private MediaPlayer mPlayer;
	
	public void stop() {
		if (null != mPlayer) {
			mPlayer.release();
			mPlayer = null;
		}
	}
	
	public void play(Context c) {
		stop();
		
		mPlayer = MediaPlayer.create(c, R.raw.one_small_step);
		
		mPlayer.setOnCompletionListener(
			new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					stop();
				}
			}
		);
		
		mPlayer.start();
	}
}
