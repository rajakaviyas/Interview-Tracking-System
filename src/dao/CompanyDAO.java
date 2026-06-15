package dao;

import db.DBConnection;
import java.sql.*;

public class CompanyDAO {

    public void addCompany(String name, String location, String website) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO companies(name, location, website) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, location);
            ps.setString(3, website);

            ps.executeUpdate();
            System.out.println("Company Added!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewCompanies() {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM companies";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " | " +
                                rs.getString(2) + " | " +
                                rs.getString(3) + " | " +
                                rs.getString(4)
                );
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
