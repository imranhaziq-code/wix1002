package T4;


public class Q1a {
    public static void main(String[] args) {
        int n = 0;
        while ((n * n * n) < 2000){
            n++;
        }
        System.out.println("Largest integer n: "+(n-1));
    }
}
