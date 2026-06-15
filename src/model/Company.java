package model;

public class Company {
    private int id;
    private String name;
    private String location;
    private String website;

    public Company(String name, String location, String website) {
        this.name = name;
        this.location = location;
        this.website = website;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getLocation() { return location; }
    public String getWebsite() { return website; }

    public void setId(int id) { this.id = id; }
}