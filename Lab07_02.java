/*@author developers Nickolas Jimenez 
Week 7
 */
/* COP-2210 – Lab 7
Nickolas Jimenez

Question # 2 - A variation of E6.2 a. Write a program that computes the sum of 
all even numbers between 2 and 100 (inclusive), using a DO-WHILE loop.

*/

public class Lab7_2
{
    public static void main(String args[])
    {
        int sum = 0;
        int i = 2;
        do{           
            if (i%2 == 0){
                sum += i;
            }
           i = i+2;            
        }
            while(i<=100);        
        System.out.println(sum);                   
    }
}