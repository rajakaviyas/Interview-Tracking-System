package dao;

import db.DBConnection;
import java.sql.*;

public class InterviewDAO {

    public void scheduleInterview(int companyId, String date, String role, String type) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO interviews(company_id, interview_date, role, interview_type) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, companyId);
            ps.setString(2, date);
            ps.setString(3, role);
            ps.setString(4, type);

            ps.executeUpdate();
            System.out.println("Interview Scheduled!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewInterviews() {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM interviews";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " | CompanyID:" +
                                rs.getInt(2) + " | " +
                                rs.getString(3) + " | " +
                                rs.getString(4) + " | " +
                                rs.getString(5) + " | " +
                                rs.getString(6)
                );
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStatus(int interviewId, String status) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "UPDATE interviews SET status=? WHERE interview_id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, status);
            ps.setInt(2, interviewId);

            ps.executeUpdate();
            System.out.println("Status Updated!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
