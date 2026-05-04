package Question01;

public class DeliveryChargeTest {

    public static void main(String[] args) {

        // This is compile-time polymorphism: Java decides which calculateCharge()
        // method to call at COMPILE TIME based on the number and types of arguments.

        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        // Method 1: base charge only
        double charge1 = calculator.calculateCharge(200.0);
        System.out.println("Base charge only:                      Rs. " + charge1);

        // Method 2: base charge + distance
        double charge2 = calculator.calculateCharge(200.0, 3.0);
        System.out.println("Base charge + 3 km distance:           Rs. " + charge2);

        // Method 3: base charge + distance + weight
        double charge3 = calculator.calculateCharge(200.0, 3.0, 2.0);
        System.out.println("Base charge + 3 km + 2 kg weight:      Rs. " + charge3);

        // Method 4a: base charge + express delivery (selected)
        double charge4a = calculator.calculateCharge(200.0, true);
        System.out.println("Base charge + express delivery (YES):  Rs. " + charge4a);

        // Method 4b: base charge + no express delivery
        double charge4b = calculator.calculateCharge(200.0, false);
        System.out.println("Base charge + express delivery (NO):   Rs. " + charge4b);
    }
}
