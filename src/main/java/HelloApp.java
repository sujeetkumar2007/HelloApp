/**
 * HelloApp - UC6 - Display "Hello" with Multiple Command-Line Arguments using 
 * substring to Remove Trailing Delimiter
 * 
 * UC 6: Display "Hello" with Multiple Command-Line Arguments using substring to 
 * Remove Trailing Delimiter - The application should accept multiple names as 
 * command-line arguments and display a personalized greeting for each user using 
 * substring to remove the trailing delimiter.
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [name1], [name2], ...!" to the 
 * console.
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author Sujeet Kumar T S
 * @version 6.0
 * @since UC1
 */

// Key Concepts for HelloApp UC6:
// 1. Enhanced For Loop: A simplified syntax for iterating over arrays or collections
//    without needing an index variable.
// 2. StringBuilder: A mutable sequence of characters used for efficient string
//    concatenation.
// 3. String Manipulation: Using methods like 'substring()' to modify strings after 
//    construction.
// 4. Trailing Character Removal: Techniques to remove unwanted characters (like a 
//    comma and space) from the end of a string after building it.
// 5. String Length: Understanding how to use the 'length()' method to determine 
//    the size of a string and manipulate it accordingly.

// Sample Code for HelloApp UC6:
// StringBuilder nameBuilder = new StringBuilder();
// for (String name : args) {
//     nameBuilder.append(name).append(", ");
// }
// if (nameBuilder.length() > 0) {
//     name = nameBuilder.substring(0, nameBuilder.length() - 2); // Remove the last ", "
// }


public class HelloApp {
    public static void main(String[] args) {
        String name = "World";
        if (args.length>0){
        StringBuilder nameBuilder = new StringBuilder();
        for(String names : args){
            nameBuilder.append(names).append(", ");
        }
        if(nameBuilder.length() > 0){
            name =nameBuilder.substring(0,nameBuilder.length() - 2);
        }
        }
        System.out.println("Hello "+name+"!");
    }
}
