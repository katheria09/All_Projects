package com.travel.shekhar.serviceapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by shekh on 09-Feb-16.
 */
public class Mybroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
     if (intent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED"))
     {
         context.startService(new Intent(context.getApplicationContext(),Myservice.class));
     }
    }
}
