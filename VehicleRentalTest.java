package Question02;

public class VehicleRentalTest {

    public static void main(String[] args) {

        // This is runtime polymorphism: even though vehicle1 and vehicle2 are declared
        // as Vehicle references, Java calls the overridden calculateRentalCost() of the
        // actual object type (Car or Bike) at RUNTIME, not the parent version.

        Vehicle vehicle1 = new Car("CAR-001", "Toyota", 5, 3500.0);
        Vehicle vehicle2 = new Bike("BIKE-001", "Honda", 8, 250.0);

        // --- Car ---
        System.out.println("===== Car Rental =====");
        vehicle1.displayVehicleInfo();
        double carCost = vehicle1.calculateRentalCost();
        System.out.println("Total Rental Cost : Rs. " + carCost);

        System.out.println();

        // --- Bike ---
        System.out.println("===== Bike Rental =====");
        vehicle2.displayVehicleInfo();
        double bikeCost = vehicle2.calculateRentalCost();
        System.out.println("Total Rental Cost : Rs. " + bikeCost);
    }
}
