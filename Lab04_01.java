/*@author developers Nickolas Jimenez 
Week 4 */

/*COP-2210 – Lab 04
Question # 1 -  E5.1 Write a program that reads an integer and prints whether it is negative, 
zero, or positive.*/

import java.util.*;

public class Lab04_01
{
    public static void main (String args[])
    {
       Scanner input = new Scanner (System.in);
 
        System.out.print("Please insert a random number negative, positive or zero: ");
        int randomNumber = input.nextInt();
                
        if (randomNumber>0)
        {
            System.out.println("The number is a positive: " + randomNumber);
        }
                    
        else if (randomNumber<0)                
        {
            System.out.println("The number is negative: " + randomNumber);
        } 
        
        else {
            System.out.println("The number is zero: " + randomNumber);
        } 
    }
}