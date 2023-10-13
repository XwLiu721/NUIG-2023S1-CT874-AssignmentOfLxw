import java.util.*;

// The main driver class
public class Driver {
    public static void main(String[] args) {

        // Create a list to store Contact objects
        List<Contact> list = new ArrayList<Contact>();

        // Populate the list with Contact objects
        for (int i = 1; i <= 4; i++) {
            list.add(new Contact("XiaoweiLiu_No" + i, i));
        }

        // Displaying the list in the forward direction
        System.out.println(">>>>>>Forward Direction>>>>>>");
        ListIterator<Contact> Iterator1 = list.listIterator();
        while (Iterator1.hasNext()) {
            System.out.println(Iterator1.next().toString());
        }

        // Displaying the list in the backward direction
        System.out.println(">>>>>>Backward Direction>>>>>>");
        ListIterator<Contact> Iterator2 = list.listIterator(list.size());
        while (Iterator2.hasPrevious()) {
            System.out.println(Iterator2.previous().toString());
        }

        // Display the size of the list
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("The size of the list: " + list.size());

        // Request user input to find and remove a contact
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Contact Names Contain XiaoweiLiu_No:1 to XiaoweiLiu_No:" + list.size());
        System.out.println("Please enter the name of the contact you want to remove:");

        // Read user input for the contact name to be removed
        String name = scanner.nextLine().toLowerCase();

        // Search for the contact in the list and remove it
        for (Contact contact : list) {
            // Check if the lowercase version of the contact's name matches the user input
            if (contact.name.toLowerCase().equals(name)) {
                // If a match is found, print the index of the contact in the list
                System.out.println("Contact found at index: " + list.indexOf(contact));

                // Remove the contact from the list using its index
                list.remove(list.indexOf(contact));
            }
        }

        // Display the list after removing the contact
        System.out.println(">>>>>>After Remove>>>>>>");
        // Iterate through the updated list and print each contact
        for (Contact contact : list) {
            System.out.println(contact.toString());
        }

    }
}

// A simple Contact class representing a person with a name and a number
class Contact {
    String name;
    long number;

    // Constructor to initialize Contact with a name and a number
    public Contact(String name, long number) {
        this.name = name;
        this.number = number;
    }

    // Getter and setter methods for name and number
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
    //ToString
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
// Override