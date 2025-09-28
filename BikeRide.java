public class BikeRide extends Ride {
    private static final double FARE_PER_KM = 10.0;

    public BikeRide(String driverName, String vehicleNumber, double distance) {
        super(driverName, vehicleNumber, distance);
    }

    @Override
    public double calculateFare() {
        return distance * FARE_PER_KM;
    }
}