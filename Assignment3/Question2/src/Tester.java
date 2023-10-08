// The main tester class
public class Tester {
    public static void main(String[] args) {
        // Setting the number of students
        int num = 20;

        // Creating an array to store Student objects
        Student[] array = new Student[num];

        // Initializing Student objects with names and ID numbers
        // Adding a number of instances of Student to the array.
        for (int i = 0; i < num; i++) {
            array[i] = new Student("Xiaowei Liu-No." + i, 21 + (long)i);
        }

        // Displaying Student information in reverse order
        for (int i = num - 1; i >= 0; i--) {
            System.out.println(array[i].toString());
        }
    }
}

// The Student class
class Student {
    // Attributes of the Student class
    String name;
    Long idNumber;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor to initialize name and ID number
    public Student(String name, Long idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for ID number
    public Long getIdNumber() {
        return idNumber;
    }

    // Setter method for ID number
    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }

    // Override toString method to display Student information
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }
}
