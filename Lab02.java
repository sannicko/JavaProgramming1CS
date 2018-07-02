/*COP-2210 – Lab 2
Nickolas Jimenez
Week 2 */

import java.util.*;

public class Lab2
{
    public static void main (String arg[])
    {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter your email address: ");
        String email = in.nextLine();
        System.out.print("Enter your postal address: ");
        String postalcode = in.nextLine();
        String output = email +" "+ postalcode;
        System.out.println(output);
        
        //3)Write a program that prompts the user for two doubles and then prints their average.
        
        System.out.print ("Enter a number: ");
        double d = in.nextDouble ();
        
        System.out.print ("Enter another number: ");
        double d2 = in.nextDouble ();
        double average = (d+d2)/2;
        
        System.out.println("The average is :" + average);
        
        //2)Write a program that displays the dimensions of a letter-size (8.5 × 11 inches) sheet of paper in millimeters. There are 25.4 millimeters per inch.

        System.out.println("The dimension of a letter-size in millimeters " + (8.5*25.4)+ " by " + (11*25.4) + " "+ "millimeters");
        
        //4)Write a program that asks the user for the lengths of a rectangle’s sides. Then print the area and the perimeter of the rectangle.
        
        System.out.print ("Enter one lenght of rectangle: ");
        double length1 = in.nextDouble();
        
        System.out.print ("Enter the other lenght of rectangle: ");
        double length2 = in.nextDouble();
        
        double area = (length1*length2);
        double perimeter = (2*(length1*length2));
        
        System.out.println("The area of the rectangle is = " +" " + area);
        System.out.println("The perimeter of the rectangle is = " +" " + perimeter);
                
    }


}