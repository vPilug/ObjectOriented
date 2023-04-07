package OOP.vehicle;

public class Duster extends Dacia{

    public Duster(float availableFuel, String chassisNumber) {
        super(90, "Benzine", 5, 8.7F, availableFuel, 17, chassisNumber);
    }

    @Override
    public void stop() {
        System.out.println("Duster stopped!");
    }
}


