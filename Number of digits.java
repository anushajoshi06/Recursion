/*Number of Digits

Given the code to find out and return the number of digits present in a number recursively. 
But it contains few bugs, that you need to rectify such that all the test cases should pass.
Input Format : Integer n
Output Format : Count of digits
Constraints : 1 <= n <= 10^6
Sample Input :
 156
Sample Output :
3*/

import java.util.Scanner;
public class Solution {
public static void main(String[]args)
  {
    int num;

    Scanner s = new Scanner(System.in);
    num = s.nextInt();
    

    System.out.print(count(num/10));
  }

	public static int count(int n){
if(n==0){
  return 0;
}
      return 1+ count(n/10);

      
	}
  
}

