package time_manager;

import java.text.ParseException;
import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hour");
        String hr = sc.next();
        System.out.println("Enter minutes");
        String  min = sc.next();
        System.out.println("Enter seconds");
        String sec = sc.next();

TimeManager timeManager = new TimeManager(hr,min,sec);
timeManager.displayTime();
    }
}
