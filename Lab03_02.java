/*@author developers Nickolas Jimenez 
Week 3
 */
import java.util.*;

public class Lab03_02
{
    public static void main(String args[])
    {
        Scanner input = new Scanner (System.in);
        
        /*2) Write a Java program that asks the user to enter a phrase with a 
        word repeated 3 times in it,  and three different words to use as 
        a replacement. */
        
        System.out.print("Please insert a phrase with a word repeated 3 times: ");
        String phrase = input.nextLine();
        
        System.out.print("Please insert repeated word: ");
        String repeated = input.nextLine();
        
        System.out.print("Please insert a word to replace 1st repeated word: ");
        String repeatedOne = input.nextLine();
        
        System.out.print("Please insert a word to replace 2st repeated word: ");
        String repeatedTwo = input.nextLine();
        
        System.out.print("Please insert a word to replace 3rd repeated word: ");
        String repeatedThree = input.nextLine();
        
        phrase = phrase.replaceFirst(repeated, repeatedOne);
        phrase = phrase.replaceFirst(repeated, repeatedTwo);
        phrase = phrase.replaceFirst(repeated, repeatedThree);
        
        System.out.println(phrase);    
        
        
        
        
    }
}