/*Print Permutations of a String

Given a string, find and print all the possible permutations of the input string.
Note : The order of permutations are not important. Just print them in different lines.
Sample Input :
abc
Sample Output :
abc
acb
bac
bca
cab
cba
*/

public class solution {
 private static void permutation(String prefix, String input) {
    int n = input.length();
    if (n == 0) System.out.println(prefix);
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + input.charAt(i), input.substring(0, i) + input.substring(i+1, n));
    }
  }
	
	public static void permutations(String input){
		// Write your code here
    permutation("", input); 
	}
}
