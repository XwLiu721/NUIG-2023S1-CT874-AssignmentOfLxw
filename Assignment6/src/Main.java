import java.util.LinkedList;
import java.util.*;

// Main class
public class Main {

    public static void main(String[] args) {
        int totalSales = 0;
        // Create a list to store SalesEmployee objects
        List<SalesEmpolyee> employeeList = new LinkedList<SalesEmpolyee>();

        System.out.println(">>>>>>>>>>>>>");
        System.out.println("Create a SalesAgent");
        // Create a SalesAgent instance and add it to the list
        employeeList.add(create(1));

        System.out.println(">>>>>>>>>>>>>");
        System.out.println("Create a SalesAgent");
        // Create another SalesAgent instance and add it to the list
        employeeList.add(create(1));

        System.out.println(">>>>>>>>>>>>>");
        System.out.println("Create a SalesPerson");
        // Create a SalesPerson instance and add it to the list
        employeeList.add(create(0));

        System.out.println(">>>>>>>>>>>>>");

        // Loop through the list, print information about each sales employee, and accumulate total sales
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i).toString());
            totalSales += employeeList.get(i).sales;
        }

        // Print the total sales
        System.out.println("Total of all sales: " + totalSales);
    }

    // Method to create a SalesEmployee instance
    public static SalesEmpolyee create(int flag) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Please enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Please enter PPS Number: ");
        String pps = scanner.nextLine();

        System.out.println("Please enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();

        // Create a SalesAgent or SalesPerson instance based on the flag
        SalesEmpolyee person = (flag == 1) ? new SalesAgent(firstName, lastName, pps) : new SalesPerson(firstName, lastName, pps);

        // Set the sales amount and calculate the commission
        person.sales = salesAmount;
        person.calculateCommission();

        return person;
    }
}

// SalesAgent class, extends SalesEmployee
class SalesAgent extends SalesEmpolyee {
    public SalesAgent() {
    }

    public SalesAgent(String firstName, String lastName, String ppsNumber) {
        super(firstName, lastName, ppsNumber);
    }

    // Override the calculateCommission method
    @Override
    void calculateCommission() {
        // Calculate commission based on sales amount (10%)
        this.commission = this.sales * 0.1;
    }
}

// SalesPerson class, extends SalesEmployee
class SalesPerson extends SalesEmpolyee {
    public SalesPerson() {
    }

    public SalesPerson(String firstName, String lastName, String ppsNumber) {
        super(firstName, lastName, ppsNumber);
    }

    // Override the calculateCommission method
    @Override
    void calculateCommission() {
        // Calculate commission based on sales amount (15%)
        this.commission = this.sales * 0.15;
    }
}
