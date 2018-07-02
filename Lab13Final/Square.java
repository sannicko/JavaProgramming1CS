
public class Square {

    private double length = 4;
     
    //Accesor
    public double getLength()
    {
        return length;
    }
    
    //Mutator
    public void setLength(double l)
    {
        length = l;
    }
        

    public double area() {
        return Math.pow(length, 2);
    }

    public void printSquare() {
        System.out.println("The area of the square with a side length of " + length + ", is " + area());
    }
}
