package OOP.GymMembership;

class PremiumMembership extends GymMembership {

    boolean personalTrainerAvailable;
    boolean spaAccess;
    public PremiumMembership(String name, String membershipType, int duration,boolean personalTrainerAvailable, boolean spaAccess) {
        super(name, membershipType, duration);
        this.personalTrainerAvailable = personalTrainerAvailable;
        this.spaAccess = spaAccess;
    }

    @Override
    public double calculateFees() {
        double baseFee = super.calculateFees();
        double additionalFee = 0.0;

        if (personalTrainerAvailable) {
            additionalFee += 30.0 * duration;
        }
        if (spaAccess) {
            additionalFee += 20.0 * duration;
        }
        return baseFee + additionalFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Personal trainer available:" + (personalTrainerAvailable ?  "Yes" : "No"));
        System.out.println("Spa access:" + (spaAccess ?  "Yes" : "No"));
    }
}
