package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/interview_tracker";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            System.out.println("DB Connection Failed!");
            e.printStackTrace();
        }
        return con;
    }
}