/*Remove Duplicates

Given a string S, remove consecutive duplicates from it recursively.
Input Format :
String S
Output Format :
Output string
Constraints :
1 <= Length of String S <= 10^3
Sample Input :
aabccba
Sample Output :
abcba
*/

public class Solution {

	public static String removeConsecutiveDuplicates(String s) {

  
 

    if ( s.length() <= 1 ) return s;
    if( s.substring(1,2).equals(s.substring(0,1)) ) return removeConsecutiveDuplicates(s.substring(1));
    else return s.substring(0,1) + removeConsecutiveDuplicates(s.substring(1));
}



  

}