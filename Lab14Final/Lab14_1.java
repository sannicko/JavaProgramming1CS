/*@author developers Nickolas Jimenez 
Week 14
 /*COP-2210 – Lab 14
Nickolas Jimenez

Note: In all of the exercises, assume that instance variables are private.
Question # 1) Write a program that defines and tests a class Square. In the class, 
there must be a method to find the area of the square and a method to print the 
information of the Square object. Choose appropriately the instance variable(s) 
for this real-world object and add a default constructor, a parameterized constructor, 
and a toString method.
 */
public class Lab14_1 {

    public static void main(String[] args) {

        new Lab14_1();

    }

    public Lab14_1() {
        Square test = new Square();
        Square test1 = new Square(8);

        System.out.println(test);
        System.out.println(test1);

    }

}
