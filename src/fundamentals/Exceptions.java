package fundamentals;


public class Exceptions {
    public static void main(String[] args) {
        int i = 9;
        int j = 18;

        //Exception handling. If we give i = 0, it will print catch statement and continue or else print result
        try {
            int result = j / i;
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println("Something went wrong...");
        }

        System.out.println("Continue");

        //Multiple catch
        int n1 = 5;
        int n2 = 2;
        int [] arr = new int[5];

        try{
            int result = n1/n2;
            System.out.println(result);
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limits");
        }
        catch (Exception e){
            System.out.println("Something went wrong..");
        }
        System.out.println("continue");
    }
}
