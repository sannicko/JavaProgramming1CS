/*@author developers Nickolas Jimenez 
Week 12
 /*COP-2210 – Lab 12
Nickolas Jimenez*/
public class Lab12 {

    public static void main(String[] args) {
        new Lab12();
    }

    public Lab12() {
        Square a = new Square();

        a.printSquare();
        System.out.println();

        Employee b = new Employee();

        b.printEmployee();
        b.raiseSalary();
        System.out.println();

        Rectangle c = new Rectangle();

        System.out.println("The area of the rectangle is: ");
        c.calculateArea();
        System.out.println("The perimeter of the rectangle is: ");
        c.calculatePerimeter();

    }
}
