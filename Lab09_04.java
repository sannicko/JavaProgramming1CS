/*@author developers Nickolas Jimenez 
Week 9
 */
/*COP-2210 – Lab 9
Nickolas Jimenez

Question # 4) Write a program that populates a java.util.ArrayList variable with 20 
random integers in [1, 100] and prints the location of the smallest (the minimum) integer. */

import java.util.ArrayList;
import java.util.Random;

public class Lab9_4 {

    public static void main(String[] args) {
        Random rand = new Random();
        int minLocation = 0;
        int min = 100;
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numbers.add(rand.nextInt(100) + 1);
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (min > numbers.get(i)) //
            {
                min = numbers.get(i);
                minLocation = i;
            }

        }
        System.out.println("The 20 integers in your ArrayList are:");
        System.out.println(numbers);
        System.out.println();
        System.out.println("The location of the minimum integer is: " + minLocation);

    }
}
