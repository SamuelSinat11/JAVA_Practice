package OOP.GymMembership;

public class GymMembership {
    private String name;
    private String membershipType;
    int duration;

    public GymMembership(String name, String membershipType, int duration) {
        this.name = name;
        this.membershipType = membershipType;
        this.duration = duration;
    }

    public double calculateFee() {
        double baseFee = 50.0;
        return baseFee * duration;
    }

    public String checkSpecialOffers() {
        if (membershipType.equalsIgnoreCase("annual")) {
            return "10% discount on annual membership";
        } else {
            return "No special offers";
        }
    }

    public void displayDetails() {
        System.out.println("Member Name:" + name);
        System.out.println("Membership Type:" + membershipType);
        System.out.println("Duration:" + duration + "months");
        System.out.println("Membership Fees:" + calculateFee());
        System.out.println("SpecialOffers:" + checkSpecialOffers());
    }

    public double calculateFees() {
        return 0;
    }
}
