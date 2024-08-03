package fundamentals;

//class - class --> extends
//class - interface --> implements
//interface - interface --> extends

interface I{
    int age = 22; //Variables in interface are by default Final and static
    String area = "Nerul";

    public void bmw();
    public void mercedes();
}

class N implements I{
    public void bmw(){
        System.out.println("Sitting in BMW");
    }
    public void mercedes(){
        System.out.println("Sitting in mercedes");
    }
}

public class Interface {
    public static void main(String[] args) {
        N obj = new N();
        obj.bmw();
        obj.mercedes();
        System.out.println(I.age);
        System.out.println(I.area);
    }
}
