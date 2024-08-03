package fundamentals;

class first{
    public void show(){
        System.out.println("In first show");
    }
}


public class AnonymousInner {
    public static void main(String[] args) {
        first obj = new first()
            {
                public void show(){
                    System.out.println("In anonymous class show"); //This is an anonymous class as there's no name
                }
            };
        obj.show();
    }
}
