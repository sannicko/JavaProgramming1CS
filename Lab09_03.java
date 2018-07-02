/*@author developers Nickolas Jimenez 
Week 9
 */
/*COP-2210 – Lab 9
Nickolas Jimenez

Question # 3) Write a program that populates a java.util.ArrayList variable with 
10 random integers in [1, 20], asks the user to provide a value, and counts how
many numbers are equal to the value entered by the user. */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab9_3 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int count = 0;

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(20) + 1);
        }
        System.out.println(numbers);

        System.out.print("Insert a number: ");
        int userNumber = input.nextInt();

        for (int i = 0; i < numbers.size(); i++) {
            if (userNumber == numbers.get(i)) {
                count++;
            }

        }
        System.out.println("There are " + count + " number(s) equal in your Array List");

    }
}
