package com.bignerdranch.android.hellomoon;


import android.support.v4.app.Fragment;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;

public class HelloMoonFragment extends Fragment
{
	private AudioPlayer mPlayer = new AudioPlayer();
	private Button mPlayButton;
	private Button mStopButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.fragment_hello_moon, parent, false);
		mPlayButton = (Button) view.findViewById(R.id.hellomoon_playButton);
		mPlayButton.setOnClickListener(
			new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					mPlayer.play(getActivity());
				}
			}
		);
		mStopButton = (Button) view.findViewById(R.id.hellomoon_stopButton);
		mStopButton.setOnClickListener(
			new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					mPlayer.stop();
				}
			}
		);
		
		return view;
	}

	@Override
	public void onDestroy()
	{
		super.onDestroyView();
		
		mPlayer.stop();
	}
	
}
