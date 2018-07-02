/*@author developers Nickolas Jimenez 
Week 13
 /*COP-2210 – Lab 13
Nickolas Jimenez

Note: In all of the exercises, assume that instance variables are private.
Question # 3) Write a program that defines and tests a class Rectangle. 
In the class, there must be methods to calculate the area, to calculate 
the perimeter, and to print the information of the rectangle. 
Choose appropriately the instance variable(s) for this real-world object.  

*/
import java.util.Random;

public class Lab13_3{
    public static void main(String[] args){
        
        new Lab13_3();
        
    }
    
    public Lab13_3(){
        
        Rectangle test = new Rectangle();
        
        test.printArea();
        test.printPerimeter();
        test.setSide1(10);
        test.setSide2(20);
        test.printArea();
        test.printPerimeter();
        
        test.setSide1(new Random().nextInt(10));
        System.out.println("New side 1 = " + test.getSide1());
        test.setSide2(new Random().nextInt(10));
        System.out.println("New side 2 = " + test.getSide2());
        test.printArea();
        test.printPerimeter();
                
    }
        
        
}