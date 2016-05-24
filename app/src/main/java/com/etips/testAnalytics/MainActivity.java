package com.etips.testAnalytics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;


public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tracker tracker= Analytics.dameTracker(this);

        tracker.send(new HitBuilders.EventBuilder()
                .setCategory("Barren Fields")
                .setAction("Rescue")
                .setLabel("Dragon")
                .setValue(1)
                .build());
    }
}
