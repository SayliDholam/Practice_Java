/*wap to implement nested switch for a restaurant application.
breakfast, lunch , dinner, exit  --> menu inside each */

import java.util.Scanner;

class Hw_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to our restaurant");
            System.out.println("What would you like to have?");
            System.out.println("1. Breakfast");
            System.out.println("2. Lunch");
            System.out.println("3. Dinner");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Breakfast Menu:");
                    System.out.println("1. Pancakes");
                    System.out.println("2. Omelette");
                    System.out.println("3. Smoothie");
                    System.out.print("Enter your choice: ");
                    int breakfastChoice = scanner.nextInt();
                    switch (breakfastChoice) {
                        case 1:
                            System.out.println("You chose Pancakes.");
                            break;
                        case 2:
                            System.out.println("You chose Omelette.");
                            break;
                        case 3:
                            System.out.println("You chose Smoothie.");
                            break;
                        default:
                            System.out.println("Invalid choice. Please select from the Breakfast menu.");
                    }
                    break;

                case 2:
                    System.out.println("Lunch Menu:");
                    System.out.println("1. Salad");
                    System.out.println("2. Burger");
                    System.out.println("3. Sandwich");
                    System.out.print("Enter your choice: ");
                    int lunchChoice = scanner.nextInt();
                    switch (lunchChoice) {
                        case 1:
                            System.out.println("You chose Salad.");
                            break;
                        case 2:
                            System.out.println("You chose Burger.");
                            break;
                        case 3:
                            System.out.println("You chose Sandwich.");
                            break;
                        default:
                            System.out.println("Invalid choice. Please select from the Lunch menu.");
                    }
                    break;

                case 3:
                    System.out.println("Dinner Menu:");
                    System.out.println("1. Steak");
                    System.out.println("2. Pasta");
                    System.out.println("3. Pizza");
                    System.out.print("Enter your choice: ");
                    int dinnerChoice = scanner.nextInt();
                    switch (dinnerChoice) {
                        case 1:
                            System.out.println("You chose Steak.");
                            break;
                        case 2:
                            System.out.println("You chose Pasta.");
                            break;
                        case 3:
                            System.out.println("You chose Pizza.");
                            break;
                        default:
                            System.out.println("Invalid choice. Please select from the Dinner menu.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for visiting our restaurant!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

            if (running) {
                System.out.print("Would you like to have something else? (Y/N): ");
                char continueChoice = scanner.next().charAt(0);
                if (continueChoice == 'N' || continueChoice == 'n') {
                    running = false;
                    System.out.println("Thank you for visiting our restaurant!");
                }
            }
        }
        scanner.close();
    }
}
