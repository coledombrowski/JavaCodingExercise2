/* 
   Java Coding Exercise 2 Part 2
   Essential Character-related Methods
   Fall 2023
   Student: Cole Dombrowski
   Date: 9/20/2023
 */

package dombrowski.cole.jce2;

public class Characters
{
    public static void main(String[] args)
    {
        String magic = "abracadabra";
        int charPos = -1;

        // Find out the number of characters in a string, i.e., length of the string
        int numOfChars = magic.length();
        System.out.println("The string has " + numOfChars + "characters.");
        
        // Find the index of the first occurrence of 'a'
        charPos = magic.indexOf('a');
        System.out.println("The first a in the string has the index of " +
                charPos + ".");
        
        // Find the index of the last occurrence of 'a'
        System.out.println("The last a in the string has the index of " +
                magic.lastIndexOf('a') + ".\n");
        
        // Find the indexes of all occurrences of 'a'
        System.out.println("The character a appears at the following positions:");
        
        // When no match of 'a' is found, charPos remains -1 and this loop will be skipped.
        // As long as there is one occurrence, then the loop will be run at least once.
        while (charPos != -1)
        {
            System.out.println(charPos);
            charPos = magic.indexOf('a', charPos + 1);
        }
                        
        // Find the character at the beginning and the end of the string
        System.out.println("\nThe first character is " + magic.charAt(0) + ".");
        System.out.println("\nThe last character is " + magic.charAt(magic.length() - 1) + ".");

        // Call the displayChars() method to display characters in the string
        displayChars(magic);
    }

    public static void displayChars(String s)
    {

        // Listinging all characters in the string.
        // The String class contains a toCharArray() and a getChars() methods that
        // allow you to get characters in a strong in convenitent ways. Here, we
        // are "re-inventing the wheel" to show the use of charAt()
        for (int i = 0; i < s.length(); i++)
        {
            switch (i)
            {
                case 0:
                    System.out.print("The " + (i + 1) + "st ");
                    break;
                case 1:
                    System.out.print("The " + (i + 1) + "nd ");
                    break;
                case 2:
                    System.out.print("The " + (i + 1) + "rd ");
                    break;
                default:
                    System.out.print("The " + (i + 1) + "th ");
                    break;
            }
            System.out.println("character is: " + s.charAt(i));
        }
    }
}
