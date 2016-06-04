package com.joyapp.apptemplate.service;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.gcm.GcmListenerService;
import com.joyapp.apptemplate.alert.MyNotification;

/**
 * Created by JOY on 6/4/2016.
 */
public class PushNotificationService extends GcmListenerService {
    public static Activity activity;
    @Override
    public void onMessageReceived(String from, Bundle data) {
        String mesaage = data.getString("message");

        MyNotification myNotification = new MyNotification(activity);
        myNotification.pushNotification(mesaage,mesaage,123456);
        Log.d("INSTANT", mesaage);

    }
}
