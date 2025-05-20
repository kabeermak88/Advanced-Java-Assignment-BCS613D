// 8a. Q1. Read all the existing records from the table coffee which is from the database test and insert a
// new coffee product into it [Create a table coffee with fields ( id,coffee_name,price)] using HTML and
// JSP to get the fields and display the results respectively

import java.sql.*;

public class DBConnectExample {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the database connection
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb", "root", "your_password");

            // Create a statement object
            stmt = conn.createStatement();

            // Execute a simple query
            ResultSet rs = stmt.executeQuery("SELECT id, name, course FROM students");

            System.out.println("Student Records:");
            System.out.println("-------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String course = rs.getString("course");
                System.out.println("ID: " + id + ", Name: " + name + ", Course: " + course);
            }

            // Close the result set
            rs.close();
        } catch (Exception e) {
            System.err.println("Connection or Query failed: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                System.err.println("Closing failed: " + se.getMessage());
            }
        }
    }
}
