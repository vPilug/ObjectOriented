package OOP.vehicle;

public class Logan extends Dacia {

    public Logan(float availableFuel, String chassisNumber) {
        super(80, "Diesel",5, 5.5F, availableFuel, 15, chassisNumber);
    }

    @Override
    public void stop() {
        System.out.println("Logan stopped!");

    }
}

