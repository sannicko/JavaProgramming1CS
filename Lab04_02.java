/*@author developers Nickolas Jimenez 
Week 4
 */
/*COP-2210 – Lab 04
Question # 2 -  Write a Java program that determines if a person’s age is less
than 20, in the [20, 30] range, or greater than 30.*/

import java.util.*;

public class Lab04_02
{
    public static void main (String args[])
    {
       Scanner input = new Scanner (System.in);
 
        System.out.print("Please type your age: ");
        int age = input.nextInt();
        
        if (age<20)
                {
                 System.out.println("You are less than 20 years old");   
                }
        else if (age>=20 && age <=30)
                {
                    System.out.println("You are in the 20's and 30's range. You are " + age + " years old.");
                }
        else
        {
            System.out.println("You are in the 30's. You are " + age + " years old.");
        } 
    }
}