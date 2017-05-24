package in.adityaanand.commonutils;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class CommonUtils {

    public static void openDevPage(Context c) {
        try {
            c.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://searchView?q=pub:Xeus")));
        } catch (ActivityNotFoundException anfe) {
            c.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/developer?id=Xeus")));
        }
    }
}
