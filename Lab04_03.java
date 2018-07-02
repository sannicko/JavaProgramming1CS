/*@author developers Nickolas Jimenez 
Week 4
 */

/*COP-2210 – Lab 04
Question # 3 -  E5.4 Write a program that reads three numbers and prints 
“all the same” if they are all the same, “all different” if they are all different, 
and “neither” otherwise.*/

import java.util.*;

public class Lab04_03
{
    public static void main (String args[])
    {
       Scanner input = new Scanner (System.in);
       System.out.print("Pleaser insert 1st number: ");
       
       int number1 = input.nextInt();

       System.out.print("Pleaser insert 2nd number: ");
       int number2 = input.nextInt();

       System.out.print("Pleaser insert 3rd number: ");
       int number3 = input.nextInt();

       if (number1 == number2 && number2 == number3)
       {
            System.out.println("All numbers are the same");
        }

        else if (number1 != number2 && number2 != number3)
        {
            System.out.println("All numbers are different. ");
        }
        else 
        {
            System.out.println("Neither");

        }
        
    }
}