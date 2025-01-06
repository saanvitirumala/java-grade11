/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calendartest;

import java.util.Scanner;
public class CalendarTest {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        while(true){
       
        
        System.out.println("What day was the first day of the month?(-1 to quit, 0 for Mon, 1 for Tues, ect)");
        int firstDay = input.nextInt();
        if(firstDay == -1){
            break;
        }
        System.out.println("How many days are in the month?");
        int daysPerMonth = input.nextInt();
        
        System.out.println("M\tT\tW\tTH\tF\tS\tSU\t");
       
            for(int i=1; i<=firstDay; firstDay++){
            
          
            System.out.print("\t"+firstDay);
             
            }
            
            for (int x=1; x<=daysPerMonth; x++){
                
            }
            
           
            
            
            
        }
    }
    
}
