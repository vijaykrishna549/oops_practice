package time_manager;

import java.text.ParseException;
import java.time.LocalTime;

public class TimeManager {
//    Write  a  class  Time  with  three  data  members  to  store  hr,  min  and  seconds.
//    Create two constructors and apply checks to set valid time.
//    Also create display function which displays all data members
    String hour, minutes,seconds;

    public TimeManager(String hour, String minutes, String seconds){
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public TimeManager() {

    }

    public void displayTime() throws ParseException {
        System.out.println(hour+":"+minutes+":"+seconds);
        String strTime = hour+":"+minutes+":"+seconds;

        LocalTime localTime = LocalTime.parse(strTime);
        System.out.println(localTime  +"  String converted to Time");
    }
}
