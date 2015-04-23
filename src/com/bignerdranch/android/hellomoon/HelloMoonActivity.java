package com.bignerdranch.android.hellomoon;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

public class HelloMoonActivity extends FragmentActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_moon);
    }
}
