package com.example.notificationtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sendNotice = (Button) findViewById(R.id.send_notice);
        sendNotice.setOnClickListener(this);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.send_notice:
                Intent intent = new Intent(this,NotificationActivity.class);
                PendingIntent pi = PendingIntent.getActivity(this,0,intent,0);
                NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                Notification notification = new Notification.Builder(this)
                        .setContentTitle("通知标题")
                        .setStyle(new Notification.BigTextStyle().bigText("通知内容发生飞洒飞洒哈佛啊i飞机送i啊符号符号是到付哈搜到佛阿宋福仕达"))
                        .setWhen(System.currentTimeMillis())
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher))
                        .setContentIntent(pi)
                        .setAutoCancel(true)
                        .setSound(Uri.fromFile(new File("/system/media/audio/ringtones/Mi.ogg")))
                        .setVibrate(new long[]{0,1000,1000,1000})
                        .setLights(Color.GREEN,1000,1000)
                        .setPriority(Notification.PRIORITY_MAX)
                        .build();
                manager.notify(1,notification);
                break;
            default:
                break;
        }
    }
}