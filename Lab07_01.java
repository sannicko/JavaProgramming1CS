/*@author developers Nickolas Jimenez 
Week 7
 */
/* COP-2210 – Lab 7
Nickolas Jimenez

Question # 1 - A variation of E6.2 c. Write a program that computes all powers of 2 
from 20 up to 220, using a WHILE loop.
*/


public class Lab7_1
{
    public static void main(String args[])
    {
        int i = 0;
        while ( i<=20){
            System.out.println(Math.pow(2,i));
            i++;
        }
    }
}