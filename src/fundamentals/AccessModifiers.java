package fundamentals;

public class AccessModifiers {
    public static void main(String[] args) {
        System.out.println("Below are the Access Modifiers");

        //                                    Private    Protected    Public    Default
        //Same Class                           Yes         Yes         Yes        Yes
        //Same Package subclass                 No         Yes         Yes        Yes
        //Same Package non-subclass             No         Yes         Yes        Yes
        //Different Package subclass            No         Yes         Yes        No
        //Different Package non-subclass        No         No          Yes        No

    }
}
