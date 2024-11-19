package T6;

import java.util.Random;
        
public class T6Q1 {
    //Q1a
    public static int maxOfThree(int a, int b, int c) {
    return Math.max(a, Math.max(b, c));
}
    //Q1b
    public static boolean isSquareNumber(int n) {
    int sqrt = (int) Math.sqrt(n);
    return n == sqrt * sqrt;
}
    //Q1c
    public static int combination(int n, int k) {
    if (k > n) {
        return 0; 
    }
    return factorial(n) / (factorial(k) * factorial(n - k));
}

    public static int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
    }
    //Q1d
    public static boolean isPentagonal(int n) {
    double pentagonal = (1/2) * n * ((3 * n) - 1);
    return pentagonal == (int) pentagonal;
}
    //Q1e
    public static void countLettersAndDigits(String input) {
    int letterCount = 0;
    int digitCount = 0;

    for (int i = 0; i < input.length(); i++) {
        if (Character.isLetter(input.charAt(i))) {
            letterCount++;
        } else if (Character.isDigit(input.charAt(i))) {
            digitCount++;
        }
    }

    System.out.println("Number of letters: " + letterCount);
    System.out.println("Number of digits: " + digitCount);
}
    //Q1f
    public static void generateRandomNumbers(int[] numbers) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            numbers[i] = rand.nextInt(101);
        }
    }
    //Q1g
    public static void circleProperties(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
}
    //Q1h
    public static int findFirstDuplicateRandom() {
    int[] counts = new int[11];  // Array to store counts of numbers from 0 to 10
    Random rand = new Random();
    
    while (true) {
        int randomNum = rand.nextInt(11);  // Random number between 0 and 10
        counts[randomNum]++;  // Increment the count for the generated number
        
        if (counts[randomNum] > 1) {
            return randomNum;  // Return the first number that is generated twice
        }
    }
}
}

