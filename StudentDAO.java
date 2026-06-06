/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_08;

/**
 *
 * @author Shiraf
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {

    // Question 2
    public void addStudent(Student student) {

        String sql = "INSERT INTO students (student_id, student_name, mark) VALUES (?, ?, ?)";

        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, student.getStudentId());
            statement.setString(2, student.getStudentName());
            statement.setInt(3, student.getMark());

            statement.executeUpdate();

            System.out.println("Student added successfully.");

        } catch (SQLException e) {

            System.out.println("Database error: " + e.getMessage());
        }
    }

    // Question 3
    public void displayAllStudents() {

        String sql = "SELECT student_id, student_name, mark FROM students";

        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {

                System.out.println("Student ID: "
                        + resultSet.getInt("student_id"));

                System.out.println("Student Name: "
                        + resultSet.getString("student_name"));

                System.out.println("Mark: "
                        + resultSet.getInt("mark"));

                System.out.println("---------------------");
            }

        } catch (SQLException e) {

            System.out.println("Database error: " + e.getMessage());
        }
    }

    // Question 4 - Search Student
    public void findStudentById(int studentId) {

        String sql = "SELECT student_id, student_name, mark FROM students WHERE student_id = ?";

        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, studentId);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                System.out.println("Student ID: "
                        + resultSet.getInt("student_id"));

                System.out.println("Student Name: "
                        + resultSet.getString("student_name"));

                System.out.println("Mark: "
                        + resultSet.getInt("mark"));

            } else {

                System.out.println("Student not found.");
            }

        } catch (SQLException e) {

            System.out.println("Database error: " + e.getMessage());
        }
    }

    // Question 4 - Update Mark
    public void updateStudentMark(int studentId, int newMark) {

        String sql = "UPDATE students SET mark = ? WHERE student_id = ?";

        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, newMark);
            statement.setInt(2, studentId);

            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {

                System.out.println("Student mark updated successfully.");

            } else {

                System.out.println("Student not found. Mark not updated.");
            }

        } catch (SQLException e) {

            System.out.println("Database error: " + e.getMessage());
        }
    }
}