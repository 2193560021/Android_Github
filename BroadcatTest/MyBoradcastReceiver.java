package com.example.broadcattest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBoradcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "received in MyBoradcastReceiver", Toast.LENGTH_SHORT).show();
        abortBroadcast();
    }
}
