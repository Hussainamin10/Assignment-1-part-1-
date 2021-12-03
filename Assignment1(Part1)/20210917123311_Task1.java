/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg1;

import java.util.Scanner;

/**
 *
 * @author Hussain Amin
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.printf("Please enter your name: ");
        String name = scan.nextLine();
        
        
        System.out.printf("Please enter your age: ");
        int age = scan.nextInt();
        
        
        scan.nextLine();
        System.out.printf("Please enter your gender: ");
        String gender = scan.nextLine();
        
        
        System.out.printf("Please enter your department: ");
        String department = scan.nextLine();
        
        
        System.out.printf("Please enter your PI (3.1415926): ");
        double PI = scan.nextDouble();
        
        
        System.out.println();
        
        
        System.out.printf("%-20s %1s %1s \n","Name",":" ,name);
       
        
        System.out.printf("%-20s %1s %1s \n","Age",":" ,age);
       
        
        System.out.printf("%-20s %1s %1s \n","Gender", ":" ,gender);
        
        
        System.out.printf("%-20s %1s %1s \n","Department", ":" ,department);
        
        
        System.out.printf("%-20s %1s %1s \n","PI", ":" ,PI);
        
        
        
    }
    
}
