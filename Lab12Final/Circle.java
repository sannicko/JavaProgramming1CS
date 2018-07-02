
public class Circle {

    public double radius = 1;

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void printCircle() {
        System.out.println("Radius = " + radius + ", area = " + area());
    }
}
