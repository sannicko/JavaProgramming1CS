/*@author developers Nickolas Jimenez 
Week 7
 */
/* COP-2210 – Lab 7
Nickolas Jimenez

Question # 4) A variation of Exercise 3 in Lab 5 Write a program that presents the user a menu of four choices
, “Circle”, “Square”, “Rectangle”, and “Exit” to calculate the area of one of these geometric objects. 
Once a choice is made, the program would ask the user for the data required to do the calculation. 
For example, if the user input were “Circle”, the program would prompt the user to enter the value of 
the radius of the circle. The program will let the user run area calculations until “Exit” is entered. 
Use a WHILE or a DO-WHILE loop. */
import java.util.*;

public class Lab7_4 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String choice;
        int i = 50;
        do {
            System.out.println("Please select one of these choices: Circle, Square, Rectangle or Exit");
            choice = in.nextLine();
            
            if (choice.equalsIgnoreCase("circle")) {
                System.out.println("Enter the radious: ");
                int r = in.nextInt();
                in.nextLine();
                double area = Math.PI * Math.pow(r, 2);
                System.out.println("The area is: " + (area));
            } 
            else if (choice.equalsIgnoreCase("Square")) 
            {
                System.out.println("Enter the side: ");
                int a = in.nextInt();
                in.nextLine();
                double areaSquare = Math.pow(a,2);
                System.out.println("The are is: " + areaSquare);
            } 
            else if (choice.equalsIgnoreCase("Rectangle")) 
            {
                System.out.println("Enter side a: ");
                int sideA = in.nextInt();
                in.nextLine();
                System.out.println("Enter side b: ");
                int sideB = in.nextInt();
                in.nextLine();
                double areaRectangle = sideA*sideB;
                System.out.println("The area is: " + areaRectangle);

            } 
            else if (choice.equalsIgnoreCase("Exit")) {
                break;
            }

        } while (i > 0);

        System.out.println("Your choice is " + choice + " BYE BYE");

    }
}
