/*Replace Character

Given an input string S and two characters c1 and c2, you need to replace every occurrence 
of character c1 with character c2 in the given string.
Do this recursively.
Input Format :
Line 1 : Input String S
Line 2 : Character c1 and c2 (separated by space)
Output Format :
Updated string
Constraints :
1 <= Length of String S <= 10^6
Sample Input :
abacd
a x
Sample Output :
xbxcd
*/


public class Solution {

	public static String replaceCharacter(String input, char c1, char c2) {
		
  char[] c = new char [input.length()]; // O(1);



            c = input.toCharArray(); //assuming it to be O(1)
            for(int i=0;i<c.length;i++)//O(n)
            {
                if(c1==c[i]) // O(1)
                {
                    c[i] = c2; // O(1)
                }
            }

            //for(int i=0;i<c.length;i++)
                //System.out.print(c[i] + "\t");



        String s = String.valueOf(c); //// O(1)

        return s; //// O(1)
	}
}
