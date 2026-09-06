import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 200.00;

        // DIAL SCREEN (*186#)
        String ussd = "";
        do {
            System.out.println("Dial *186# to access JB LOAD SERVICES");
            System.out.print("Enter USSD Code: ");
            ussd = scanner.nextLine().trim();

            if (!ussd.equals("*186#")) {
                System.out.println("Invalid USSD code. Please dial *186#.\n");
            }
        } while (!ussd.equals("*186#"));

        int choice = 0;

        // MAIN MENU LOOP
        do {
            System.out.println("———————————————————————————————————————————");
            System.out.println("|         LOAD REGISTRATION APP           |");
            System.out.println("———————————————————————————————————————————");
            System.out.println("|   (1) JB Unli Call & Text               |");
            System.out.println("|   (2) JB PROMOS                         |");
            System.out.println("|   (3) Utang Loads                       |");
            System.out.println("|   (4) Check Balance                     |");
            System.out.println("|   (5) Exit                              |");
            System.out.println("———————————————————————————————————————————");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine();
                continue;
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            // SUB-MENU 1: JB UNLI CALL & TEXT
            if (choice == 1) {
                System.out.println("\n———————————————————————————————————————————");
                System.out.println("|         JB UNLI CALL & TEXT             |");
                System.out.println("———————————————————————————————————————————");
                System.out.println("| (1) JBCOMBO10 ₱10.00 for 1 day          |");
                System.out.println("| (2) AllnetB30 ₱30.00 for 2 day          |");
                System.out.println("| (3) AllnetJ50 ₱50.00 for 4 day          |");
                System.out.println("| (4) Back                                |");
                System.out.println("———————————————————————————————————————————");
                System.out.print("Enter your choice: ");

                int sub = scanner.nextInt();
                scanner.nextLine();

                if (sub == 1) {
                    if (balance >= 10.00) {
                        balance -= 10.00;
                        System.out.println("\nYou have successfully registered to JBCOMBO10.");
                        System.out.println("Promo duration: 1 day/s.");
                        System.out.printf("Remaining load balance: ₱%.2f%n", balance);
                        System.out.println("Thank you for using our service!");
                    } else {
                        System.out.println("\nInsufficient load balance!");
                    }
                    System.out.print("\nPress Enter to continue...");
                    scanner.nextLine();
                } else if (sub == 2) {
                    if (balance >= 30.00) {
                        balance -= 30.00;
                        System.out.println("\nYou have successfully registered to AllnetB30.");
                        System.out.println("Promo duration: 2 day/s.");
                        System.out.printf("Remaining load balance: ₱%.2f%n", balance);
                        System.out.println("Thank you for using our service!");
                    } else {
                        System.out.println("\nInsufficient load balance!");
                    }
                    System.out.print("\nPress Enter to continue...");
                    scanner.nextLine();
                } else if (sub == 3) {
                    if (balance >= 50.00) {
                        balance -= 50.00;
                        System.out.println("\nYou have successfully registered to AllnetJ50.");
                        System.out.println("Promo duration: 4 day/s.");
                        System.out.printf("Remaining load balance: ₱%.2f%n", balance);
                        System.out.println("Thank you for using our service!");
                    } else {
                        System.out.println("\nInsufficient load balance!");
                    }
                    System.out.print("\nPress Enter to continue...");
                    scanner.nextLine();
                } else if (sub == 4) {
                    System.out.println("\nReturning to Main Menu...");
                }

            //SUB-MENU 2: JB PROMOS
            } else if (choice == 2) {
                System.out.println("\n—————————————————————————————————————————————————————————————————————————————————————————————");
                System.out.println("|                                       JB PROMOS                                           |");
                System.out.println("—————————————————————————————————————————————————————————————————————————————————————————————");
                System.out.println("| (1) GORAFUN ₱20.00 UNLI DATA for FB, Tiktok and Instagram for 1 day                       |");
                System.out.println("| (2) GORAGAMES ₱50.00 UNLI DATA for Mobile Legends and Call of Duty for 3 day              |");
                System.out.println("| (3) GO ARAL ₱70.00 UNLI DATA for Gclass, Youtube, Zoom and many more for 7 day            |");
                System.out.println("| (4) Back                                                                                  |");
                System.out.println("—————————————————————————————————————————————————————————————————————————————————————————————");
                System.out.print("Enter your choice: ");

                int sub = scanner.nextInt();
                scanner.nextLine();

                if (sub == 1) {
                    if (balance >= 20.00) {
                        balance -= 20.00;
                        System.out.println("\nYou have successfully registered to GORAFUN.");
                        System.out.println("Promo duration: 1 day/s.");
                        System.out.printf("Remaining load balance: ₱%.2f%n", balance);
                        System.out.println("Thank you for using our service!");
                    } else {
                        System.out.println("\nInsufficient load balance!");
                    }
                    System.out.print("\nPress Enter to continue...");
                    scanner.nextLine();
                } else if (sub == 2) {
                    if (balance >= 50.00) {
                        balance -= 50.00;
                        System.out.println("\nYou have successfully registered to GORAGAMES.");
                        System.out.println("Promo duration: 3 day/s.");
                        System.out.printf("Remaining load balance: ₱%.2f%n", balance);
                        System.out.println("Thank you for using our service!");
                    } else {
                        System.out.println("\nInsufficient load balance!");
                    }
                    System.out.print("\nPress Enter to continue...");
                    scanner.nextLine();
                } else if (sub == 3) {
                    if (balance >= 70.00) {
                        balance -= 70.00;
                        System.out.println("\nYou have successfully registered to GO ARAL.");
                        System.out.println("Promo duration: 7 day/s.");
                        System.out.printf("Remaining load balance: ₱%.2f%n", balance);
                        System.out.println("Thank you for using our service!");
                    } else {
                        System.out.println("\nInsufficient load balance!");
                    }
                    System.out.print("\nPress Enter to continue...");
                    scanner.nextLine();
                } else if (sub == 4) {
                    System.out.println("\nReturning to Main Menu...");
                }

            // SUB-MENU 3: UTANG LOADS
            } else if (choice == 3) {
                System.out.println("\n——————————————————————————————————————————————————");
                System.out.println("|                  Utang Loads                   |");
                System.out.println("——————————————————————————————————————————————————");
                System.out.println("| (1) COMBO15 Unli Call & Text for 1 day         |");
                System.out.println("| (2) DATA20 500MB for 1 day                     |");
                System.out.println("| (3) Back                                       |");
                System.out.println("——————————————————————————————————————————————————");
                System.out.print("Enter your choice: ");

                int sub = scanner.nextInt();
                scanner.nextLine();

                if (sub == 1) {
                    System.out.println("\nYou have successfully borrowed COMBO15.");
                    System.out.println("Promo duration: 1 day/s.");
                    System.out.println("Amount to be deducted on next reload: ₱15.00");
                    System.out.println("Thank you for using our service!");
                    System.out.print("\nPress Enter to continue...");
                    scanner.nextLine();
                } else if (sub == 2) {
                    System.out.println("\nYou have successfully borrowed DATA20.");
                    System.out.println("Promo duration: 1 day/s.");
                    System.out.println("Amount to be deducted on next reload: ₱20.00");
                    System.out.println("Thank you for using our service!");
                    System.out.print("\nPress Enter to continue...");
                    scanner.nextLine();
                } else if (sub == 3) {
                    System.out.println("\nReturning to Main Menu...");
                }

            // MENU 4: CHECK BALANCE
            } else if (choice == 4) {
                System.out.println("\n——————————————————————————————————————————");
                System.out.println("|             ACCOUNT BALANCE            |");
                System.out.println("——————————————————————————————————————————");
                System.out.printf("|  Remaining Balance: ₱%-18.2f|\n", balance);
                System.out.println("——————————————————————————————————————————");
                System.out.print("Press Enter to continue...");
                scanner.nextLine();

            // MENU 5: EXIT
            } else if (choice == 5) {
                System.out.println("\nThank you for using JB LOAD SERVICES. Goodbye and have nice data with you!");
            } else {
                System.out.println("\nInvalid choice! Please select 1 to 5.");
            }

        } while (choice != 5);

        scanner.close();
    }
}