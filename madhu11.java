// Base class
class Vehicle {
    String brand;
    String color;
    int speed;

    // Constructor
    Vehicle(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Subclass Car
class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, String color, int speed, int numberOfDoors) {
        super(brand, color, speed); // calling parent constructor
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("-------------------------");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    String type; // e.g., Sports, Cruiser, etc.

    Bike(String brand, String color, int speed, String type) {
        super(brand, color, speed);
        this.type = type;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Type: " + type);
        System.out.println("-------------------------");
    }
}

// Main class
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Creating Car object
        Car car1 = new Car("Toyota", "Red", 180, 4);

        // Creating Bike object
        Bike bike1 = new Bike("Yamaha", "Blue", 120, "Sports");

        // Display details
        System.out.println("Car Details:");
        car1.displayDetails();

        System.out.println("Bike Details:");
        bike1.displayDetails();
    }
}
