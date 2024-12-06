package Advance.Enum;

enum Status {
    Running, Failed, Pending, Success;
}

public class Demo {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);

        Status [] ss = Status.values();
        System.out.println(ss[2]);

        Status complier = Status.Running;

        switch (complier) {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Something went wrong");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done");
                break;
        }

        Status test = Status.Pending;
        if(test == Status.Running)
            System.out.println("All Good");
        else if (test == Status.Failed)
            System.out.println("Try Again ");
        else if (test == Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");
    }
}
