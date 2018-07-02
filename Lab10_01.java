/*@author developers Nickolas Jimenez 
Week 10
 */
/*COP-2210 – Lab 10
Nickolas Jimenez

Question # 1) Write a printDate method that displays the current date. 
No value to be passed or returned. Test the method by invoking it from 
the class constructor.
 */
import java.util.Date;

public class Lab10_1 {

    public static void main(String[] args) {
        new Lab10_1();
    }

    public Lab10_1() {
        printDate();
    }

    public void printDate() {
        Date date = new Date();
        System.out.println("Today is " + date.toString());
    }
}
