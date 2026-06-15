package main;

import dao.CompanyDAO;
import dao.InterviewDAO;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CompanyDAO cdao = new CompanyDAO();
        InterviewDAO idao = new InterviewDAO();

        while (true) {
            System.out.println("\n===== INTERVIEW TRACKER =====");
            System.out.println("1. Add Company");
            System.out.println("2. View Companies");
            System.out.println("3. Schedule Interview");
            System.out.println("4. View Interviews");
            System.out.println("5. Update Status");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Location: ");
                    String loc = sc.nextLine();
                    System.out.print("Website: ");
                    String web = sc.nextLine();
                    cdao.addCompany(name, loc, web);
                    break;

                case 2:
                    cdao.viewCompanies();
                    break;
                case 3:
                    // 🔥 Show companies first
                    System.out.println("\n===== AVAILABLE COMPANIES =====");
                    cdao.viewCompanies();

                    System.out.println("\nEnter Interview Details:");

                    System.out.print("Company ID: ");
                    int cid = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Date (YYYY-MM-DD): ");
                    String date = sc.nextLine();

                    System.out.print("Role: ");
                    String role = sc.nextLine();

                    System.out.print("Type (Online/Offline): ");
                    String type = sc.nextLine();

                    idao.scheduleInterview(cid, date, role, type);
                    break;


                case 4:
                    idao.viewInterviews();
                    break;

                case 5:
                    System.out.print("Interview ID: ");
                    int iid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Status (Selected/Rejected/Hold): ");
                    String status = sc.nextLine();
                    idao.updateStatus(iid, status);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
