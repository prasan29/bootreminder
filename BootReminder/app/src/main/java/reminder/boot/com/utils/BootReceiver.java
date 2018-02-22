package reminder.boot.com.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Prasanna on 9/20/2017.
 */

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Notifier.showNotification(new ShellUtil().shellDo("echo '0' > /sys/devices/virtual/touch/tp_dev/gesture_on\n"), context);
        Toast.makeText(context, new ShellUtil().shellDo("echo '0' > /sys/devices/virtual/touch/tp_dev/gesture_on\n"), Toast.LENGTH_SHORT).show();
    }
}
