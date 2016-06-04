package com.joyapp.apptemplate.alert;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

import com.joyapp.apptemplate.MainActivity;
import com.joyapp.apptemplate.R;

/**
 * Created by JOY on 6/4/2016.
 */
public class MyNotification {
    private NotificationCompat.Builder notification;
    private Context context;
    private NotificationManager nm;
    private Intent i;

    private PendingIntent pendingIntent;
    public MyNotification(Context context) {
        this.context = context;
        this.notification = new NotificationCompat.Builder(context);
        this.i = new Intent(context, MainActivity.class);
        this.pendingIntent = PendingIntent.getActivity(context, 0, i, PendingIntent.FLAG_UPDATE_CURRENT);
        this.notification.setContentIntent(pendingIntent);
        nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
    }

    public void pushNotification(String title, String body, int id_number){
        notification.setSmallIcon(R.drawable.ic_launcher);
        notification.setTicker("App Template");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle(title);
        notification.setContentText(body);
        nm.notify(id_number, notification.build());
    }
}
