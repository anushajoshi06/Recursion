/*Replace pi (recursive)

Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
Sample Input 1 :
xpix
Sample Output :
x3.14x
Sample Input 2 :
pipi
Sample Output :
3.143.14
*/

public class solution {

	// Return the changed string
	public static String replace(String input){
		// Write your code here

      if (input.equals("") || input.length() < 2) 
        return input;
  if (input.charAt(0) == 'p' && input.charAt(1) == 'i') 
    return "3.14" + replace(input.substring(2));
  return input.charAt(0) + replace(input.substring(1));
	}
}
	