package lab_08;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shiraf
 */
public class StudentInsertMain {

    public static void main(String[] args) {

        Student student = new Student(1, "Nimal Perera", 82);

        StudentDAO studentDAO = new StudentDAO();

        studentDAO.addStudent(student);
    }
}