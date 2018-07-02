/*@author developers Nickolas Jimenez 
Week 8
 */
/*COP-2210 – Lab 8
Nickolas Jimenez

Question # 2) Write a program that fills an array with 20 random integers in [1, 100] 
and prints the location in the array of the smallest (the minimum) integer.

 */
import java.util.Random;

public class Lab8_2 {

    public static void main(String args[]) {

        int a[] = new int[20];
        Random rand = new Random();
        int min = 25;
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(99) + 1;
            System.out.print(a[i] + ", ");

            if (a[i] < min) {
                min = a[i];
                index = i;
            }

        }
        System.out.println();
        System.out.println();
        System.out.println("The smalles integer is: " + min + " ,the location in the array is: " + index);
        System.out.println();

    }
}
