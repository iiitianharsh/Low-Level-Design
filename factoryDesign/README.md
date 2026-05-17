# Factory Method Design Pattern

## 1. Without Factory Method
In the `withoutfactory` package, the `Client` is tightly coupled to the specific types of vehicles (`TwoWheeler` and `FourWheeler`). It handles both conditional logic and object creation.

**Issues with this approach:**
- **Tight Coupling:** The client depends directly on the concrete product classes.
- **Violation of SRP (Single Responsibility Principle):** The client handles both product creation and usage.
- **Hard to Extend:** In order to add a new vehicle class, we have to modify the `Client` logic (adding more conditional branches).

## 2. With Factory Method
In the `withfactory` package, we use the **Factory Method Design Pattern** to resolve the issues above. This pattern provides a structured approach for creating objects.

- **Product Interface:** Abstract `Vehicle` class ensuring a standard API for products.
- **Concrete Products:** `TwoWheeler` and `FourWheeler` specify individual vehicle behaviors.
- **Factory Interface:** `VehicleFactory` interface with the `createVehicle()` method.
- **Concrete Factories:** `TwoWheelerFactory` and `FourWheelerFactory` implement the object creation logic specific to the vehicles.

**Advantages:**
- Encapsulates object creation out of the client classes.
- Promotes loose coupling.
- Highly scalable—to add a new vehicle type, you only need to create a new product class and its corresponding factory class, without modifying the client or the other factories.
- Increases reusability and maintainability of the creation logic.

**Disadvantages:**
- Can introduce complexity with many more classes being added to the system.
- Might be over-engineering for extremely simple applications.
