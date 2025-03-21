public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }

    public boolean validateLicensePlate(){
      if (hasTrailer){
          String finalTwo = getLicensePlate().substring(getLicensePlate().length() - 2);
          boolean valid = (finalTwo.equals("MX") && axles > 4 || (finalTwo.equals("LX") && axles <= 4));
          return valid;
      }
      else{
          return true;
      }    
    }

    public void printTruck(){
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Number of Axles: " + getAxles());
        System.out.println("Has Trailer? " + hasTrailer());
    }
  }