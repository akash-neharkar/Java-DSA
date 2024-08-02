package DSA;

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
    }
}


