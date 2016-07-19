package com.travel.shekhar.mybroadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by shekh on 06-Jul-16.
 */

public class MyBroadcast extends BroadcastReceiver {
    @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.HEADSET_PLUG"))
            {

                context.startService(new Intent(context.getApplicationContext(),MyService.class));
            }
        }

}
