package OOP.hierarchy;

public class MotorCycle extends Vehicle {

    private double engineDisplacement;

    public MotorCycle(String make, String model, int year, String fuelType, String energyEfficiency, double engineDisplacement) {
        super(make, model, year, fuelType, energyEfficiency);
        this.engineDisplacement = engineDisplacement;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
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
        return 180;
    }
}
