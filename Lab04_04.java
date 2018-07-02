/*@author developers Nickolas Jimenez 
Week 4
 */
/*COP-2210 – Lab 04
Nickolas Jimenez
Question # 4 -  E5.9 A compass needle points a given number of degrees away from North, 
measured clockwise. Write a program that reads the angle and prints out the nearest 
compass direction; one of N, NE, E, SE, S, SW, W, NW. In the case of a tie, prefer 
the nearest principal direction (N, E, S, or W).*/

import java.util.*;

public class Lab04_04
{
    public static void main (String args[])
    {
       Scanner input = new Scanner (System.in);
       System.out.println("Please insert the degrees: ");
       double degrees = input.nextDouble();

       if (degrees <337.5 &&  degrees <=22.5)
       {
        System.out.println("NORTH");
        }
       else if (degrees > 22.5 && degrees <=67.5)
        {
        System.out.println("NORTH EAST");
        }
       else if (degrees > 67.5 && degrees <=112.5)
        {
        System.out.println("EAST");
        }
       else if (degrees > 112.5 && degrees <=157.5)
        {
        System.out.println("SOUTH EAST");
        }
       else if (degrees > 157.5 && degrees <=202.5)
        {
        System.out.println("SOUTH");
        }
       else if (degrees > 202.5 && degrees <=247.5)
        {
        System.out.println("SOUTH WEST");
        }
       else if (degrees > 247.5 && degrees <=292.5)
        {
        System.out.println("WEST");
        }
       else if (degrees > 292.5 && degrees <=337.5)
        {
        System.out.println("NORTH WEST");
        }
        
    }
}