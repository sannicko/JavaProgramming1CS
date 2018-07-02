
public class Square {

    private double length;
    
    //default constructor
    public Square()
    {
        length = 4;
    }
    
    //parameterized constructor
    public Square(double l)
    {
        length = l;
    }
   
    
    //accesor
    public double getLength()
    {
        return length;
    }
    
    //mutator
    public void setLength(double l)
    {
        length = l;
    }
        

    public double area() {
        return Math.pow(length, 2);
    }
    
    //toString method
    public String toString() {
        return "The area of the square with a side length of " + length + ", is " + area();
    }
}
