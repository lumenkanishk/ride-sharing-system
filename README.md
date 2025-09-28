# Ride Sharing System

A Java-based simulation of a ride-sharing service that calculates fares for different vehicle types. Implements object-oriented programming concepts with abstraction, inheritance, and exception handling.

# How to Use

1. Compile all Java files:
```
javac *.java
```
2. Run the program:
```
java Main
```
Follow the prompts to enter ride type and distance.
```
Enter ride type (bike/car): car
Enter distance in kilometers: 25
```
# Features
- Abstract Class Implementation: Ride class with encapsulated fields and abstract fare calculation method
- Inheritance Hierarchy: BikeRide and CarRide subclasses with specific fare calculations
- Exception Handling: Custom InvalidRideTypeException for invalid inputs
- Factory Pattern: RideFactory for creating appropriate ride objects based on user input

code by Kanishk
