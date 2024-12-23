package T8;


public class T8Q1 {
    public static void main(String[] args) {
        // Part g: Create an object for the class Student
        Student student1 = new Student();

        // Part h: Change the contact number using the mutator method
        student1.setContactNumber("012-345 6789");
        student1.displayContactNumber();

        // Part i: Create an object of the class Animal
        Animal animal1 = new Animal("Dog");
        animal1.displayType();

        // Part j: Create an object of the class Animal to represent a cat
        Animal cat = new Animal("Cat");
        cat.displayType();

        // Part k: Create an object of the class Number with the value 20 and 40
        Number num = new Number(20, 40);
        num.displayNumbers();
    }
}

// Part a: Define a class Student
class Student {
    // Part b: Declare the instance variable to store contact numbers
    private String contactNumber;

    // Part c: Constructor that initializes the contact number to null
    public Student() {
        this.contactNumber = null;
    }

    // Part d: Constructor that assigns a parameter value to the contact number
    public Student(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Part e: Accessor (getter) method for the contact number
    public String getContactNumber() {
        return contactNumber;
    }

    // Mutator (setter) method for the contact number
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Part f: Method to display the contact number
    public void displayContactNumber() {
        System.out.println("Contact Number: " + contactNumber);
    }
}

// Part i: Define a class Animal
class Animal {
    private String type;

    // Constructor
    public Animal(String type) {
        this.type = type;
    }

    // Display method
    public void displayType() {
        System.out.println("Animal Type: " + type);
    }
}

// Part k: Define a class Number
class Number {
    private int num1;
    private int num2;

    // Constructor
    public Number(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Display method
    public void displayNumbers() {
        System.out.println("Numbers: " + num1 + " and " + num2);
    }
}

