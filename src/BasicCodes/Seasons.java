package BasicCodes;
import java.util.*;

public class Seasons {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.println("Enter the number of month: ");
        int month = in.nextInt();

        if(month>=3 && month <=5){
            System.out.println("Spring Season!");
        }
        else if(month>=6 && month <=8){
            System.out.println("Summer Season!");
        }
        else if(month>=9 && month <=11){
            System.out.println("Autumn Season!");
        }
        else if (month == 12 || month<=2){
            System.out.println("Winter Season!");
        }
        else {
            System.out.println("Invalid Month!");
        }
    }
}

