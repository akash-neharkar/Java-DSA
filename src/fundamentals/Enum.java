package fundamentals;

import javax.swing.plaf.synth.SynthOptionPaneUI;

enum Status{
    Running, Failed, Pending, Success;
}

public class Enum {
    public static void main(String[] args) {
        Status s = Status.Success; //Printing Status
        System.out.println(s);
        Status r = Status.Running;
        System.out.println(r.ordinal()); //print ordinal or index of Running
        Status [] all = Status.values();
        System.out.println(all[0]); // To print the values

        for(Status i : all) {  //To print all values
            System.out.println(i);
        }

        //Switch Case with enum (Can also use if else):
        switch (s){
            case Running -> System.out.println("All Good");
            case Failed -> System.out.println("Try Again");
            case Pending -> System.out.println("Please Wait");
            case Success -> System.out.println("Done");
        }

    }
}
