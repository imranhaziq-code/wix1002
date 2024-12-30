package T9;



public class T9Q1 {
    
    //1a
    public static boolean compare(Student s, Teacher t) {
        if(s.getClass().equals(t.getClass()) )
            return true;
        else
            return false;
    }
    //1b
    public static boolean isClass(Student s) {
        if (s instanceof Person)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        Student student = new Student("John", 20, "Computer Science");
        Teacher teacher = new Teacher("Dr. Smith", 45, "Mathematics");

        // Test 1a: Compare student and teacher class
        System.out.println("Are Student and Teacher the same class?");
        System.out.println(compare(student, teacher)); // Output: false

        // Test 1b: Check if student is an instance of Person
        System.out.println("\nIs Student an instance of Person?");
        System.out.println(isClass(student)); // Output: true
    }

    
}
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


class Student extends Person {
    private String major;

    // Constructor
    public Student(String name, int age, String major) {
        super(name, age); // Call the constructor of Person
        this.major = major;
    }

    // Getter for major
    public String getMajor() {
        return major;
    }
}


class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age); 
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}