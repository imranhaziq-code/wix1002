package T4;

public class Q3 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        
        for (int i = 0; i < 10; i++){
            System.out.print(a+" ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
