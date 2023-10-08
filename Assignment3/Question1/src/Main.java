import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creating a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for the task description
        System.out.println("Write a program that counts the number of digits in an integer entered by the user.");
        System.out.println("Enter -1 to exit.");

        // Main loop for user interaction
        while(true){
            // Prompting the user for input
            System.out.println(">>>>>>>>>>>");
            System.out.print("Please Enter Number:");

            // Reading the user input
            int input = scanner.nextInt();

            // Checking if the user wants to exit the program
            if(input == -1){
                System.out.println("Program Terminated");
                break;
            }

            // Displaying the result - number of digits
            System.out.println("Number of digits in " + input + " is: " + calDigits(input));
        }
    }

    // Function to calculate the number of digits in an integer
    public static int calDigits(int input){
        int count = 0;

        // Special case for input being 0
        if(input == 0){
            return 1;
        }

        // Taking the absolute value of the input
        input = Math.abs(input);

        // Counting the number of digits using a loop
        while(input != 0){
            count++;
            input /= 10;
        }

        // Returning the count of digits
        return count;
    }
}
