package OOP.hierarchy;

public abstract class Vehicle {
    private final String make;
    private final String model;
    private final int year;
    private final String fuelType;
    private final String energyEfficiency;

    public Vehicle(String make, String model, int year, String fuelType, String energyEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.energyEfficiency = energyEfficiency;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getFuelType() {
        return fuelType;
    }
    public String getEnergyEfficiency() {
        return energyEfficiency;
    }


    public abstract double calculateFuelEfficiency();
    public abstract double calculateDistanceTraveled();

    // Override the getMaxSpeed method from the superclass (Vehicle)
    public abstract double getMaxSpeed();
}
