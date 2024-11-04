package OOP.hierarchy;

public class Truck extends Vehicle {

    private double CaroCapacity;

    public Truck(String make, String model, int year, String fuelType, String energyEfficiency, double CaroCapacity) {
        super(make, model, year, fuelType, energyEfficiency);
        this.CaroCapacity = CaroCapacity;
    }
    public double getCaroCapacity() {
        return CaroCapacity;
    }
    public void setCaroCapacity(double CaroCapacity) {
        this.CaroCapacity = CaroCapacity;
    }
    @Override
    public double calculateFuelEfficiency() {
        // Implementation for fuel efficiency calculation for trucks
        return getFuelEfficiency() * (1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
    }

    private double getCargoCapacity() {
        return 0;
    }

    private double getFuelEfficiency() {
        return 0;
    }

    @Override
    public double calculateDistanceTraveled() {
        // Implementation for distance traveled calculation for trucks
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    // Override the getMaxSpeed method from the superclass (Vehicle)
    @Override
    public double getMaxSpeed() {
        // Implementation for maximum speed calculation for trucks
        return 80.0;
    }

}
