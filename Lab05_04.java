/*@author developers Nickolas Jimenez 
Week 5
 */

import java.text.DecimalFormat;
import java.util.*;

public class Lab5_4
{
    public static void main(String args[])
    {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please select one of these geometric objects: Circle, Square, Rectangle or Exit: ");
        String shape = input.nextLine().toUpperCase();
        DecimalFormat df = new DecimalFormat ();
        df.setMaximumFractionDigits(2);
                
        switch (shape)
        {
            case "CIRCLE":
            case "C":
                System.out.print("Enter the radius: ");
                int r = input.nextInt();
                double area = Math.PI * Math.pow(r,2);
                System.out.println("The area is: "+ df.format(area));
                break;
            
            case "SQUARE": 
            case "S":
                System.out.print("Enter the side: ");
                int a = input.nextInt();
                double areaSquare = Math.pow(a,2);
                System.out.println("The are is: " + areaSquare);
                break;
                
            case "RECTANGLE": 
            case "R":
                System.out.print("Enter side one: ");
                int side1 = input.nextInt();
                System.out.print("Enter side two: ");
                int side2 = input.nextInt();
                double areaRectangle = side1 * side2;
                System.out.println("The area is: " + areaRectangle);
                break;
            
            case "EXIT": 
            case "E":
                System.out.println("OK Bye, Bye...");
                break;
                
            default: System.out.println("INPUT ERROR, PLEASE TRY AGAIN");
                     
            
            
        }
        
        
       
    }
}