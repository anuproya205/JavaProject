import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 * This program demonstrates how to create an Employee table in a MySQL database
 * using the Statement interface in JDBC. It also retrieves and displays data from
 * the table after inserting records from the MySQL command line.
 */

public class EmployeeTableCreation {
    // Database URL, username, and password (modify as per your setup)
    static final String DB_URL = "jdbc:mysql://localhost:3306/employee"; // Replace "your_database_name"
    static final String USER = "root"; // Replace with your MySQL username
    static final String PASS = "Mysql_password@123"; // Replace with your MySQL password

    public static void main(String[] args) {
        // SQL query to create the Employee table if it does not already exist
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Employee (" +
                "eid INT AUTO_INCREMENT, " +
                "name VARCHAR(100) NOT NULL, " +
                "address VARCHAR(200) NOT NULL, " +
                "salary INT NOT NULL, " +
                "PRIMARY KEY (eid)" +
                ");";

        // SQL query to select all records from the Employee table
        String selectSQL = "SELECT * FROM Employee;";

            // Establishing a connection
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                 Statement stmt = conn.createStatement()) {

                // Execute the SQL query to create the Employee table
                stmt.execute(createTableSQL);
                System.out.println("Employee table has been created successfully.");

                // Execute the SQL SELECT query to retrieve data from the Employee table
                ResultSet rs = stmt.executeQuery(selectSQL);

                // Check if the result set has any data
                if (!rs.isBeforeFirst()) {  // If no data, print a messag
                    System.out.println("No data found in the Employee table.");
                } else {
                    //if data exists Print the retrieved data
                    System.out.println("Data in the Employee table:");
                    System.out.println("eid | name       | address      | salary");
                    // Loop through the result set and display each record
                    while (rs.next()) {
                        System.out.println(rs.getInt("eid") + "  | " +
                                rs.getString("name") + " | " +
                                rs.getString("address") + " | " +
                                rs.getInt("salary"));
                    }
                }
            } catch (SQLException e) {
                // Print detailed error message in case of SQLException
                e.printStackTrace();
            }
        }
    }


