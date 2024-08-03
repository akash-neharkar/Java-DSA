package fundamentals;

interface Lamda{
    void ex();
}


public class LamdaExpression {
    public static void main(String[] args) {
        Lamda obj = () -> // Lamda Expression "->" used to replace a few words of syntax which are known by Java
            System.out.println("I am in show");  //Curly brackets and ; is removed bcoz its just a one line method

            obj.ex();
    }
}
