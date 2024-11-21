package L6;

public class L6Q2 {
    public static void multiPrint(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }

    public static void printTriangle(int height, char c) {
        for (int i = 1; i <= height; i++) {
            multiPrint(height - i, ' '); 
            multiPrint(2 * i - 1, c);   
            System.out.println();
        }
    }

    public static void printDiamond(int height, char c) {
        for (int i = 1; i <= height; i++) {
            multiPrint(height - i, ' ');
            multiPrint(2 * i - 1, c);
            System.out.println();
        }
        for (int i = height - 1; i >= 1; i--) {
            multiPrint(height - i, ' ');
            multiPrint(2 * i - 1, c);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Triangle:");
        printTriangle(5, '*');

        System.out.println("\nDiamond:");
        printDiamond(5, '*');
    }
}


