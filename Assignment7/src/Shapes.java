import java.io.Serializable;

// This is an interface that declares a method for comparing shapes.
// Any class implementing this interface must provide a method to compare itself with another shape.
interface ShapeRelate {
    int compareShapes(ShapeRelate shapeRelate);
}

// This is an abstract class representing generic shapes.
// It implements the ShapeRelate interface and extends Serializable for serialization.
public abstract class Shapes implements ShapeRelate, Serializable {
    // Common attribute for storing the area of the shape
    protected double area;

    // Default constructor for Shapes
    public Shapes() {
    }

    // Getter method for retrieving the area of the shape
    public double getArea() {
        return area;
    }

    // Abstract method to be implemented by subclasses for calculating the area of a specific shape
    abstract void calculateArea();

    // Implementation of the compareShapes method from the ShapeRelate interface
    @Override
    public int compareShapes(ShapeRelate shapeRelate) {
        // Default comparison returns 0; subclasses can override this for specific comparisons
        return 0;
    }
}

// This is a subclass of Shapes representing a Circle.
class Circle extends Shapes {
    // Attributes specific to a Circle
    private double radius;
    private double pi = Math.PI;

    // Default constructor for Circle
    public Circle() {
    }

    // Parameterized constructor for Circle, allowing initialization with a specific radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method for retrieving the radius of the circle
    public double getRadius() {
        return radius;
    }

    // Setter method for setting the radius of the circle
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method to calculate the area of the circle
    @Override
    void calculateArea() {
        this.area = radius * radius * pi;
    }

    // toString method for providing a string representation of the Circle object
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", area=" + area +
                '}';
    }
}

// This is another subclass of Shapes representing a Rectangle.
class Rectangle extends Shapes {
    // Attributes specific to a Rectangle
    private double length;
    private double width;

    // Default constructor for Rectangle
    public Rectangle() {
    }

    // Parameterized constructor for Rectangle, allowing initialization with specific length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter method for retrieving the length of the rectangle
    public double getLength() {
        return length;
    }

    // Setter method for setting the length of the rectangle
    public void setLength(double length) {
        this.length = length;
    }

    // Getter method for retrieving the width of the rectangle
    public double getWidth() {
        return width;
    }

    // Setter method for setting the width of the rectangle
    public void setWidth(double width) {
        this.width = width;
    }

    // Implementation of the abstract method to calculate the area of the rectangle
    @Override
    void calculateArea() {
        this.area = this.length * this.width;
    }

    // toString method for providing a string representation of the Rectangle object
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area +
                '}';
    }
}
