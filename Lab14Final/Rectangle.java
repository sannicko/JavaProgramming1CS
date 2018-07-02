
public class Rectangle {

    private double side1;
    private double side2;

    //default constructor
    public Rectangle() {
        side1 = 4;
        side2 = 8;
    }

    //parameterized constructor
    public Rectangle(double s1, double s2) {
        side1 = s1;
        side2 = s2;
    }

    //accesor
    public double getSide1() {
        return side1;
    }

    //accesor
    public double getSide2() {
        return side2;
    }

    //mutator
    public void setSide1(double s1) {
        side1 = s1;
    }

    //mutator
    public void setSide2(double s2) {
        side2 = s2;
    }

    public double area() {
        return side1 * side2;
    }

    public double perimeter() {
        return 2 * (side1 + side2);
    }

    public String toString() {
        return "The area of the rectangle is: " + area()
                + "\nThe perimeter of the rectangle is: " + perimeter();
    }

}
