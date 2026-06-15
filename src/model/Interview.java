package model;

public class Interview {
    private int id;
    private int companyId;
    private String date;
    private String role;
    private String type;
    private String status;

    public Interview(int companyId, String date, String role, String type) {
        this.companyId = companyId;
        this.date = date;
        this.role = role;
        this.type = type;
        this.status = "Pending";
    }

    public int getCompanyId() { return companyId; }
    public String getDate() { return date; }
    public String getRole() { return role; }
    public String getType() { return type; }
    public String getStatus() { return status; }
}