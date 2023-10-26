package facadePattern;
import java.util.*;
public class HotelApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FrontDesk frontDesk = new FrontDesk();
        while (true) {
            System.out.println("Hotel Application");
            System.out.println("Service/s Available: ");
            System.out.println("[1] Valet Service");
            System.out.println("[2] Housekeeping Service");
            System.out.println("[3] Cart Service");
            System.out.println("[4] Exit");
            System.out.print("Choose a number for your choice of service: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                String plateNumber = "";
                System.out.print("Enter your plate number: " );
                plateNumber = sc.nextLine();
                Valet valet = new Valet(plateNumber);
                frontDesk.requestServices(valet);
            } else if (choice == 2) {
                String roomNumber;
                System.out.print("Enter your room number: ");
                roomNumber = sc.nextLine();
                HouseKeeping houseKeeping = new HouseKeeping(roomNumber);
                frontDesk.requestServices(houseKeeping);
            } else if (choice == 3) {
                int numberOfCarts = 0;
                System.out.print("Enter your desired cart number: ");
                numberOfCarts = sc.nextInt();
                sc.nextLine();
                Cart cart = new Cart(numberOfCarts);
                frontDesk.requestServices(cart);
            } else if (choice == 4) {
                System.out.println("Exiting the program...");
                break;
            } else {
                System.out.println("Invalid choice! Please input again.");
            }
        }
    }
}