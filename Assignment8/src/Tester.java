// Importing necessary libraries for input-output operations and working with collections
import java.io.*;
import java.util.*;

// The main class of your program
public class Tester {

    // The main method where the program execution begins
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Creating instances of Cat and Dog objects
        Cat cat = new Cat("Pipi", "Cat", 12);
        Dog dog = new Dog("Jack", "Dog", 13);
        Cat cat1 = new Cat("Rose", "Cat2", 17);

        // Creating a list to store Animal objects
        List<Animal> list = new LinkedList<Animal>();
        list.add(cat);
        list.add(dog);
        list.add(cat1);

        // Printing information about each animal in the list
        System.out.println(">>>>>>>>>>>>>");
        for (Animal animal : list) {
            System.out.println(animal.toString());
        }

        // Sorting the list based on breed using BreedComparator
        System.out.println(">>>>>>>>>>>>>");
        Collections.sort(list, new BreedComparator());
        for (Animal animal : list) {
            System.out.println(animal.toString());
        }

        // Sorting the list based on size using SizeComparator
        System.out.println(">>>>>>>>>>>>>");
        Collections.sort(list, new SizeComparator());
        for (Animal animal : list) {
            System.out.println(animal.toString());
        }

        // Serializing the list of animals to a file
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
        Serialize(list);

        // Deserializing and printing the animals from the file
        Deserialize();
    }

    // Comparator for sorting animals based on breed
    public static class BreedComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal animal1, Animal animal2) {
            return animal1.getBreed().compareTo(animal2.getBreed());
        }
    }

    // Comparator for sorting animals based on size
    public static class SizeComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal animal1, Animal animal2) {
            return Integer.compare(animal1.getSize(), animal2.getSize());
        }
    }

    // Method to deserialize the list of animals from a file
    public static void Deserialize() throws IOException, ClassNotFoundException {

        // Initialize an ObjectInputStream to read from the file
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("list.txt"));

        // Read the object from the file
        Object obj = in.readObject();
        System.out.println("Deserialize Done!");

        // Print information about each animal in the deserialized list
        for (Animal animal : (List<Animal>) obj) {
            System.out.println(animal.toString());
        }
    }

    // Method to serialize and write the list of animals to a file
    public static void Serialize(List<Animal> list) throws IOException {

        // Initialize an ObjectOutputStream to write to the file
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("list.txt"));

        // Write the list of animals to the file
        out.writeObject(list);
        System.out.println("Serialize Done!");
    }
}
