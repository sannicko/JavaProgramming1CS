/*@author developers Nickolas Jimenez 
Week 9
 */
/*COP-2210 – Lab 9
Nickolas Jimenez

Question # 2) Write a Java program that adds two 4x4 matrices and prints the 
resulting matrix. For example:
0127 1102 1229 [6 0 3 1] + [3 4 5 0] = [9 4 8 1] 3120 3267 6387 5144 4032 9176
Use two-dimensional arrays to store the elements of the matrices. 
Your program should initialize the matrices in the declaration line. */

import java.util.Random;

public class Lab9_2 {

    public static void main(String[] args) {

        Random rand = new Random();

        int arrayOne[][] = new int[4][4];
        int arrayTwo[][] = new int[4][4];
        int arrayThree[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arrayOne[i][j] = rand.nextInt(6);
                System.out.print(arrayOne[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arrayTwo[i][j] = rand.nextInt(5);
                System.out.print(arrayTwo[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arrayThree[i][j] = arrayOne[i][j] + arrayTwo[i][j];
                System.out.print(arrayThree[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
