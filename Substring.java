/* Java Coding Exercise 2 Part 3
   Extracting Parts of a String
   Fall 2023
   Student: Cole Dombrowski
   Date: 9/20/2023
 */

package dombrowski.cole.jce2;

public class Substring
{
    public static void main(String[] args)
    {
        String fullName1 = "Jane Doe";
        String fullName2 = "John Quantus Public";
        String lastName;
        String firstName;
        
        int spaceIndex;
        
        System.out.println("***** Extracting from name string without middle name *****");
        System.out.println("The full name is " + fullName1 + ".");
        
        // Extract first name
        spaceIndex = fullName1.indexOf(' ');
        firstName = fullName1.substring(0, spaceIndex);
        System.out.println("First name is " + firstName + ".");     
        
        // Extract last name
        lastName = fullName1.substring(spaceIndex + 1);
        System.out.println("Last name is " + lastName + ".");
        
        System.out.println("\n***** Extracting from name string with middle name *****");
        System.out.println("The full name is " + fullName2 + ".");
        
        // Extract first name
        spaceIndex = fullName2.indexOf(' ');
        firstName = fullName2.substring(0, spaceIndex);
        System.out.println("First name is " + firstName + ".");
        
        // Extract last name
        spaceIndex = fullName2.lastIndexOf(' ');
        lastName = fullName2.substring(spaceIndex + 1);
        System.out.println("Last name is " + lastName + ".");
        
        System.out.println("\n");        
    }
}
