package com.travel.shekhar.autosms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.telephony.SmsManager;


public class MyBroadcast extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED"))
        {
            SmsManager smsManager = SmsManager.getDefault();
            SmsManager.sendTextMessage

            //context.startService(new Intent(context.getApplicationContext(),MyService.class));
        }
    }
}
