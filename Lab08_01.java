/*@author developers Nickolas Jimenez 
Week 8
 */
/*COP-2210 – Lab 8
Nickolas Jimenez

Question # 1) Write a program that fills an array with 10 random integers in [1, 20], asks the user to provide a value, 
and counts how many numbers in the array are equal to the value entered by the user. */

import java.util.Random;
import java.util.Scanner;

public class Lab8_1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        Random rand = new Random();
        int[] randomInt = new int[10];

        System.out.print("Please insert a value: ");
        System.out.println();
        int value = in.nextInt();

        int counter = 0;

        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i] = rand.nextInt(20) + 1;
            System.out.print(randomInt[i] + " , ");

            if (value == randomInt[i]) {
                counter++;
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("There are " + counter + " matches in your array.");
        System.out.println();
    }
}
