/*Check AB

Suppose you have a string made up of only 'a' and 'b'. Write a recursive function that checks if the string was generated using the following rules:
a. The string begins with an 'a'
b. Each 'a' is followed by nothing or an 'a' or "bb"
c. Each "bb" is followed by nothing or an 'a'
If all the rules are followed by the given string, return true otherwise return false.
Sample Input:
abb
Sample Output:
true
*/

public class Solution {

	public static boolean checkAB(String input) {
		// Write your code here
 if (input == null ||input.isEmpty()) return false;

  
  while (! input.isEmpty()) {
    
    if (input.charAt(0) != 'a') {
      return false;
    }

   
    if (input.length() >= 3 && "abb".equals(input.substring(0,3))) {
      input = input.substring(3);
    } else {
      input = input.substring(1);
    }
  }
 
  return true;
	}
}
