/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package castlemain;

import java.util.Scanner;
public class CastleMain {


public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please type in size stairway vrooooo 1.0<= YOUR INPUT <=200.0 :");
    int size = input.nextInt();
    if (size<1.0 || size>200){
        System.out.println("Bro it's not between the boundries try again bucko");
        
    }else{
        for(int i=1; i<=size; i++){
            for(int k=1; k<=size-i; k++){
                System.out.print("    ");
            }
            for(int l=1; l<= i; l++){
                System.out.print("+---");
            }
            System.out.print("+");
            
            System.out.println("");
            
            for(int m=1; m<=size-i; m++){
                System.out.print("    ");
            }
            
            for(int n=1; n<=i; n++){
                System.out.print("|   ");
            
            }
            System.out.print("|");
            System.out.println("");
            
        }
        for(int x =1; x<=size; x++){
           System.out.print("+---"); 
        }
        System.out.print("+");
        System.out.println("");
        
        

            
        
        
    }
    
        
    }
    
}
