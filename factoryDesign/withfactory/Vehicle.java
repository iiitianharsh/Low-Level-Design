package factoryDesign.withfactory;

public abstract class Vehicle {
    // Constructor to prevent direct instantiation
    protected Vehicle() {
    }

    // Abstract method to be implemented by subclasses
    public abstract void printVehicle();
}
