/*@author developers Nickolas Jimenez 
Week 10
 */
/*COP-2210 – Lab 10
Nickolas Jimenez

Question # 2)Write a getChar method that asks the user to enter 
a character and then returns it. Test your method.
 */
import java.util.Scanner;

public class Lab10_2 {

    public static void main(String[] args) {
        new Lab10_2();
    }

    public Lab10_2() {
        System.out.println("The character you entered is: " + getChar());
    }

    public char getChar() {
        System.out.print("Please insert a character: ");
        Scanner input = new Scanner(System.in);
        char myChar = input.next().charAt(0);
        return myChar;

    }

}
