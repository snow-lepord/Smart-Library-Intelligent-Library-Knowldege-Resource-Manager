package SmartLibb;

import java.util.Scanner;

public class AuthSystem {

    Scanner sc = new Scanner(System.in);

    String[] usernames = new String[50];
    String[] passwords = new String[50];

    int count = 0;

    public void createAccount() {

        System.out.print("Enter new username: ");
        String user = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        usernames[count] = user;
        passwords[count] = pass;

        count++;

        System.out.println("Account created successfully!");
    }

    public boolean login() {

        System.out.print("Enter username: ");
        String user = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        for(int i = 0; i < count; i++) {

            if(usernames[i].equals(user) && passwords[i].equals(pass)) {

                System.out.println("Login successful!");
                return true;
            }
        }

        System.out.println("Invalid username or password");
        return false;
    }

}