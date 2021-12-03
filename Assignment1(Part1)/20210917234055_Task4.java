/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import java.util.Scanner;

/**
 *
 * @author hkbarca
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner barca = new Scanner(System.in);
        
        
        System.out.print("Please enter the initial balance: $");
        double initialBalance = barca.nextDouble();
        
        
        System.out.print("Please enter the annual interest rate (2 for 2%): ");
        double interestRate = barca.nextDouble();
        
        
        System.out.print("Please enter the number of years the client wants to save money in the bank: ");
        int noOfYears = barca.nextInt();
        
        
        barca.close();
        
        
        double totalBalance = initialBalance * Math.pow(1 + (interestRate/100), noOfYears);
        
        
        System.out.println();
        
        
        System.out.printf("%-23s:%9.2f\n", "Intial Balance", initialBalance);
        System.out.printf("%-23s:%8.2f%s\n", "Annual Interest Rate", interestRate, "%");
        System.out.printf("%-23s:%9d\n", "Saving Years", noOfYears);
        
        
        System.out.println("----------------------------------------");
        
        
        System.out.printf("%-23s:%9.2f\n", "Balance After 5 Years", totalBalance);
        
        
    }
    
}
