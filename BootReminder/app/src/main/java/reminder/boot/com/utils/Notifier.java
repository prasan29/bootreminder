package reminder.boot.com.utils;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.NotificationCompat;

import reminder.boot.com.bootreminder.R;

/**
 * Created by 1130665 on 9/20/2017.
 */

public class Notifier {
    public static void showNotification(String message, Context context) {
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context);

        mBuilder.setSmallIcon(R.drawable.ic_speaker_notes_white_24dp);
        mBuilder.setContentTitle("Boot reminder");
        mBuilder.setContentText(message);

        NotificationManager mNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        mNotificationManager.notify(1, mBuilder.build());
    }
}
