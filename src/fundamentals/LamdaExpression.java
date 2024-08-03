package fundamentals;

interface Lamda{
    void ex();
}

interface Lamda2{
    void ex2(int i);
}


public class LamdaExpression {
    public static void main(String[] args) {
        Lamda obj = () -> // Lamda Expression "->" used to replace a few words of syntax which are known by Java
            System.out.println("I am in show");  //Curly brackets and ; is removed bcoz its just a one line method
            obj.ex();

        Lamda2 obj2 = i -> System.out.println("I am in Lamda2");
        obj2.ex2(5); //Lamda expression with parameters
    }
}
