package lab_08;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shiraf
 */
public class StudentDisplayMain {

    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();

        studentDAO.displayAllStudents();
    }
}