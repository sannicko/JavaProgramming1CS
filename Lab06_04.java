/*@author developers Nickolas Jimenez 
Week 6
 */

import java.util.Scanner;

//4) E6.4 c. Write a program that reads a line of input as a string 
//and prints the string, with all vowels replaced by an underscore.
public class Lab6_04 {

    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type a string: ");
        String a = input.nextLine();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                System.out.print("_");
            } else {
                System.out.print(a.charAt(i));
            }

        }

    }
}
