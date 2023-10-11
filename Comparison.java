/* Java Coding Exercise 2 Part 1
   String Comparison
   Fall 2023
   Student: Cole Dombrowski
   Date: 9/20/2023
*/

package dombrowski.cole.jce2;

import java.util.Scanner;

public class Comparison
{
   public static void main(String[] args)
   {
      // String to compare with
      String course = "BCIS 3680";
            
      System.out.println("***** Comparing strings *****");
      System.out.println("We\'ll compare with the string \"BCIS 3680\"");
      
      // Get the string to compare
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter a course number to compare: ");
      String compStr = kb.nextLine();
      
      // INCORRECT way to compare the CONTENTS of two strings
      if ( compStr == course)
      {
            System.out.println("The two strings are the same object");
      }
      else
      {
          System.out.println("The two strings are different objects");
      }
      
      // CORRECT way to compare the CONTENTS of two strings
      // Case-sensitive comparison
      if ( compStr.equals( course))
      {
          System.out.println("The two strings contain the same text including case.");
      }
      else
      {
          System.out.println("The two strings do not contain the same text including case.");
      }
      
      // Non-case sensititve comparison
      if (compStr.equalsIgnoreCase(course))
      {
        System.out.println("The two strings contain the same text, ignoring case.");    
      }
      else
      {
         System.out.println("The two strings do not contain the same text, ignoring case.");  
      }
   
      }  
}