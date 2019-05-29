/*Print Subsequences

Given a string (lets say of length n), print all the subsequences of the given string.
Subsequences contain all the strings of length varying from 0 to n. But the order of characters should remain same as in the input string.
Note : The order of subsequences are not important. Print every subsequence in new line.
Sample Input:
abc
Sample Output:
"" (the double quotes just signifies an empty string, don't worry about the quotes)
c 
b 
bc 
a 
ac 
ab 
abc 
*/

public class solution {
    
   static void ListCombination(String str){
		if(str != null && str.length()!=0)
			RecCombine("",str);
	}
	
	static void RecCombine(String prefix,String rest){
		if(rest.length() == 0)
			System.out.println(prefix + " ");
		else{
			RecCombine(prefix + rest.charAt(0),rest.substring(1));
			RecCombine(prefix,rest.substring(1));
			
		}
	}
	public static void printSubsequences(String input) {
		// Write your code here
     ListCombination(input);
	}
}
