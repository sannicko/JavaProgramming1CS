
public class Square {

    public double length = 4;

    public double area() {
        return Math.pow(length, 2);
    }

    public void printSquare() {
        System.out.println("The area of the square with a side length of " + length + ", is " + area());
    }
}
