package com.example.osmbonuspacktuto;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by hakami1024 on 3/5/16.
 */
public class App extends Application {

    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
