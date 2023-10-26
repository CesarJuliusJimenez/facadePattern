package facadePattern;
public class Cart implements HotelServices {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }
    public void requestCart(int numberOfCarts) {
        System.out.println("A total of " + numberOfCarts + " has been requested.");
        System.out.println();
    }
    @Override
    public void implementingService() {
        requestCart(numberOfCarts);
    }
}