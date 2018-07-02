/*@author developers Nickolas Jimenez 
Week 3
 */

import java.util.*;

public class Lab03_01
{
    public static void main (String args[])
    {
     Scanner input = new Scanner (System.in);
     
     /*1) Write a Java program that asks the user to enter a phrase with a word 
repeated 3 times in it and a String to replace those repeated words with. 
An example of the program output:
     Enter a phrase with 3 words in it repeated: a dog, a second dog, and a third dog 
     Enter the word that is repeated: dog
Enter a string: nice cat*/
     System.out.print("Please enter a phrase with a word repeated 3 times: ");
     String phrase = input.nextLine();
     
     System.out.print("Please enter the repeated word: ");
     String word1 = input.nextLine();
     
     System.out.print("Please enter the replacement word: ");
     String word2 = input.nextLine();
     
     phrase = phrase.replaceAll(word1, word2);
     System.out.print(phrase + "\n");
     

     
     
     
     
     
     
     
    
     
     
     
    }
}




