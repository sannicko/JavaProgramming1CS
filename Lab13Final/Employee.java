
import java.util.Scanner;

public class Employee {

    private String firstName = "Nickolas";
    private String lastName = "Jimenez";
    private double salary = 30000;
    
    //Accessor
    
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    //Mutator
    
    public void setFirstName(String N)
    {
        firstName = N;
    }
    
    public void setLastName(String Last)
    {
        lastName = Last;
    }
    
    public void getSalary(double Sal)
    {
        salary = Sal;
    }
        
    public void printEmployee() {
        System.out.println(firstName + " " + lastName + "'s current salary is: " + salary);
    }

    public void raiseSalary() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount to raise the salary by: ");
        double raise = in.nextDouble();
        salary += raise;
        System.out.println(firstName + " " + lastName + "'s salary has been raised by " + raise + "; " + "his new salary is: " + salary);
    }
}
