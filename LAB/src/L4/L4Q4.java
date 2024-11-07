package L4;

import java.util.Scanner;

public class L4Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, 2 for Tuesday, 3 for Wednesday, 4 for Thursday, 5 for Friday, 6 for Saturday): ");
        int firstDayOfYear = scanner.nextInt();

        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0)) || (year % 400 == 0);

        int[] daysInMonth = {31, (isLeapYear ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int firstDayOfMay = (firstDayOfYear + 120) % 7;    
        int firstDayOfAugust = (firstDayOfYear + 212) % 7;   

        System.out.println("\nCalendar for May:");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        for (int i = 0; i < firstDayOfMay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth[4]; day++) {
            System.out.printf("%3d ", day);
            if ((firstDayOfMay + day) % 7 == 0) 
                System.out.println();
        }
        
        System.out.println();

        System.out.println("\nCalendar for August:");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDayOfAugust; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth[7]; day++) {
            System.out.printf("%3d ", day);
            if ((firstDayOfAugust + day) % 7 == 0) 
                System.out.println(); 
        }
        System.out.println();
    }
}
