/*Staircase

A child is running up a staircase with n steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return all possible number of ways.
Input format :
Integer n (No. of steps)
Constraints :
n <= 30
Sample Input 1:
4
Sample Output 1:
7
*/

public class solution {

	public static int findWays(int n){
		// Write your code here
if(n == 1)
		return 1;
	else if(n == 2)
		return 2;
	else if (n == 3)
		return 4;
	else
		return  findWays(n - 1) +  findWays(n - 2) +  findWays(n - 3);

	}
}
