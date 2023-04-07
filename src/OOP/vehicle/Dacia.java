package OOP.vehicle;

public abstract class Dacia extends Car{

    public Dacia(int fuelTankSize, String fuelType, int gears, float consumptionPer100Km, float availableFuel, int tireSize, String chassisNumber) {
        super(fuelTankSize, fuelType, gears, consumptionPer100Km, availableFuel, tireSize, chassisNumber);
    }
}

