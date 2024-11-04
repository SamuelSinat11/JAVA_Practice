package OOP.hierarchy;

public class Car extends Vehicle {

    private int numSeats;

    public Car(String make, String model, int year, String fuelType, String energyEfficiency) {
        super(make, model, year, fuelType, energyEfficiency);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 0;
    }

    @Override
    public double calculateDistanceTraveled() {
        return 0;
    }

    @Override
    public double getMaxSpeed() {
        return 120;
    }


}
