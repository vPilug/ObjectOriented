package OOP.vehicle;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        Car car = new Dacia(27, "oiqe0934hkkadsn");

        Car car = new Logan(27, "oiqe0934hkkadsn");
        car.start();

        car.shiftGear(1);

        car.drive(0.01);

        car.shiftGear(2);

        car.drive(0.02);

        car.shiftGear(3);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(5);

        car.drive(10);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(3);

        car.drive(0.1);

        car.stop();

        float availableFuel = car.getAvailableFuel();
        System.out.println("Available fuel Logan: " + availableFuel);

        float fuelConsumedPer100Km = car.getAverageFuelConsumption();
        System.out.println("Fuel consumed/100 Km Logan: " + fuelConsumedPer100Km);
        System.out.println("_________");

        Car duster = new Duster(45, "WP2YYYY7BSGA84372");
        duster.start();
        duster.shiftGear(1);
        duster.drive(0.2);
        duster.shiftGear(2);
        duster.drive(1);
        duster.shiftGear(1);
        duster.drive(0.5);
        duster.stop();
        float availableFuelDuster = duster.getAvailableFuel();
        System.out.println("Available fuel Duster: " + availableFuelDuster);

        float fuelConsumedPer100KmDuster = duster.getAverageFuelConsumption();
        System.out.println("Fuel consumed/100 Km Duster: " + fuelConsumedPer100KmDuster);
        System.out.println("_________");

        Car cayenne = new Cayenne(70, "WP1ZZZ9YZLDA94258");
        cayenne.start();
        cayenne.shiftGear(1);
        cayenne.drive(0.5);
        cayenne.shiftGear(2);
        cayenne.drive(1.0);
        cayenne.shiftGear(3);
        cayenne.drive(0.8);
        cayenne.shiftGear(4);
        cayenne.drive(5.0);
        cayenne.shiftGear(3);
        cayenne.drive(4.0);
        cayenne.shiftGear(2);
        cayenne.drive(3.0);
        cayenne.shiftGear(1);
        cayenne.drive(0.5);
        cayenne.stop();

        float availableFuelCayenne = cayenne.getAvailableFuel();
        System.out.println("Available fuel Cayenne: " + availableFuelCayenne);

        float fuelConsumedPer100KmCayenne = cayenne.getAverageFuelConsumption();
        System.out.println("Fuel consumed/100 Km Cayenne: " + fuelConsumedPer100KmCayenne);
        System.out.println("_________");

        Car panamera = new Panamera(56, "VT6WWWW9NYWX75003");

        panamera.start();
        panamera.shiftGear(1);
        panamera.drive(0.08);
        panamera.shiftGear(2);
        panamera.drive(1);
        panamera.shiftGear(3);
        panamera.drive(3);
        panamera.shiftGear(4);
        panamera.drive(12);
        panamera.shiftGear(3);
        panamera.drive(3);
        panamera.shiftGear(2);
        panamera.drive(0.5);
        panamera.shiftGear(1);
        panamera.drive(0.02);
        panamera.stop();

        panamera.start();
        panamera.shiftGear(1);
        panamera.drive(0.5);
        panamera.stop();

        float availableFuelPanamera = panamera.getAvailableFuel();
        System.out.println("Available fuel Panamera: " + availableFuelPanamera);

        float fuelConsumedPer100KmPanamera = panamera.getAverageFuelConsumption();
        System.out.println("Fuel consumed/100 Km Panamera: " + fuelConsumedPer100KmPanamera);
        System.out.println("_________");


        Vehicle vehicle = new Cayenne(30, "1987ddkshik289");

        vehicle.start();

        vehicle.drive(1);

        vehicle.stop();

        Car car1 = (Car) vehicle;

        float availableFuelC = car1.getAvailableFuel();
        System.out.println("Available fuel another Cayenne: " + availableFuelC);
        float fuelConsumedPer100KmC = car1.getAverageFuelConsumption();
        System.out.println("Fuel consumed/100 Km another Cayenne: " + fuelConsumedPer100KmC);
        System.out.println("_________");
    }
}
