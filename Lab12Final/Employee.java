
import java.util.Scanner;

public class Employee {

    String firstName = "Nickolas";
    String lastName = "Jimenez";
    double salary = 30000;

    public void printEmployee() {
        System.out.println(firstName + lastName + "'s current salary is: " + salary);
    }

    public void raiseSalary() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount to raise the salary by: ");
        double raise = in.nextDouble();
        salary += raise;
        System.out.println(firstName + lastName + "'s salary has been raised by " + raise + "; " + "his new salary is: " + salary);
    }
}
