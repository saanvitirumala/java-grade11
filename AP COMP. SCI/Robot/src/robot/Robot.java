/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package robot;

import java.util.Scanner;
public class Robot {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1-10: ");
        int size = input.nextInt();
        
        for(int x=1; x<=size; x++){
            System.out.print("*_");
            System.out.print("*_");
        }
        System.out.println("*");
        
        System.out.print("/");
        for(int y=1; y<size; y++){
            System.out.print("   ");
            System.out.print("   ");           
        }
        System.out.print("\\");
        System.out.println("");
        
        System.out.print("|");
        for(int i=1; i<=size; i++){
            System.out.print("   ");  
        }  
        System.out.print("0 0");
                    
        for(int z=1; z<=size; z++){          
            System.out.print("  ");
            System.out.print("  "); 
                  
        }    
        System.out.print("|");
        System.out.println("");
        
        
    
        
        
        
    }
    
}
