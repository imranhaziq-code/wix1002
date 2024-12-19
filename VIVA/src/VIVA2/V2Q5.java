package VIVA2;

public class V2Q5 {
    static String[][] getStudentInfo(String[] studentID, String[] studentName, int[] marks) {
        String[][] studentInfo = new String[studentID.length][3];
        for (int i = 0; i < studentID.length; i++) {
            studentInfo[i][0] = studentID[i];
            studentInfo[i][1] = studentName[i];
            studentInfo[i][2] = String.valueOf(marks[i]);
        }
        return studentInfo;
    }

    static void printStudentInfo(String[][] studentInfo) {
        for (String[] student : studentInfo) {
            System.out.println(student[0] + " - " + student[1] + "\t: " + student[2]);
        }
    }

    static void findStudentWithHighestMarks(String[][] studentInfo) {
        int highestMarks = Integer.MIN_VALUE;
        String studentWithHighestMarks = studentInfo[0][1];

        for (String[] student : studentInfo) {
            int currentMarks = Integer.parseInt(student[2]);
            if (currentMarks > highestMarks) {
                highestMarks = currentMarks;
                studentWithHighestMarks = student[1];
            }
        }
        System.out.println(studentWithHighestMarks + ": " + highestMarks);
    }

    static double findAverage(int[] marks) {
        double sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return sum / marks.length;
    }

    static void listStudentsBelowAverage(String[][] studentInfo, double average) {
        for (String[] student : studentInfo) {
            int currentMarks = Integer.parseInt(student[2]);
            if (currentMarks < average) {
                System.out.println(student[1] + ": " + currentMarks);
            }
        }
    }

    public static void main(String[] args) {
        String[] studentID = {"S0001", "S0002", "S0003", "S0004", "S0005", "S0006"};
        String[] studentName = {"John", "Cindy", "Alex", "Ali", "Rosli", "Roger"};
        int[] mark = {59, 62, 21, 36, 85, 74};

        String[][] studentInfo = getStudentInfo(studentID, studentName, mark);

        System.out.println("List of Students and their Marks: ");
        printStudentInfo(studentInfo);

        System.out.println("\nStudent with highest marks: ");
        findStudentWithHighestMarks(studentInfo);

        double average = findAverage(mark);
        System.out.println("\nAverage mark: " + average);

        System.out.println("\nStudents scoring below the average:");
        listStudentsBelowAverage(studentInfo, average);
    }
}
