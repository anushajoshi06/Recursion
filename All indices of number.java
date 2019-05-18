/*All Indices of Number

Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format : indexes where x is present in the array (separated by space)
Constraints : 1 <= N <= 10^3
Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4
*/

public class Solution {
public static int[] Indices(int input[],int num,int start)
{ 
if(start==input.length) {
int ans[]=new int[0]; // Base Case
return ans;	
}
int smallAns[]=Indices(input,num,start+1);
if(input[start]==num) {
int ans[]=new int[smallAns.length+1];
ans[0]=start;
for(int i=0;i < smallAns.length; i++){
ans[i+1]=smallAns[i];
}
return ans;

}
return smallAns;	
}

	public static int[] allIndexes(int input[], int x) {
	return Indices(input, x,0) ;
	}
	
}