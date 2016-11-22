package br.com.robertoveigajunior.broadcastreceivers.receiver;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

import br.com.robertoveigajunior.broadcastreceivers.AlarmeActivity;
import br.com.robertoveigajunior.broadcastreceivers.R;

/**
 * Created by LamborghiniLeptop on 21/11/2016.
 */

public class AlarmReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(
                context,"Alarme disparado",
                Toast.LENGTH_SHORT)
                .show();
        enviarNotificacao(context);
    }

    private void enviarNotificacao(Context context) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setContentIntent(
                PendingIntent.getActivity(context,
                        0, new Intent(context, AlarmeActivity.class),
                        PendingIntent.FLAG_UPDATE_CURRENT));
        builder.setContentTitle("Alarme disparado");
        builder.setContentText("Seu alarme foi disparado com sucesso");
        builder.setTicker("Nova mensagem");
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setAutoCancel(true);

        NotificationManager manager = (NotificationManager)
            context.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(100,builder.build());

    }
}
