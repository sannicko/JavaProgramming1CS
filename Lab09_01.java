/*@author developers Nickolas Jimenez 
Week 9
 */
/*COP-2210 – Lab 9
Nickolas Jimenez

Question # 1) Write a Java program that fills a 3x4 matrix with random numbers in [0, 9] 
and calculates the sum of the elements in each row. 
For example:
 0327 [6 0 3 1] 5 1 4 8
sum = 12 sum = 10 sum = 18
    Use a two-dimensional array to store the matrix elements. */
import java.util.Random;

public class Lab9_1 {

    public static void main(String args[]) {
        Random rand = new Random();
        int[][] a = new int[3][4];
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = rand.nextInt(10);
                System.out.printf("%4d", a[i][j]);
                sum += a[i][j];
            }
            System.out.println(" = " + sum);
            sum = 0;
        }
    }

}
