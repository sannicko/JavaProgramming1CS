/*@author developers Nickolas Jimenez 
Week 10
 */
/*COP-2210 – Lab 10
Nickolas Jimenez

Question # 4) (This exercise is a variation of the previous one) 
Write a rectangleArea, squareArea, and circleArea methods that calculate and 
return the area of a rectangle, a square, and a circle, respectively. 
These methods will have the following signature:
public double rectangleArea(double h, double w)
public double squareArea(double s)
public double circleArea(double r)
Test your methods by invoking them from the class constructor and printing in the constructor the values returned.
 */

import java.util.Scanner;

public final class Lab10_4 {

    public static void main(String[] args) {
        new Lab10_4();
    }

    public Lab10_4() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert side one of the rectangle: ");
        double h = input.nextDouble();
        System.out.print("Please insert side two of the rectangle: ");
        double w = input.nextDouble();
        rectangleArea(h, w);

        System.out.println("******************");
        System.out.println(" ");

        System.out.print("Please insert a number to calculate the square area: ");
        double s = input.nextDouble();
        squareArea(s);

        System.out.println("******************");
        System.out.println(" ");

        System.out.print("Please insert a number to calculate the cicle area: ");
        double r = input.nextDouble();
        circleArea(r);

        System.out.println(" ");

    }

    public double rectangleArea(double h, double w) {
        double rectArea = h * w;
        System.out.println("The area of the rectangle is: " + rectArea);
        return rectArea;
    }

    public double squareArea(double s) {
        double squArea = Math.pow(s, 2);
        System.out.println("The square area is: " + squArea);
        return squArea;
    }

    public double circleArea(double r) {
        double cirArea = Math.PI * Math.pow(r, 2);
        System.out.println("The circle area is: " + cirArea);
        return cirArea;
    }

}
