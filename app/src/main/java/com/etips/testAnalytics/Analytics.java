package com.etips.testAnalytics;;
import android.app.Activity;
import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

public class Analytics extends Application
{
    private static Tracker mTracker;

    public static Tracker dameTracker(Activity activity)
    {
        if (mTracker == null)
        {
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(activity);
            mTracker = analytics.newTracker(R.xml.global_tracker);
        }
        return mTracker;
    }
}