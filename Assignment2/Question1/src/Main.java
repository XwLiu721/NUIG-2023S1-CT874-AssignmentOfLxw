import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create a scanner to get User's input
       Scanner scanner = new Scanner(System.in);

       //Ask User to set array’size
       System.out.println("Please Enter Array's Size:");
       int size = scanner.nextInt();

       //create array whose type is double and size is equal to user's input
        double[] array = new double[size];

        // Use a for loop to populate the array with user input
        for(int i=0;i<size;i++){
            System.out.println("Please Enter No."+(i+1)+" Number:");
            array[i]=scanner.nextDouble();
        }

        // Close the scanner
        scanner.close();

        // Use a for loop to calculate sum and display array contents
        double sum = 0.0;
        System.out.print("Numbers in Array: [");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
            // Calculate the sum of the array
            sum += array[i];
        }
        System.out.println("]");

        //display sum of the array
        System.out.println("Sum of the array: " + sum);

    }
}
