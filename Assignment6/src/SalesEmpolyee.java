// Abstract class representing a sales employee
abstract class SalesEmpolyee {
    String firstName;               // First name of the employee
    String lastName;                // Last name of the employee
    static int bikeEmployeeNumber;  // Static variable for a shared employee number for bike
    String ppsNumber;               // PPS (Personal Public Service) number of the employee
    double sales;                   // Sales made by the employee
    double commission;              // Commission earned by the employee
    int employeeNumber;             // Employee number for identification

    // Default constructor
    public SalesEmpolyee() {
    }

    // Parameterized constructor to initialize basic information
    public SalesEmpolyee(String firstName, String lastName, String ppsNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ppsNumber = ppsNumber;
    }

    // Setter methods to update employee information
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPPS(String ppsNumber) {
        this.ppsNumber = ppsNumber;
    }

    // Getter methods to retrieve employee information
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPPS() {
        return ppsNumber;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    // Override toString method to provide a string representation of the object
    @Override
    public String toString() {
        return "SalesEmpolyee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ppsNumber='" + ppsNumber + '\'' +
                ", commission=" + commission +
                '}';
    }

    // Abstract method to be implemented by subclasses for commission calculation
    abstract void calculateCommission();
}
