package Advance;

public class RegisterService {
    Register [] people = new Register[4];

    public RegisterService() {
        people[0] = new Register(1, "sam", "uel", 20, "samuelsiant11@gmail.com", "samuel134235", "TK");
        people[1] = new Register(2,"Hok", "Sean", 30, "HokSean@gmail.com", "sdfsd2eksdfj", "PP");
        people[2] = new Register(2,"Hok", "Sean", 30, "HokSean@gmail.com", "sdfsd2eksdfj", "PP");
        people[3] = new Register(2,"Hok", "Sean", 30, "HokSean@gmail.com", "sdfsd2eksdfj", "PP");
    }

    public void displayRegister () {
        for(Register r : people) {
            System.out.println(r.toString());
        }
    }
}
