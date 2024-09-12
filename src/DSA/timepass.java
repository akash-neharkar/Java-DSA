package DSA;

import java.util.ArrayList;

public class timepass {
    public static void main(String[] args) {

        class Mobile{
            String brand;
            int price;
            static String name;

            public void show(){
                System.out.println(brand + " : " + price + " : " + name);
            }
            public static void show1(){
                System.out.println("I am static");

            }

        }
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "Smartphone";

        obj1.show();
        obj2.show();
        Mobile.show1();


        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(12);
        list.add(11);
        list.add(12);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(11);
        list.add(22);
        list.add(32);
        list.add(42);
        list.add(162);
        list.add(121);
        list.add(188);

        System.out.println(list);

        String a = new String("Akash");
        String b = new String("Akash");
        System.out.println(a==b);

    }
}


