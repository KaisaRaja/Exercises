package week1;

public class Car {
    // Properties (fields) of the class
    String brand;
    String model;
    int year;
    //Default constructor
    public Car() {
        // Initialize default values
        brand = "Not specified";
        model = "Unknown";
        year = 2000;
    }

    //Parameterized constractor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car();
        Car car2 = new Car("Honda", "Civic", 2018);
        // Calling the method to display details of each car
        car1.displayDetails();
        car2.displayDetails();
    }
    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details: ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

}