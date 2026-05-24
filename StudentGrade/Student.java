/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentGrade;

public class Student {

    private String name;
    private int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public String getGrade() {

        if (mark >= 75) {
            return "A";
        } else if (mark >= 65) {
            return "B";
        } else if (mark >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }
}