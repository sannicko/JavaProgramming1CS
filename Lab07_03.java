/*@author developers Nickolas Jimenez 
Week 7
 */
/* COP-2210 – Lab 7
Nickolas Jimenez

Question # 3) Write a program that computes the average of a list of 
numbers entered by the user. The numbers are supposed to be in the range 50 – 100 (inclusive) 
and the user will indicate that he/she is done with data input by entering a value not in that range. 
At least one number will be in the range. Use a WHILE or a DO-WHILE loop.*/
import java.util.Scanner;

public class Lab7_3 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int num;

        do {
            System.out.print("Please insert numbers in the range 50-100: ");
            num = input.nextInt();
            if (num >= 101 || num <= 49) {
                break;
            }
            sum = sum + num;
            count = count + 1;

        }while (num >= 50 && num <= 100);
                
        int avg = sum/count;

        System.out.println("The average of your numbers is: " + avg);

    }
}
