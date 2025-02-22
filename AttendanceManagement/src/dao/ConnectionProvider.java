package dao;

import java.sql.*;

public class ConnectionProvider {

    private static final String DB_NAME = "attendance";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "@Welldone80";

    public static Connection getCon() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Initial connection without specifying database
            con = DriverManager.getConnection(DB_URL + "?useSSL=false", DB_USERNAME, DB_PASSWORD);

            // Check if the database exists
            if (!databaseExists(con, DB_NAME)) {
                createDatabase(con, DB_NAME);
            }
            
            // Close previous connection and create a new one with the database
            con.close();
            con = DriverManager.getConnection(DB_URL + DB_NAME + "?useSSL=false", DB_USERNAME, DB_PASSWORD);
            System.out.println("Connected to database: " + DB_NAME);
            return con;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    private static boolean databaseExists(Connection con, String dbName) {
        String query = "SHOW DATABASES LIKE ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, dbName);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static void createDatabase(Connection con, String dbName) {
        String query = "CREATE DATABASE " + dbName;
        try (Statement stmt = con.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Database '" + dbName + "' created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
}
