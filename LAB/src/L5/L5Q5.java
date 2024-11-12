package L5;

import java.util.Random;
import java.util.Scanner;

public class L5Q5 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);
        
        int[] arr = new int[20];
        int temp;
        int countLinear = 0;
        int countBinary = 0;
        int low = 0;
        int high = arr.length - 1;
        boolean result = false;
        
        System.out.println("A list of random integer within 0 to 100");
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(101);
            if (i == (arr.length - 1)){
                System.out.print(arr[i] + "\n");
            }
            else{
                System.out.print(arr[i] + ", ");
            }
        }
        
        System.out.println("Array in descending order");
        for (int j = 0; j < arr.length; j++){
            for (int i = 0; i < (arr.length - 1); i++){
                if (arr[i] < arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            if (i == (arr.length - 1)){
                System.out.print(arr[i] + "\n");
            }
            else{
                System.out.print(arr[i] + ", ");
            }
        }
        
        System.out.print("Enter a number to search: ");
        int num = keyboard.nextInt();
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                result = true;
                System.out.println(num + " found");
                System.out.println("Linear search - " + countLinear + " loop(s)");
            }
            else{
                countLinear++;
            }
        }
        
        while(low <= high){
            int mid = (low + high) / 2;
            
            if (arr[mid] == num){
                result = true;
                System.out.println(num + " found");
                System.out.println("Binary Search - " +countBinary + " loop(s)");
                break;
            }
            else if (arr[mid] < num){
                high = mid - 1;
                countBinary++;
            }
            else{
                low = mid + 1;
                countBinary++;
            }
        }
        if (result == false){
            System.out.println("Element not found in array");
        }
    }
}