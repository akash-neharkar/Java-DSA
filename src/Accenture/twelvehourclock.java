package Accenture;
import java.util.*;

public class twelvehourclock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter hours: ");
        int hours = in.nextInt();
        System.out.println("Enter minutes: ");
        int minutes = in.nextInt();

        clock(hours, minutes);
    }

    static void clock(int hours, int minutes) {

        String period;

        if(hours >= 12){
            period = "PM";
            if(hours > 12){
                hours -= 12;
            }
        }
        else {
            period = "AM";
            if(hours == 0){
                hours = 12;
            }
        }
        System.out.println("The time in 12 hour format = " + hours + ":" + minutes + " " + period);
    }
}
