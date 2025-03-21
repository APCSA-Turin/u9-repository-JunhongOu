public class Taxi extends Car {
    private double fareCollected;
    
    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected){
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected(){
        return fareCollected;
    }

    public void pickupRiders(int numRiders, double farePerRider){
        setPassengers(getPassengers() + numRiders);
        double fare = numRiders * farePerRider;
        fareCollected += fare;

        if (getPassengers() >= 4 && !isDiscountApplied()){
            setTollFee(getTollFee() * 0.5);
            setDiscountApplied(true);
        }
    }

    public void printTaxi(){
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Electric? " + isElectric());
        System.out.println("Discount applied? " + isDiscountApplied());
        System.out.println("Total fare collected: " + fareCollected);
    }
}
