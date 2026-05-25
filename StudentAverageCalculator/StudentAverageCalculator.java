/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentAverageCalculator;

/**
 *
 * @author mohamme-pe23025
 */
public class StudentAverageCalculator {
    private int totalMarks;
    private int numberOfStudents;

    public StudentAverageCalculator(int totalMarks, int numberOfStudents) {
        this.totalMarks = totalMarks;
        this.numberOfStudents = numberOfStudents;
    }

    public int calculateAverage() {
        return totalMarks / numberOfStudents;
    }
}
