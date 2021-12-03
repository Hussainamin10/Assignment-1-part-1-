/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg3;

import java.util.Scanner;

/**
 *
 * @author Hussain Amin
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner barca = new Scanner(System.in);
        
        
        System.out.print("Please enter a 4-digits octal number: ");
        int octalNum = barca.nextInt();
        
        
        int result = 0;
        
        
        int copy_octalNum = octalNum;
        
        
        for (int i = 0; copy_octalNum > 0; i++) {
        
            
        int ld = copy_octalNum % 10;
       
            
        double power = Math.pow(8,i);
                
            
        result += (ld * power);
        copy_octalNum =copy_octalNum/ 10;
       
        }
        System.out.printf("\n%-14s %s %d \n","Octal Number",":", octalNum);
        System.out.printf("%-5s %s %d \n","Decimal Number",":", result);

    }
    
}
