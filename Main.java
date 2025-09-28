import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter ride type (bike/car): ");
            String rideType = scanner.nextLine().trim();
            
            System.out.print("Enter distance in kilometers: ");
            double distance = scanner.nextDouble();
            
            if (distance <= 0) {
                System.out.println("Error: Distance must be greater than 0.");
                return;
            }
            
            Ride ride = RideFactory.createRide(rideType, distance);
            
            System.out.println("\n--- Ride Details ---");
            ride.displayRideDetails();
            
        } catch (InvalidRideTypeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid distance.");
        } finally {
            scanner.close();
        }
    }
}