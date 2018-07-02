
public class Sphere {

    double radius = 2;

    public double Volume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    public double SurfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    public void printVolume() {
        System.out.println("The volume of a sphere with radius " + radius + " is " + Volume());
    }

    public void printSurfaceArea() {
        System.out.println("The surface area of a sphere with radius " + radius + " is " + SurfaceArea());
    }
}
