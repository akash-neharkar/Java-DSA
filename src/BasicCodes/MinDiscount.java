package BasicCodes;
import java.util.*;

public class MinDiscount {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter number of items: ");
            int n = sc.nextInt();
            sc.nextLine();

            // Initialize variables to keep track of minimum discount
            int minDiscount = Integer.MAX_VALUE;
            List<String> minDiscountItems = new ArrayList<>();

            // Process each item
            for (int i = 0; i < n; i++) {
                // Read the item details
                System.out.println("Enter details (Item_name, price, discount): ");
                String line = sc.nextLine();
                String[] parts = line.split(",");

                // Extract item name, price, and discount percentage
                String itemName = parts[0].trim();
                int price = Integer.parseInt(parts[1].trim());
                int discount = Integer.parseInt(parts[2].trim());

                // Update minimum discount and list of items with minimum discount
                if (discount < minDiscount) {
                    minDiscount = discount;
                    minDiscountItems.clear();
                    minDiscountItems.add(itemName);
                } else if (discount == minDiscount) {
                    minDiscountItems.add(itemName);
                }
            }

            // Print the items with the minimum discount
            for (String item : minDiscountItems) {
                System.out.println(item);
            }

            sc.close();
        }
    }

