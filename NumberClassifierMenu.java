import java.util.Scanner;

public class NumberClassifierMenu {
    public static void main(String[] args) {
        // Create Scanner object and Choice variable
        Scanner input = new Scanner(System.in);
        char userChoice;
        
        // Start the do-while loop to allow the menu to be displayed repeatedly
        do {
            // Display the menu
            System.out.println("\n=== Number Classifier Menu ===");
            System.out.println("1. Classify a number as positive, negative, or zero");
            System.out.println("2. Print a multiplication table for a given number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            // Read user choice
            int choice = input.nextInt();
            
            // Switch statement to handle menu options
            switch (choice) {
                case 1: 
                    // Option 1: Classify number as positive, negative, or zero
                    System.out.print("Enter a number to classify: ");
                    int number = input.nextInt();
                    
                    if (number > 0) {
                        System.out.println("The number " + number + " is positive.");
                    } else if (number < 0) {
                        System.out.println("The number " + number + " is negative.");
                    } else {
                        System.out.println("The number is zero.");
                    }

                    // Check if the number is even or odd
                    if (number % 2 == 0) {
                        System.out.println("It is also an even number.");
                    } else {
                        System.out.println("It is an odd number.");
                    }
                    break;
                
                case 2:
                    // Option 2: Print multiplication table
                    System.out.print("Enter a number to display its multiplication table: ");
                    int tableNumber = input.nextInt();
                    System.out.println("Multiplication Table for " + tableNumber + ":");

                    // Use a for loop to generate the multiplication table
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
                    }
                    break;

                case 3:
                    // Option 3: Exit the program
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    // Handle invalid option
                    System.out.println("Invalid option. Please choose between 1 and 3.");
                    break;
            }

            // Ask the user if they want to continue
            System.out.print("Do you want to return to the menu? (Y/N): ");
            input.nextLine(); // Consume leftover newline character
            userChoice = input.nextLine().toUpperCase().charAt(0);
            
        } while (userChoice == 'Y'); // Continue if user enters 'Y'

        // Close the Scanner object
        input.close();
    }
}