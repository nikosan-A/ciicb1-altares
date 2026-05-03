package task13java;

// Car.java
public class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); // call Vehicle constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
