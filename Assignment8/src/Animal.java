import java.io.Serializable;

// This is a class representing an Animal, which implements Comparable and Serializable interfaces.
class Animal implements Comparable<Animal>, Serializable {
    // Attributes of an Animal
    private String name;
    private String breed;
    private int size;

    // Default constructor for Animal
    public Animal() {
    }

    // Parameterized constructor for Animal, allowing initialization with specific name, breed, and size
    public Animal(String name, String breed, int size) {
        this.name = name;
        this.breed = breed;
        this.size = size;
    }

    // Method to compare animals based on their names (implements Comparable interface)
    public int compareTo(Animal animal) {
        return this.name.compareTo(animal.name);
    }

    // Getter method for retrieving the name of the animal
    public String getName() {
        return name;
    }

    // Setter method for setting the name of the animal
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for retrieving the breed of the animal
    public String getBreed() {
        return breed;
    }

    // Setter method for setting the breed of the animal
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getter method for retrieving the size of the animal
    public int getSize() {
        return size;
    }

    // Setter method for setting the size of the animal
    public void setSize(int size) {
        this.size = size;
    }

    // toString method for providing a string representation of the Animal object
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size=" + size +
                '}';
    }
}

// This is a subclass of Animal representing a Cat.
class Cat extends Animal {
    // Constructor for Cat, utilizing the constructor of the superclass (Animal)
    public Cat(String name, String breed, int size) {
        super(name, breed, size);
    }

    // Method representing a sound that a cat makes (not implemented here, just a placeholder)
    public String sound() {
        return "";  // Placeholder for the sound method
    }
}

// This is a subclass of Animal representing a Dog.
class Dog extends Animal {
    // Constructor for Dog, utilizing the constructor of the superclass (Animal)
    public Dog(String name, String breed, int size) {
        super(name, breed, size);
    }

    // Method representing a sound that a dog makes (not implemented here, just a placeholder)
    public String sound() {
        return "";  // Placeholder for the sound method
    }
}
