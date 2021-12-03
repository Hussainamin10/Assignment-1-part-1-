/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg2;

import java.util.Scanner;

/**
 *
 * @author Hussain Amin
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner barca = new Scanner(System.in);
       
       
       System.out.print("Please enter the item price: ");
       double price = barca.nextDouble();
       
       
       System.out.print("Please enter the discount ratio (5 for 5%): ");
       double discount = barca.nextDouble();
        
       
       double fedTax = 5;
       double provTax = 9.975;
       
       
       double discountedPrice = price - ( price * discount / 100 );
       double fedTaxed = discountedPrice * fedTax / 100;
       double provTaxed = discountedPrice * provTax / 100;
       double finalPrice = discountedPrice + provTaxed + fedTaxed;
       
       
       System.out.printf("\n%-20s %s %.2f \n","Original Price",":", price);
       System.out.printf("%-20s %s %.2f \n","Discount ratio",":", discount);
       System.out.printf("%-20s %s %.2f \n","Price Before Tax",":",discountedPrice);
       System.out.println("-------------------------------");
       System.out.printf("%-20s %s %.2f \n","Federal Tax",":", fedTaxed);
       System.out.printf("%-20s %s %.2f \n","Provincial Tax",":", provTaxed);
       System.out.printf("%-20s %s %.2f \n","Final Price",":", finalPrice);

    }
    
}
