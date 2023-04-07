package OOP.vehicle;

public class Panamera extends Porche{
    public Panamera(float availableFuel, String chassisNumber) {
        super(48, "Benzine", 6, 10.2F, availableFuel, 19, chassisNumber);
    }

    @Override
    public void stop() {
        System.out.println("Panamera stopped!");
    }
}

