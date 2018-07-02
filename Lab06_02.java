/*@author developers Nickolas Jimenez 
Week 6
 */
//2) E6.2 a. Write a program that computes the sum of all even numbers between 2 and 100 (inclusive).
public class Lab6_02
{
    public static void main(String args[])
    {
        int sum = 0;
        for( int i=2; i<=100; i++ )
        {
            if(i % 2 == 0)
            {
                sum += i; 
            }
                        
        }
        System.out.println(sum);
    }
}