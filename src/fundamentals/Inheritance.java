package fundamentals;

public class Inheritance {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(2,3);
        System.out.println(r1);
        int r2 = obj.sub(5,4);
        System.out.println(r2);
        int r3 = obj.multi(3,3);
        System.out.println(r3);
        int r4 = obj.div(3,3);
        System.out.println(r4);
        double r5 = obj.power(3,3);
        System.out.println(r5);
    }
}
