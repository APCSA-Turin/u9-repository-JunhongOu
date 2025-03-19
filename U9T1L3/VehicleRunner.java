public class VehicleRunner {
    public static void main(String[] args) {
        // -------------- LAB PART 1 -----------------
        // a. write code to create a Vehicle object with license "MC56WQ",
        //    toll fee of 10.75, and 5 passengers.
        //    Print out the calculated toll TollPrice.

        Vehicle obj1 = new Vehicle("MC56WQ", 10.75, 5);
        System.out.println(obj1.calculateTollPrice());
        System.out.println();




        // b. write code to create an electric Car with license "KXN73F",
        //    toll fee of 8.50, and 2 passengers.
        //    Print out the calculated toll price

        Car obj2 = new Car("KXN73F", 8.50, 2, true);
        System.out.println(obj2.calculateTollPrice());




        // c. add a printCar() void method to the Car class that prints the
        //    Car's license plate, toll fee, number of passengers, whether it is electric,
        //    and whether a discount has been applied.
        //
        // d. call the method on the Car you made in c to test it.

        obj2.printCar();
        System.out.println();




        // e. write code to create a Truck with license "3K9JMX",
        //    a toll fee of 24.75, 4 passengers, 6 axles, with a trailer.
        //    Print out the calculated toll price

        Truck obj3 = new Truck("3K9JMX", 24.75, 4, 6, true);
        System.out.println(obj3.calculateTollPrice());
        




        // f. add a printTruck() void method to the Truck class that prints the
        //    Truck's license plate, toll fee, number of passengers, number of axles,
        //    and whether it has a trailer.
        //
        // g. call the method on the Truck you made in e to test it.
        obj3.printTruck();
        System.out.println();



        // ------------ LAB PART 2 ---------------
        // ----- instructions in lab sheet -------



        // ------------ LAB PART 3 ---------------
        // ----- instructions in lab sheet -------



    }
}