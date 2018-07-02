/*@author developers Nickolas Jimenez 
Week 6
 */

import java.util.Scanner;

public class Lab6_05 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the length of the side: ");
        int length = input.nextInt();

        for (int i = 0; i < length; i++)
        {
            if (i == 0)
            {
                for (int j = 0; j < length; j++) {
                    if (j != length - 1)
                    {
                        System.out.print("*");
                    } else {
                        System.out.println("*");
                    }
                }
            } else if (i == length - 1)
            {
                for (int k = 0; k < length; k++) {
                    System.out.print("*");
                }
            } else {
                for (int l = 0; l < length; l++)
                {
                    if (l == 0)
                    {
                        System.out.print("*");
                    } else if (l == length - 1) 
                    {
                        System.out.println("*");
                    } else {
                        System.out.print(" "); 
                    }
                }
            }
        }
        System.out.println();
    }

}

