/*@author developers Nickolas Jimenez 
Week 13
 /*COP-2210 – Lab 13
Nickolas Jimenez

Note: In all of the exercises, assume that instance variables are private.
Question # 2) Implement and test a class Employee. An employee has a first name (String), 
a last name (String) and a salary (double). A method raiseSalary and a method printEmployee 
will be implemented. The method raiseSalary will raise an employee salary by the amount 
passed to the method as an argument value. Sample usage of the class Employee:
Employee john = new Employee(); //initial salary = 30,000 
for example john.raiseSalary(2000); //new value of salary will be 32,000  

*/


public class Lab13_2{
    public static void main(String[] args){
        new Lab13_2();
    }
    
    public Lab13_2()
    {
        
        Employee john = new Employee();
        
        john.setFirstName("Jhon");
        john.setLastName("Pan");
        john.getSalary(30000);
        john.printEmployee();
        john.raiseSalary();
                
        
    }
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}