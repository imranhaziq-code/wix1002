package L9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L9Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter date of birth (DD/MM/YYYY): ");
        String dateOfBirth = scanner.nextLine();

        Student student = new Student(name, gender, dateOfBirth, "course.txt");

        System.out.println("\nStudent Profile:");
        student.display();

        student.displayCourses();
    }
}

class PersonProfile {
    private String name;
    private String gender;
    private String dateOfBirth;

    public PersonProfile(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public void display() {
        System.out.printf("Name: %s\nGender: %s\nDate of Birth: %s\n", name, gender, dateOfBirth);
    }
}

class Student extends PersonProfile {
    private String[] courseCode;
    private String[] courseName;
    private String[] session;
    private String[] semester;
    private int[] mark;
    private int courseCount;

    public Student(String name, String gender, String dateOfBirth, String fileName) {
        super(name, gender, dateOfBirth);
        readCoursesFromFile(fileName);
    }

    private void readCoursesFromFile(String fileName) {
        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            courseCount = 0;
            courseCode = new String[100];
            courseName = new String[100];
            session = new String[100];
            semester = new String[100];
            mark = new int[100];

            while (fileScanner.hasNextLine()) {
                courseCode[courseCount] = fileScanner.nextLine();
                courseName[courseCount] = fileScanner.nextLine();
                session[courseCount] = fileScanner.nextLine();
                semester[courseCount] = fileScanner.nextLine();
                mark[courseCount] = Integer.parseInt(fileScanner.nextLine());
                courseCount++;
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
    
public String getGrade(int mark) {
        if (mark >= 85) return "A";
        else if (mark >= 75) return "A-";
        else if (mark >= 70) return "B+";
        else if (mark >= 65) return "B";
        else if (mark >= 60) return "B-";
        else if (mark >= 55) return "C+";
        else if (mark >= 50) return "C";
        else if (mark >= 45) return "D";
        else if (mark >= 35) return "E";
        else return "F";
    }

    public void displayCourses() {
        System.out.println("\nCourse Details:");
        for (int i = 0; i < courseCount; i++) {
            System.out.printf("Course Code: %s\nCourse Name: %s\nSession: %s\nSemester: %s\nMark: %d\nGrade: %s\n\n",
                    courseCode[i], courseName[i], session[i], semester[i], mark[i], getGrade(mark[i]));
        }
    }
}