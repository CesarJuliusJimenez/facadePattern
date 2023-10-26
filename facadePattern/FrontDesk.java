package facadePattern;
public class FrontDesk {
    public void requestServices(HotelServices hotelServices) {
        hotelServices.implementingService();
    }
}