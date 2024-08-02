package fundamentals;

class Calculator{
    public int add(int n1, int n2) {
        return n1+n2;
    }
}

class AdvanceCalculator{
    public int add(int n1, int n2){
        return n1+n2+1;
    }
}

public class Overriding {
    public static void main(String[] args) {
        System.out.println("This is method fundamentals.Overriding!");

        AdvanceCalculator obj = new AdvanceCalculator();
        int r1 = obj.add(3,3);
        System.out.println(r1);
    }
}
