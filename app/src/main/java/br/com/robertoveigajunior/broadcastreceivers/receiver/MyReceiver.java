package br.com.robertoveigajunior.broadcastreceivers.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by LamborghiniLeptop on 21/11/2016.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Logado",Toast.LENGTH_SHORT).show();
    }
}
