public abstract class Ride {
    private String driverName;
    private String vehicleNumber;
    protected double distance;
    
    public Ride(String driverName, String vehicleNumber, double distance) {
        this.driverName = driverName;
        this.vehicleNumber = vehicleNumber;
        this.distance = distance;
    }
    
    public String getDriverName() {
        return driverName;
    }
    
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    
    public double getDistance() {
        return distance;
    }
    
    public abstract double calculateFare();
    
    public void displayRideDetails() {
        System.out.println("Driver: " + driverName);
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + calculateFare());
    }
}