package fundamentals;

public class ThisAndSuper {

    static class A{
        public A(){
            super();
            System.out.println("In A");
        }

        public A(int a){
            super();
            System.out.println("In A int");
        }
    }

    static class B extends A{
        public B(){
            super(4);
            System.out.println("In B");
        }

        public B(int a){
            super(a);
            System.out.println("In B int");
        }
    }

    public static void main(String[] args) {
        B obj = new B();
    }
}
