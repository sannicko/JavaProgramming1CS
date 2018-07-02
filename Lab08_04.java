/*@author developers Nickolas Jimenez 
Week 8
 */
/*COP-2210 – Lab 8
Nickolas Jimenez

Question # 4)  A variation of E7.10 i Write a program that determines if 
an array contains two adjacent duplicate elements.
 */
import java.util.Random;

public class Lab8_4 {

    public static void main(String[] args) {
        int randomIntegers[] = new int[10];
        boolean adjacent = false;
        Random rand = new Random();

        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] = rand.nextInt(20);
            System.out.print(randomIntegers[i] + " ");
        }
        for (int i = 0; i < randomIntegers.length; i++) {
            while (i < randomIntegers.length - 1) {
                if (randomIntegers[i] == randomIntegers[i + 1]) {
                    adjacent = true;
                }
                break;
            }
        }
        if (adjacent) {
            System.out.println();
            System.out.println("Yes, there are two adjacent duplicate elements");
        } else {
            System.out.println();
            System.out.println("No, there are NOT adjacent duplicate elements");
        }
        System.out.println();

    }
}
