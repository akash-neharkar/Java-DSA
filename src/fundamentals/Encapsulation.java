package fundamentals;

class Human{
    private String name = "Akash";
    private int age = 21;

    public Human(){
        System.out.println("I am in constructor!");
    }

    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human();
//        obj.name = "Akash";
//        obj.age = 21;
        System.out.println(obj.getName() + " " + obj.getAge());
    }
}
