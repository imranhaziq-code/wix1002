package L8;

import java.util.Random;

public class L8Q1 {
    public static void main(String[] args) {
        Number a = new Number();  // Generate 10 random numbers between 0 and 100
        a.displayAll();
        a.displayEven();
        a.displayPrime();
        a.displayMax();
        a.displayMin();
        a.displayAverage();
        a.displaySquare();

        System.out.println();

        Number b = new Number(5);  // Generate 5 random numbers between 0 and 100
        b.displayAll();
        b.displayEven();
        b.displayPrime();
        b.displayMax();
        b.displayMin();
        b.displayAverage();
        b.displaySquare();

        System.out.println();

        Number c = new Number(4, 50);  // Generate 4 random numbers between 0 and 50
        c.displayAll();
        c.displayEven();
        c.displayPrime();
        c.displayMax();
        c.displayMin();
        c.displayAverage();
        c.displaySquare();
    }
}

class Number {
    private int[] numbers;
    
    public Number() {
        numbers = generateRandomNumbers(10,100);
    }
    
    public Number(int count) { 
        numbers = generateRandomNumbers(count, 100);
    }
    
    public Number(int count, int max) {
        numbers = generateRandomNumbers(count, max); 
    }
    
    private int[] generateRandomNumbers(int count, int max) {
        Random rand = new Random();
        int[] generatedNumbers = new int[count];
        for (int i = 0; i < count; i++){
            generatedNumbers[i] = rand.nextInt(max + 1);
        }
        return generatedNumbers;
    }
    
    public void displayAll() {
        System.out.print("All numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public void displayEven() {
        System.out.print("Even numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }

    public void displayPrime() {
        System.out.print("Prime numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void displayMax() {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max number: " + max);
    }

    public void displayMin() {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Min number: " + min);
    }

    public void displayAverage() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
    }

    public void displaySquare() {
        System.out.print("Square numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (isPerfectSquare(numbers[i])) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }

    private boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);
        return (sqrt == Math.floor(sqrt));
    }
}

