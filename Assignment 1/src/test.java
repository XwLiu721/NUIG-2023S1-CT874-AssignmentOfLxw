import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.*;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //Define some parameter
        HashSet set = new HashSet();
        Person p1 = new Person(1001,"AA");
        Person p2 = new Person(1002,"BB");
        set.add(p1);
        set.add(p2);
        p1.name="CC";
        set.remove(p1);
        System.out.println(set);
        set.add(new Person(1001,"BB"));
        set.add(new Person(1001,"CC"));
        System.out.println(set);
        set.add(new Person(1001,"AA"));
        System.out.println(set);

        }
}
class Person{
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
