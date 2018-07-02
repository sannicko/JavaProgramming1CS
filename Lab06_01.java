/*@author developers Nickolas Jimenez 
Week 6
 */
//1) E6.2 c. Write a program that computes all powers of 2 from 20 up to 2 power 20.

public class Lab6_01 {

    public static void main(String arg[]) {
        
        System.out.println("Powers");
        for (int i = 1; i < 21; i++) {
            System.out.println(Math.pow(2, i));
        }
    }
}
