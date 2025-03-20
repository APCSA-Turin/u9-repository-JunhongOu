public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;
    
    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
      super(licensePlate, tollFee, passengers);
      this.electric = electric;
      discountApplied = false;   // default value
    }
  
    public boolean isElectric() {
      return electric;
    }
  
    public boolean isDiscountApplied() {
      return discountApplied;
    }

    public void setDiscountApplied(boolean discount){
      discountApplied = discount;
    }

    public boolean dropOffPassengers(int numOut){
        int currentPassengers = getPassengers();

        if (numOut < currentPassengers){
           setPassengers(currentPassengers - numOut);
           return true;
        }
        else{
            return false;
        }
    }

      public void applyDiscount(){
        if (!isDiscountApplied()){
           if (isElectric()){
            double fee = getTollFee() * 0.5;
            setTollFee(fee);
            discountApplied = true;
           }
        }
      }

    public void printCar(){
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Electric? " + isElectric());
        System.out.println("Discount applied? " + isDiscountApplied());
    }
  }