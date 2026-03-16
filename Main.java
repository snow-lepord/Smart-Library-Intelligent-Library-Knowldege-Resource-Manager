package SmartLibb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AuthSystem auth = new AuthSystem();

        int option;

        System.out.println("==== SMART LIBRARY SYSTEM ====");

        do {

            System.out.println("\n1 Create Account");
            System.out.println("2 Login");
            System.out.print("Enter choice: ");

            option = sc.nextInt();
            sc.nextLine();

            switch(option) {

                case 1:
                    auth.createAccount();
                    break;

                case 2:
                    if(auth.login()) {

                        Library lib = new Library();
                        int choice;

                        do {

                            System.out.println("\n===== LIBRARY MENU =====");
                            System.out.println("1 Add Book");
                            System.out.println("2 Display Books");
                            System.out.println("3 Delete Book");
                            System.out.println("4 Add User");
                            System.out.println("5 Issue Book");
                            System.out.println("6 Return Book");
                            System.out.println("7 User History");
                            System.out.println("8 Exit");

                            System.out.print("Enter Choice: ");
                            choice = sc.nextInt();

                            switch(choice) {

                                case 1: lib.addBook(); break;
                                case 2: lib.displayBooks(); break;
                                case 3: lib.deleteBook(); break;
                                case 4: lib.addUser(); break;
                                case 5: lib.issueBook(); break;
                                case 6: lib.returnBook(); break;
                                case 7: lib.userHistory(); break;
                                case 8: System.out.println("Exiting"); break;

                                default:
                                    System.out.println("Invalid choice");
                            }

                        } while(choice != 8);

                    }
                    break;

                default:
                    System.out.println("Invalid option");

            }

        } while(option != 2);
    }
}