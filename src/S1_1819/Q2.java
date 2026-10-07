package S1_1819;

import java.util.*;
import java.io.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = s.nextInt();
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        
        MatrixGenerator(n, matrix1);
        System.out.println("Matrix A");
        MatrixDisplay(n, matrix1);
        
        MatrixGenerator(n, matrix2);
        System.out.println("Matrix B");
        MatrixDisplay(n, matrix2);
        
        MatrixAddition(n, matrix1, matrix2);
        MatrixMultiplication(n, matrix1, matrix2);
    }
    
    public static void MatrixGenerator(int n, int[][] matrix) {
        Random r = new Random();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = r.nextInt(10);
            }     
        }  
    } 
    
    public static void MatrixDisplay(int n, int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void MatrixAddition(int n, int[][] matrix1, int[][] matrix2) {
        int[][] matrix3 = new int[n][n];
        System.out.println("Matrix A + B");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void MatrixMultiplication(int n, int[][] matrix1, int[][] matrix2) {
        int[][] matrix3 = new int[n][n];
        System.out.println("Matrix A X B");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            } 
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println("");
        }
    }
        
}
