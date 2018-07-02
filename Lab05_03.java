/*@author developers Nickolas Jimenez 
Week 5
 */

import java.text.DecimalFormat;
import java.util.*;
import javax.swing.JOptionPane;

public class Lab5_3
{
    public static void main(String args[])
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Please select one of these geometric objects: Circle, Square, Rectangle or Exit: ");
        String shape = input.nextLine().toUpperCase();
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        
        if (shape.equals("CIRCLE") || (shape.equals("C")))
        {
            System.out.print("Enter the radius: ");
            int r = input.nextInt();
            double area = Math.PI * Math.pow(r,2);
            System.out.println("The area is: "+ df.format(area));
        }
        else if (shape.equals("SQUARE") || (shape.equals("S")))
        {
            System.out.print("Enter the side: ");
            int a = input.nextInt();
            double areaSquare = Math.pow(a,2);
            System.out.println("The are is: " + areaSquare);
        }
        else if (shape.equals("RECTANGLE") || (shape.equals("R")))
        {
            System.out.print("Enter side one: ");
            int side1 = input.nextInt();
            System.out.print("Enter side two: ");
            int side2 = input.nextInt();
            double areaRectangle = side1 * side2;
            System.out.println("The area is: " + areaRectangle);                  
        }
        else if (shape.equals("EXIT") || (shape.equals("E")))
        {
            System.out.println("OK Bye, Bye...");
        }
        else{
            System.out.println("You typed something different, please follow the instruccions. Thank you.");
        }
        
    }
}