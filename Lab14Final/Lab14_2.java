/*@author developers Nickolas Jimenez 
Week 14
 /*COP-2210 – Lab 14
Nickolas Jimenez

Note: In all of the exercises, assume that instance variables are private.
Question # 2) Implement and test a class Employee. An employee has a first name (String), 
a last name (String) and a salary (double). A method raiseSalary and a method printEmployee 
will be implemented. The method raiseSalary will raise an employee salary by the amount 
passed to the method as an argument value.
Add a default constructor, a parameterized constructor, and a toString method to the class Employee.
 */

public class Lab14_2 {

    public static void main(String[] args) {
        new Lab14_2();
    }

    public Lab14_2() {

        Employee john = new Employee();

        john.setFirstName("Jhon");
        john.setLastName("Pan");
        john.getSalary(30000);
        System.out.println(john);
        john.raiseSalary();

        System.out.println();

    }

}
