public class RideFactory {
    public static Ride createRide(String rideType, double distance) throws InvalidRideTypeException {
        switch (rideType.toLowerCase()) {
            case "bike":
                return new BikeRide("Raj Bhau", "MH01AB0001", distance);
            case "car":
                return new CarRide("Kanishk Salunkhe", "MH12BC0004", distance);
            default:
                throw new InvalidRideTypeException("Invalid ride type: " + rideType + ". Please choose 'bike' or 'car'.");
        }
    }
}