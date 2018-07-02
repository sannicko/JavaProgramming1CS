/*@author developers Nickolas Jimenez 
Week 6
 */

import java.util.Scanner;

//3) E6.2 d. Write a program that computes the sum of all odd numbers between a and b (inclusive), 
//where a and b are inputs.
public class Lab6_03
{
    public static void main (String args[])
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Please insert first number: ");
        int a = input.nextInt();
        System.out.print("Please insert a larger number: ");
        int b = input.nextInt();
        
        int sum = 0;
        for(int i =a; i<=b; i++)
        {
            if (i%2==1)
            {
                sum +=i;
            }
            
        }
        System.out.println("The sum of all odd numbers between your inputs is: "+ sum);
        
    }
}