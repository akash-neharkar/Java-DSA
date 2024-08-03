package fundamentals;

class A{
     int a = 30;

     public void show(){
         System.out.println("In show A");
     }

     class B{
         public void show(){
             System.out.println("In show B");
         }
     }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.show();
    }
}
