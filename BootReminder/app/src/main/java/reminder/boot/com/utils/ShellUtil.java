package reminder.boot.com.utils;

import android.util.Log;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created by Prasanna on 7/28/2017.
 */

public class ShellUtil {

    public String shellDo(String command) {

        try {
            Process su = Runtime.getRuntime().exec("su");
            DataOutputStream outputStream = new DataOutputStream(su.getOutputStream());

            outputStream.writeBytes(command);
            outputStream.flush();

            outputStream.writeBytes("exit\n");
            outputStream.flush();

            try {
                su.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            outputStream.close();

            return "Command executed!";
        } catch (IOException e) {
            Log.e("BootReminder: ", e.getMessage());
            return command + " execution failed!";
        }
    }
}
