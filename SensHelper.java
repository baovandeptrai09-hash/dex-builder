package com.senshelper;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class SensHelper extends Service {

    private static final String TAG = "SensHelper";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "SensHelper created");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "SensHelper started");
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "SensHelper destroyed");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
