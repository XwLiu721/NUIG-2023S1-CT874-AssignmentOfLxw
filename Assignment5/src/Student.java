import java.util.Arrays;

// A class representing a student
class Student {
    String name;
    long id;
    String grade;
    int[] test = {-1, -1, -1};

    int NUM_TESTS = 0;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor to initialize name and id
    public Student(String name, long id) {
        this.name = name;
        this.id = id;
    }

    // Setter methods to set name, id, and grade
    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Method to set test scores for a student
    public void setTestScore(int index, int score) {
        // Check if the index is within the valid range (1 to 3)
        if (index > 3) {
            System.out.println("Only take 3 exams");
        } else {
            // Update the number of tests taken and set the test score
            NUM_TESTS = test[index - 1] >= 0 ? NUM_TESTS : NUM_TESTS + 1;
            //make score valid
            test[index - 1] = score>=100?100:(score<=0?0:score);
        }
    }

    // Method to get the test score for a specific exam
    public int getTestScore(int index) {
        // Check if the index is within the valid range (1 to 3)
        if (index > 3) {
            System.out.println("Only take 3 exams");
        } else {
            // Return the test score for the specified exam
            return test[index - 1];
        }
        return -1; // Return -1 if the index is invalid
    }

    // Getter methods to retrieve name, id, grade, and the number of tests
    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getGrade() {
        return grade;
    }

    public int getNUM_TESTS() {
        return NUM_TESTS;
    }

    // Method to display basic information about the student
    @Override
    public String toString() {
        return "name='" + name + ", id=" + id;
    }

    // Method to calculate and display the result for the student
    public void calculateResult() {
        // This method will be overridden by subclasses (UnderGraduate and PostGraduate)
    }
}

// A subclass representing an undergraduate student
class UnderGraduate extends Student {
    // Default constructor
    public UnderGraduate() {
    }

    // Parameterized constructor to initialize name and id
    public UnderGraduate(String name, long id) {
        super(name, id);
    }

    // Override the calculateResult method for undergraduates
    @Override
    public void calculateResult() {
        int sum = 0;
        // Calculate the sum of test scores
        for (int i = 0; i < NUM_TESTS; i++) {
            sum += test[i];
        }
        // Check if the average score is greater than or equal to 40
        if (sum / NUM_TESTS >= 40) {
            System.out.println("PASS");
        } else {
            System.out.println("NOT PASS");
        }
    }
}

// A subclass representing a postgraduate student
class PostGraduate extends Student {
    // Default constructor
    public PostGraduate() {
    }

    // Parameterized constructor to initialize name and id
    public PostGraduate(String name, long id) {
        super(name, id);
    }

    // Override the calculateResult method for postgraduates
    @Override
    public void calculateResult() {
        int sum = 0;
        // Calculate the sum of test scores
        for (int i = 0; i < NUM_TESTS; i++) {
            sum += test[i];
        }
        // Check if the average score is greater than or equal to 50
        if (sum / NUM_TESTS >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("NOT PASS");
        }
    }
}
