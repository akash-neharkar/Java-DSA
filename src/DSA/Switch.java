package DSA;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the fruit name: ");
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Apple":
                System.out.println("Healthy fruit");
                break;
            case "Orange":
                System.out.println("An orange fruit");
                break;
            case "Watermelon":
                System.out.println("Hydrating Fruit");
                break;
            case "Banana":
                System.out.println("Energy giving Fruit");
                break;
            default:
                System.out.println("No such fruit in database!");
        }

//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruit");
//            case "Apple" -> System.out.println("Healthy fruit");
//            case "Orange" -> System.out.println("An orange fruit");
//            case "Watermelon" -> System.out.println("Hydrating Fruit");
//            case "Banana" -> System.out.println("Energy giving Fruit");
//            default -> System.out.println("No such fruit in database!");
//        }
    }
}
