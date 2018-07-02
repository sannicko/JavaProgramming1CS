/*@author developers Nickolas Jimenez 
Week 5
 */
import java.util.Scanner;

public class Lab5_2
{
    public static void main(String args[])
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Please insert the grade: ");
        char grade = input.next().toUpperCase().charAt(0);
        
        switch (grade)
        {
            case 'A': System.out.println("EXCELLENT");
            break;
            case 'B': System.out.println("GOOD");
            break;
            case 'C': System.out.println("You can do better!");
            break;
            case 'D': case 'F': System.out.println("I’m afraid that’s not good");
            break;
            default: System.out.println("Input Error! Please input A,B,C OR D");                        
        }                                 
    }
}