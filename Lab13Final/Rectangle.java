public class Rectangle{
    
    private double side1 = 4;
    private double side2 = 2;
    
    public double getSide1()
    {
        return side1;
    }
    
    public double getSide2()
    {
        return side2;
    }
    
    public void setSide1(double s1)
    {
        side1 = s1;
    }
    
    public void setSide2(double s2)
    {
        side2 = s2;
    }
    
                          
    public double area(){
        return side1*side2;       
    }
    
    public double perimeter(){
        return 2*(side1+side2);
    }
    
    public void printArea(){
        System.out.println("The area of the rectangle is: " + area());
    }
    
    public void printPerimeter(){
        System.out.println("The perimeter of the rectangle is: " + perimeter());
    }
        
}