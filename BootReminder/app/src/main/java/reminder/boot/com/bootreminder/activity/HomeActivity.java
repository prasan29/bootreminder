package reminder.boot.com.bootreminder.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import reminder.boot.com.bootreminder.R;
import reminder.boot.com.utils.ShellUtil;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        Notifier.showNotification("Set double tap value.", this);

        Toast.makeText(this, new ShellUtil().shellDo("echo '0' > /sys/devices/virtual/touch/tp_dev/gesture_on\n"), Toast.LENGTH_SHORT).show();
    }
}
