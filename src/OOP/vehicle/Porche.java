package OOP.vehicle;

public abstract class Porche extends Car{
    public Porche(int fuelTankSize, String fuelType, int gears, float consumptionPer100Km, float availableFuel, int tireSize, String chassisNumber) {
        super(fuelTankSize, fuelType, gears, consumptionPer100Km, availableFuel, tireSize, chassisNumber);
    }
}
