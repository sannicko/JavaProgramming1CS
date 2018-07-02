/*@author developers Nickolas Jimenez 
Week 14
 /*COP-2210 – Lab 14
Nickolas Jimenez

Note: In all of the exercises, assume that instance variables are private.
Question # 3) Write a program that defines and tests a class Rectangle. 
In the class, there must be methods to calculate the area, to calculate the perimeter, 
and to print the information of the rectangle. Choose appropriately the instance variable(s) 
for this real-world object and add a default constructor, a parameterized constructor, 
and a toString method.  

 */
import java.util.Random;

public class Lab14_3 {

    public static void main(String[] args) {

        new Lab14_3();

    }

    public Lab14_3() {

        Rectangle test = new Rectangle();

        System.out.println(test);
        test.setSide1(10);
        test.setSide2(20);
        System.out.println(test);

    }

}
