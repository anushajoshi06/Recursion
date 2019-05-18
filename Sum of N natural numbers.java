/*Sum of N Natural Numbers

Given an integer n, find and return the sum of numbers from 1 to n using recursion.
Input Format : Integer n
Output Format : Sum
Constraints : 1 <= n <= 10^3
Sample Input :
10
Sample Output :
55
*/

public class Solution {

	public static int sum(int n) {
		
			if(n == 0){
			return 0;
        }
  
      int ans=sum(n-1);
      return ans+n;
      
	}
}