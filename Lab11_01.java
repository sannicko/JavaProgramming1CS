/*@author developers Nickolas Jimenez 
Week 11
 */
/*COP-2210 – Lab 11
Nickolas Jimenez

Question #  
Given an array, write methods that perform the following tasks:
1. Populate the first n locations of the array
2. Print elements of the array between two locations
3. Print in reverse elements of the array between two locations 
4. Count the number of occurrences of an element
5. Copy the array
*/


import java.util.Random;
import java.util.Scanner;

public class Lab11_01 {

    public static void main(String[] args) {
        new Lab11_01();
    }

    public Lab11_01() {

        int[] a = new int[50];
        int[] copyArray = new int[50];
        int loc1, loc2;
        int element;

        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Populate the first n locations of the array");
            System.out.println("2. Print elements of the array between two locations");
            System.out.println("3. Print in reverse elements of the array between two locations");
            System.out.println("4. Count the number of occurrences of an element");
            System.out.println("5. Copy the array");
            System.out.println("6. Exit");

            System.out.print("\nEnter your choice: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter n: ");
                    int n = in.nextInt();
                    fillArray(a, n);
                    break;

                case 2:
                    System.out.print("Enter the two locations: ");
                    loc1 = in.nextInt();
                    loc2 = in.nextInt();
                    printArrayElements(a, loc1, loc2);
                    break;

                case 3:
                    System.out.print("Enter the two locations: ");
                    loc1 = in.nextInt();
                    loc2 = in.nextInt();
                    prinArrayElementsInReverse(a, loc1, loc2);
                    break;

                case 4:
                    System.out.print("Enter the value of an element: ");
                    element = in.nextInt();
                    System.out.println("It is " + countOccurrences(a, element) + " times in the array\n");
                    break;
                case 5:
                    copyArray = copy(a);
                    System.out.print("Copied! -> ");
                    printArrayElements(copyArray, 0, copyArray.length - 1);
            }

        } while (choice != 6);
    }

    //1. populate the first n locations of the array
    public void fillArray(int[] a, int total) {
        Random rnd = new Random();
        for (int i = 0; i < total; i++) {
            a[i] = rnd.nextInt(10);
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }

    //2. print elements of the array between two locations
    public void printArrayElements(int[] a, int loc1, int loc2) {
        for (int i = loc1; i <= loc2; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    //3. print in reverse elements of the array between two locations
    public void prinArrayElementsInReverse(int[] a, int loc1, int loc2) {
        for (int i = loc2; i >= loc1; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }

    //4. count the number of occurences of an element
    public int countOccurrences(int[] a, int element) {

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                count++;
            }
        }
        return count;
    }

    //5. Copy an array
    public int[] copy(int[] a) {
        //return new int[1];
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;

    }
}
