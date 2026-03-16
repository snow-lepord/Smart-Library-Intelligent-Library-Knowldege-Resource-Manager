package SmartLibb;

import java.util.Scanner;

public class AdminLogin {

    String adminUser = "admin";
    String adminPass = "library123";

    Scanner sc = new Scanner(System.in);

    public boolean login() {

        System.out.println("===== SMART LIBRARY ADMIN LOGIN =====");

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if(user.equals(adminUser) && pass.equals(adminPass)) {

            System.out.println("Login Successful\n");
            return true;
        }
        else {

            System.out.println("Invalid Username or Password");
            return false;
        }
    }
}