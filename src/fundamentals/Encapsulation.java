package fundamentals;

class Human{
    private String name;
    private int age;

    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int newAge) { age = newAge; }
    public void setName(String newName) { name = newName; }
}


public class Encapsulation {

    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(21);
        obj.setName("Akash");
        System.out.println(obj.getName() + " " + obj.getAge());
    }
}
