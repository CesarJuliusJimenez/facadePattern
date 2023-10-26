package facadePattern;
public class HouseKeeping implements HotelServices {
    private String roomNumber;

    public HouseKeeping(String roomNumber){
        this.roomNumber = roomNumber;
    }
    public void cleanRoom(String roomNumber) {
        System.out.println("Housekeeping service is now in process with room number " + roomNumber);
        System.out.println();
    }
    @Override
    public void implementingService() {
        cleanRoom(roomNumber);
    }
}