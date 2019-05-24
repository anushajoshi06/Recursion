/*Remove X

Given a string, compute recursively a new string where all 'x' chars have been removed.
Sample Input 1 :
xaxb
Sample Output 1:
ab
Sample Input 2 :
abc
Sample Output 2:
abc
*/

public class solution {

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
char ch;
  if(input.length() == 0)
  	return input;
  ch = input.charAt(0);
  if(ch == 'x')
  	return removeX(input.substring(1));
  return ch +removeX(input.substring(1));
	}
}
