/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentAverageCalculator;

/**
 *
 * @author mohamme-pe23025
 */
public class StudentAverageTest {
     public static void main(String[] args) {

        StudentAverageCalculator calculator =
                new StudentAverageCalculator(500, 0);

        try {
            int average = calculator.calculateAverage();
            System.out.println("Average: " + average);
        }
        catch (ArithmeticException e) {
            // This exception occurs because a number cannot be divided by zero.
            System.out.println("Error: Number of students cannot be zero.");
        }
        finally {
            System.out.println("Average calculation completed.");
        }

        System.out.println("Program continues...");
    }
}
