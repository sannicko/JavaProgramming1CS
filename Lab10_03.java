/*@author developers Nickolas Jimenez 
Week 10
 */
/*COP-2210 – Lab 10
Nickolas Jimenez

Question # 3) Write a rectangleArea, squareArea, and circleArea methods that 
calculate and print the area of a rectangle, a square, and a circle, respectively. 
These methods will have the following signature:
public void rectangleArea(double h, double w)
(h and w are the height and width of the rectangle, respectively)
public void squareArea(double s) (s is the length of the side of the square)
public void circleArea(double r) (r is the radius of the circle)
 */

public final class Lab10_3 {

    public static void main(String[] args) {
        new Lab10_3();
    }

    public Lab10_3() {
        rectangleArea(2, 4);
        squareArea(2);
        circleArea(10);
    }

    public void rectangleArea(double h, double w) {
        System.out.println("The area of the rectangle is: " + h * w);
    }

    public void squareArea(double s) {
        System.out.println("The square area is: " + Math.pow(s, 2));
    }

    public void circleArea(double r) {
        System.out.println("The circle area is: " + Math.PI * Math.pow(r, 2));
    }

}
