import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a new client object to manage student information
        client cLient = new client();

        // Input details for the first student (UnderGraduate)
        System.out.println("Start Input First Student UnderGraduate");
        cLient.array[0] = UserInputTemp(1);

        // Input details for the second and third students (PostGraduate)
        System.out.println("Start Input Second Student PostGraduate");
        cLient.array[1] = UserInputTemp(0);
        System.out.println("Start Input Third Student PostGraduate");
        cLient.array[2] = UserInputTemp(0);

        // Display the information and results for all students
        cLient.show();
    }

    // Function to take user input for a student (UnderGraduate or PostGraduate)
    public static Student UserInputTemp(int typeIndex) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.println("please Enter Name:");
        String name = scanner.nextLine();
        System.out.println("please Enter ID:");
        long id = scanner.nextLong();

        // Create a student object based on the type (UnderGraduate or PostGraduate)
        Student student = typeIndex == 1 ? new UnderGraduate(name, id) : new PostGraduate(name, id);

        // Input exam results for the student
        for (int i = 1; i <= 3; i++) {
            System.out.println("please Enter No." + i + " Exam Result:");
            int point = scanner.nextInt();
            student.setTestScore(i, point);
        }

        // Return the created student object
        return student;
    }
}

// Class to manage an array of students
class client {
    Student[] array = new Student[3];

    // Default constructor
    public client() {
    }

    // Function to display information and results for all students
    public void show() {
        for (Student student : array) {
            // Display student details
            System.out.print(student.toString() + ", ");

            // Calculate and display the result for each student
            student.calculateResult();
        }
    }
}
