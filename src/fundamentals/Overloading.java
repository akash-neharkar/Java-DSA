package fundamentals;

class addition{
    public int add(int n1, int n2){
        return n1+n2;
    }

    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public double add(double n1, double n2){
        return n1+n2;
    }
}

public class Overloading {
    public static void main(String[] args) {
        addition obj = new addition();
        double r1 = obj.add(3.2,3.2);
        int r2 = obj.add(3,4,5);
        int r3 = obj.add(6,6);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
