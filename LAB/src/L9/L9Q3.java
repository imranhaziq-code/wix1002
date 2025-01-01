package L9;

import java.io.*;
import java.util.Scanner;

public class L9Q3 {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("Dr. Smith", "L001");
        try {
            lecturer.loadCoursesFromFile("lecturer.txt");
            lecturer.computeCreditHours();
            System.out.println("Lecturer Profile:");
            lecturer.displayProfile();
            System.out.println("\nCourse Profiles:");
            lecturer.displayCourses();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

class PersonProfile {
    private String name;
        private String id;

        public PersonProfile(String name, String id) {
            this.name = name;
            this.id = id;
        }

        public void displayProfile() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
        }
}

class Course {
    private String courseCode;
        private String courseName;
        private String session;
        private String semester;
        private int creditHour;
        private int numberOfStudents;

        public Course(String courseCode, String courseName, String session, String semester, int creditHour, int numberOfStudents) {
            this.courseCode = courseCode;
            this.courseName = courseName;
            this.session = session;
            this.semester = semester;
            this.creditHour = creditHour;
            this.numberOfStudents = numberOfStudents;
        }

        public int getNumberOfStudents() {
            return numberOfStudents;
        }

        public int getCreditHour() {
            return creditHour;
        }

        public void setCreditHour(int creditHour) {
            this.creditHour = creditHour;
        }

        @Override
        public String toString() {
            return "Course Code: " + courseCode +
                   "\nCourse Name: " + courseName +
                   "\nSession: " + session +
                   "\nSemester: " + semester +
                   "\nCredit Hour: " + creditHour +
                   "\nNumber of Students: " + numberOfStudents + "\n";
        }
}

class Lecturer extends PersonProfile {
    private Course[] courses;
        private int courseCount;

        public Lecturer(String name, String id) {
            super(name, id);
            this.courses = new Course[10]; // Fixed size array
            this.courseCount = 0;
        }

        public void loadCoursesFromFile(String fileName) throws FileNotFoundException {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                String courseCode = scanner.nextLine();
                String courseName = scanner.nextLine();
                String session = scanner.nextLine();
                String semester = scanner.nextLine();
                int creditHour = Integer.parseInt(scanner.nextLine());
                int numberOfStudents = Integer.parseInt(scanner.nextLine());
                courses[courseCount++] = new Course(courseCode, courseName, session, semester, creditHour, numberOfStudents);
            }
            scanner.close();
        }

        public void computeCreditHours() {
            for (int i = 0; i < courseCount; i++) {
                Course course = courses[i];
                int numStudents = course.getNumberOfStudents();
                if (numStudents >= 150) {
                    course.setCreditHour(course.getCreditHour() * 3);
                } else if (numStudents >= 100) {
                    course.setCreditHour(course.getCreditHour() * 2);
                } else if (numStudents >= 50) {
                    course.setCreditHour((int) (course.getCreditHour() * 1.5));
                }
            }
        }

        public void displayCourses() {
            for (int i = 0; i < courseCount; i++) {
                System.out.println(courses[i]);
            }
        }
}