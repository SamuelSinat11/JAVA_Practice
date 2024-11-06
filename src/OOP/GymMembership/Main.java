package OOP.GymMembership;

public class Main {
    public static void main(String[] args) {
        GymMembership basicMember = new GymMembership("Samuel","Monthly",6);
        PremiumMembership premiumMembership = new PremiumMembership("Jonh Wick", "Annual", 12, true,true);

        System.out.println("Basic Membership Details");
        basicMember.displayDetails();

        System.out.println("===========================");
        System.out.println("Premium Membership Details");
        premiumMembership.displayDetails();

    }
}
