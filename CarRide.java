public class CarRide extends Ride {
    private static final double FARE_PER_KM = 20.0;
    
    public CarRide(String driverName, String vehicleNumber, double distance) {
        super(driverName, vehicleNumber, distance);
    }
    
    @Override
    public double calculateFare() {
        return distance * FARE_PER_KM;
    }
}