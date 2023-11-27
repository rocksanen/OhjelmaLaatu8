package org.example;

public class TimeUtils {

    public static int timeToSec(String time) {
        String[] part = time.split(":");
        int hh = Integer.parseInt(part[0]);
        int mm = Integer.parseInt(part[1]);
        int ss = Integer.parseInt(part[2]);

        return 3600 * hh + 60 * mm + ss;
    }

    public static String secToTime(int a) {
        if ( a > 86399) {
            return "-1";
        }
        if (a < 0) {
            return "-1";
        }

        int hh = a / 3600;
        int mm = (a % 3600) / 60;
        int ss = a % 60;

        // Adjust formatting for single-digit minutes and seconds
        String res = String.format("%02d:%02d:%02d", hh, mm, ss);

        return res;
    }
}
