package L7;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class L7Q6 {
    public static void main(String[] args) {
        try {
            System.out.println("ProductID\tProductName\t\tQuantity\tPricePerUnit(RM)\t\tTotal(RM)");
            Scanner input1 = new Scanner(new FileInputStream("order.txt"));
            String[] order, product;
            String temp, productName = "";
            int quantity = 0;
            double price = 0;
            
            while (input1.hasNextLine()){
                temp = input1.nextLine();
                order = temp.split(",");
                quantity = Integer.parseInt(order[2]);
                Scanner input2 = new Scanner(new FileInputStream("product.txt"));
                while(input2.hasNextLine()){
                    temp = input2.nextLine();
                    product = temp.split(",");
                    if(order[1].equals(product[0])){
                        productName = product[1];
                        price = Double.parseDouble(product[2]);
                        break;
                    }
                }
                input2.close();
                System.out.printf("%-15s%-26s", order[1], productName);
                System.out.printf("%-15d%6.2f\t%23.2f\n", quantity, price, quantity * price);
            }
            input1.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found.");
        }
    }
}
