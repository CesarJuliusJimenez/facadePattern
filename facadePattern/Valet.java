package facadePattern;
public class Valet implements HotelServices {
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }
    public void pickUpVehicle(String plateNumber) {
        System.out.println("The valet is now processing the vehicle with plate number: " + plateNumber);
        System.out.println();
    }
    @Override
    public void implementingService() {
        pickUpVehicle(plateNumber);
    }
}