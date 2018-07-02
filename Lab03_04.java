/*@author developers Nickolas Jimenez 
Week 3
 */

import java.text.DecimalFormat;
import java.util.*;
/* 4) Write a program that computes the length of the hypotenuse of a right triangle. 
The program will prompt the user first to enter the lengths of the other two sides 
of the triangle. Round your output to one decimal place (use the DecimalFormat class). */
public class Lab03_04
{
    public static void main(String args[])
    {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Please insert the length of side1: ");
        int sidea = input.nextInt();
        
        System.out.print("Please insert the length of side2: ");
        int sideb = input.nextInt();
        
        double hypotenuse = Math.sqrt(Math.pow(sidea,2) + (Math.pow(sideb, 2)));
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(1);        
        
        System.out.println("The hypotenuse of the right triangle is: " + df.format(hypotenuse));
    }
}