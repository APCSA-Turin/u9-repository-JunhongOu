/*public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----
        Bicycle rustyBicycle = new Bicycle("blockBlast", 2, 12);
        System.out.println(rustyBicycle.getGearCount());
        System.out.println(rustyBicycle.getName());
        System.out.println(rustyBicycle.getWheels());
        rustyBicycle.move(99);
        rustyBicycle.turn();
        rustyBicycle.brake();
        rustyBicycle.ringBell();

        Bus magicSchoolBus = new Bus("americanCheese", 8, 45);
        System.out.println(magicSchoolBus.getCapacity());
        System.out.println(magicSchoolBus.getName());
        System.out.println(magicSchoolBus.getWheels());
        magicSchoolBus.move(150);
        magicSchoolBus.turn();
        magicSchoolBus.brake();
        magicSchoolBus.majorHonk();
    }
}
*/