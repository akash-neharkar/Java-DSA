package fundamentals;

class Computer{
    public void code(){
    }
}

class Laptop extends Computer{
    public void code(){
        System.out.println("Code Compile Run");
    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println("Code Compile Run: Faster");
    }
}

class Developer{
    public void devapp(Computer Comp){
        Comp.code();
    }
}

public class MoreOfInterface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer akash = new Developer();
        akash.devapp(desk);
    }
}
