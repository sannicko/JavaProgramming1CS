/*@author developers Nickolas Jimenez 
Week 8
 */
/*COP-2210 – Lab 8
Nickolas Jimenez

Question # 3) E7.5 Write a program that computes the alternating sum of all elements in an array. 
For example, if the array elements are then it computes
1 4 9 16 9 7 4 9 11
1 – 4 + 9 – 16 + 9 – 7 + 4 – 9 + 11 = –2
 */
import java.util.Random;

public class Lab8_3 {

    public static void main(String[] args) {
        Random rand = new Random();
        
        int a[] = new int[5];
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(20) + 1;
            //System.out.print(a[i] + " ");
            if (i % 2 == 0) {
                sum = sum + a[i];
                System.out.print(a[i] + " - ");
            } else {
                sum = sum - a[i];
                System.out.print(a[i] + " + ");
            }

        }
        System.out.print("= " + sum);

        System.out.println(" ");

    }
}
