package fundamentals;

abstract class Car{

    abstract public void drive();

    public void music(){
        System.out.println("Play Music!");
    }
}

class WagonR extends Car{
    public void drive(){
        System.out.println("Driving Suzuki!");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.drive();
    }
}
