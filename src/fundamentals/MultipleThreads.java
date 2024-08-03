package fundamentals;

class Thread1 extends Thread{
    public void run(){
        for (int i = 1; i < 50; i++) {
            System.out.println("Hii");
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        for (int i = 1; i < 50; i++) {
            System.out.println("Hello");
        }
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        //obj1.setPriority(Thread.MAX_PRIORITY); // This can be used to set a priority. Starting from 1 to 10 or Predefined functions.
        obj1.start();
        obj2.start();
    }
}
