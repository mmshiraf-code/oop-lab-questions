package Question01;

public class DeliveryChargeCalculator {

    // Fixed rates
    private static final double DISTANCE_RATE = 100.0; // per km
    private static final double WEIGHT_RATE   = 50.0;  // per kg
    private static final double EXPRESS_CHARGE = 500.0;

    // Part A - Method 1: base charge only
    public double calculateCharge(double baseCharge) {
        return baseCharge;
    }

    // Part A - Method 2: base charge + distance charge
    public double calculateCharge(double baseCharge, double distanceKm) {
        return baseCharge + (distanceKm * DISTANCE_RATE);
    }

    // Part B - Method 3: base charge + distance charge + weight charge
    public double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        return baseCharge + (distanceKm * DISTANCE_RATE) + (weightKg * WEIGHT_RATE);
    }

    // Part B - Method 4: base charge + express delivery charge (if selected)
    public double calculateCharge(double baseCharge, boolean expressDelivery) {
        if (expressDelivery) {
            return baseCharge + EXPRESS_CHARGE;
        }
        return baseCharge;
    }
}
