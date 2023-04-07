package OOP.vehicle;

public abstract class Car implements Vehicle {
    private final int fuelTankSize;
    private final String fuelType;
    private final int gears;
    private final float consumptionPer100Km;
    private float availableFuel;
    private int tireSize;
    private String chassisNumber;
    private int currentGear = 0;
    private boolean startedCar;

    public Car(int fuelTankSize, String fuelType, int gears, float consumptionPer100Km, float availableFuel, int tireSize, String chassisNumber) {
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100Km;
        this.availableFuel = availableFuel;
        setTireSize(tireSize);
        this.chassisNumber = chassisNumber;
    }

    public float getAvailableFuel() {
        return availableFuel;
    }

    public float getAverageFuelConsumption() {
        return consumptionPer100Km;
    }

    public void start() {
        startedCar = true;
        shiftGear(0);
    }

    public void drive(double distance) {
        if(availableFuel <= 5) {
            System.out.println("WARNING: fuel level is low: " + availableFuel);
        }
        if(currentGear != 0 && startedCar) {
            //consumedFuel = consumed fuel default + consumed fuel by current gear + consumed fuel by tire size
            float consumedFuel = (float) distance * consumptionPer100Km * 0.1F * (gears - currentGear)
                    * 0.05F * tireSize;
            if(consumedFuel > availableFuel) {
                System.out.println("We can't drive this distance: " + distance + ". Fuel low!");
            } else {
                availableFuel = availableFuel - consumedFuel;
            }
        } else {
            System.out.println("The car is in neutral gear! --> she doesn't move");
        }
    }

    public void shiftGear(int currentGear) {
        if(currentGear <= gears && currentGear >= 0) {
            this.currentGear = currentGear;
        } else {
            System.out.println("The gears are between 0 and " + gears);
        }
    }

    public void setTireSize(int tireSize) {
        if (tireSize >= 15 && tireSize <= 21) {
            this.tireSize = tireSize;
        } else {
            System.out.println("The tire size are between 15 and 21");
        }
    }
}


