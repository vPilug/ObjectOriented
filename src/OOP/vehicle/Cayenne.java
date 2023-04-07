package OOP.vehicle;

public class Cayenne extends Porche{
    public Cayenne(float availableFuel, String chassisNumber) {
        super(100,"Benzine" , 6, 17.8F, availableFuel, 18, chassisNumber);
    }

    @Override
    public void stop() {
        System.out.println("Cayenne stopped!");
    }
}
