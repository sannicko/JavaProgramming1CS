/*@author developers Nickolas Jimenez 
Week 3
 */

import java.util.*;
/* Question # 3
Write a program that prompts the user for a value of x and then calculates 1􏰁x􏰁x2 􏰁x3 􏰁x4
2 6 24 */

public class Lab03_03
{
    public static void main(String args[])
    {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Insert the value of x: ");
        int x = input.nextInt();
        double result = 1 + x + (Math.pow(x,2)/2) + (Math.pow(x,3)/6) + (Math.pow(x,4)/24);
        
        System.out.println("The aprox of e to pow is:" + result );
                
        
    }
}