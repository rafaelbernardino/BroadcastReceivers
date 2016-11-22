package br.com.robertoveigajunior.broadcastreceivers.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by LamborghiniLeptop on 21/11/2016.
 */

public class MyOrderedReceiver1 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Receiver 1 primeiro", Toast.LENGTH_SHORT).show();
    }
}
