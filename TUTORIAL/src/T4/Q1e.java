package T4;

public class Q1e {
    public static void main(String[] args) {
        double sum = 0.0;
        double i = 1.0;
        
        while (i <= 25){
            sum+=(i / (26-i));
            i++;
        }
        System.out.printf("Sum of series: %.2f\n", sum);
    }
}
