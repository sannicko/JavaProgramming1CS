/*@author developers Nickolas Jimenez 
Week 5
 */

import java.util.Scanner;

public class Lab5_1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Please insert the grade: ");
        char grade = input.next().toUpperCase().charAt(0);
        
        if (grade == 'A')
        {
            System.out.println("EXCELLENT");
        }
        else if (grade == 'B')
        {
            System.out.println("GOOD");
        }
        else if (grade == 'C')
        {
            System.out.println("You can do it better!");
        }
        else if (grade == 'D' || grade == 'F')
        {
            System.out.println("I'm afraid that's not good");
        }
        else
        {
            System.out.println("Input error, please input A,B,C,D or F");
        }
    }
}